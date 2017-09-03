package pl.medicalclinic.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.medicalclinic.DAO.DoctorsRepository;
import pl.medicalclinic.Model.Doctor;

import javax.transaction.Transactional;
import java.util.List;

@Service("doctorService")
@Transactional
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorsRepository doctorsRepository;

    public Doctor findById(Long id){
        return doctorsRepository.findById(id);
    }

    public List<Doctor> findAllDoctors(){
        return doctorsRepository.findAll();
    }
}
