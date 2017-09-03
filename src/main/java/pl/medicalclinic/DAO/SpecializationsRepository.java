package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Specialization;

@Repository
public interface SpecializationsRepository extends JpaRepository <Specialization, Long>{
    public Specialization findById(Long id);

}
