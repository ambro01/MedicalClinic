package pl.medicalclinic.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.medicalclinic.DAO.RolesRepository;
import pl.medicalclinic.DAO.UsersRepository;
import pl.medicalclinic.DTO.UserDto;
import pl.medicalclinic.Model.User;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Arrays;

@Service
public class UserService {
    @Autowired
    UsersRepository usersRepository;
    @Autowired
    RolesRepository rolesRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(UserDto userDto){
        if(isUserAlreadyExist(userDto.getUsername(), userDto.getEmail())) {
            User user = new User();
            user.setUsername(userDto.getUsername());
            user.setPassword(passwordEncoder.encode(userDto.getPassword()));
            user.setEmail(userDto.getEmail());

            user.setRoles(Arrays.asList(rolesRepository.findByName("ROLE_USER")));
            user = usersRepository.save(user);
            return user;
        }
        return null;
    }

    private boolean isUserAlreadyExist(String username, String email){
        if(usersRepository.findByUsername(username) == null
                && usersRepository.findByEmail(email) == null) {
            return true;
        }
        return  false;
    }

    private final boolean isValidEmail(String email){
        boolean result = true;
            try{
                InternetAddress emailAddress = new InternetAddress(email);
                emailAddress.validate();
            } catch (AddressException ex) {
                result = false;
            }
        return result;
    }
}
