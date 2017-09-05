package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Role;
import pl.medicalclinic.Model.User;

@Repository
public interface RolesRepository extends JpaRepository <Role, Long>{
    public Role findById(Long id);
    public Role findByName(String name);
}
