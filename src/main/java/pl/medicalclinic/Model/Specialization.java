package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="specializations")
@Data //biblioteka Lombok zalatwia metody setter / getter
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
