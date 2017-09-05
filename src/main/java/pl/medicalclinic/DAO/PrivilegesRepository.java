package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Privilege;

@Repository
public interface PrivilegesRepository extends JpaRepository <Privilege, Long>{
    public Privilege findById(Long id);
    public Privilege findByName(String name);
}
