package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Patient;

@Repository
public interface PatientsRepository extends JpaRepository <Patient, Long>{
    public Patient findById(Long id);
    public Patient findByEmail(String email);
    public Patient findByLogin(String login);
    public Patient findByLoginAndPassword(String login, String password);
}
