package pl.medicalclinic.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.medicalclinic.Model.Employee;

@Repository
public interface EmployeesRepository extends JpaRepository <Employee, Long>{
    public Employee findById(Long id);
}
