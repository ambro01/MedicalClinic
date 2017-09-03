package pl.medicalclinic.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class UserDto {
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
}
