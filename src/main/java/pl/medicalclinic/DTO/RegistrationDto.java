package pl.medicalclinic.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class RegistrationDto {
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
