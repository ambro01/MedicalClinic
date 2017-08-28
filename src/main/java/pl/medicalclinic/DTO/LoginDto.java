package pl.medicalclinic.DTO;

import org.hibernate.validator.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginDto {
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
