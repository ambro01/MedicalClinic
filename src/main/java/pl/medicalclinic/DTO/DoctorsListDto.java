package pl.medicalclinic.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import pl.medicalclinic.Model.Doctor;

import java.util.List;

@Data
public class DoctorsListDto {
    private List<Doctor> doctors;
}
