package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Doctor;

import java.util.List;

@Repository
public interface DoctorsRepository extends JpaRepository <Doctor, Long>{
    public Doctor findById(Long id);
    public List<Doctor> findBySpecialization(String specialization);
    public List<Doctor> findAll();
}
