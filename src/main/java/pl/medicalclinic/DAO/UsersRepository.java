package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Patient;
import pl.medicalclinic.Model.User;

@Repository
public interface UsersRepository extends JpaRepository <User, Long>{
    public User findById(Long id);
    public User findByEmail(String email);
    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username, String password);
}
