package pl.medicalclinic.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.medicalclinic.DAO.PrivilegesRepository;
import pl.medicalclinic.DAO.RolesRepository;
import pl.medicalclinic.DAO.UsersRepository;
import pl.medicalclinic.Model.Privilege;
import pl.medicalclinic.Model.Role;
import pl.medicalclinic.Model.User;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent>{

    boolean alreadySetup = false;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private PrivilegesRepository privilegesRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if(alreadySetup)
            return;
        Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
        Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");

        List<Privilege> adminPrivileges = Arrays.asList(readPrivilege, writePrivilege);

        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

        Role adminRole = rolesRepository.findByName("ROLE_ADMIN");
        User user = new User();
        user.setUsername("admin");
        user.setEmail("admin@admin.com");
        user.setPassword(passwordEncoder.encode("admin"));
        user.setRoles(Arrays.asList(adminRole));
        user.setEnabled(true);
        usersRepository.save(user);

        alreadySetup = true;
    }

    @Transactional
    public Privilege createPrivilegeIfNotFound(String name){
        Privilege privilege = privilegesRepository.findByName(name);
        if(privilege == null){
            privilege = new Privilege(name);
            privilegesRepository.save(privilege);
        }
        return privilege;
    }

    @Transactional
    public Role createRoleIfNotFound(String name, Collection<Privilege> privileges){
        Role role = rolesRepository.findByName(name);
        if(role == null){
            role = new Role(name);
            role.setPrivileges(privileges);
            rolesRepository.save(role);
        }
        return role;
    }
}
