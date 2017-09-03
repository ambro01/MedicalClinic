package pl.medicalclinic.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class DoctorDto {
    private Long id;
    private String name;
    private String surname;
    private String specialization;
}
