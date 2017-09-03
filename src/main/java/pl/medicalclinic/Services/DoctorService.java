package pl.medicalclinic.Services;


import pl.medicalclinic.Model.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor findById(Long id);
    List<Doctor> findAllDoctors();
}
