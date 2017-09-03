package pl.medicalclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.medicalclinic.Model.Doctor;
import pl.medicalclinic.Services.DoctorService;

import java.util.List;

@RestController
public class DoctorsController {
    @Autowired
    DoctorService doctorService;


    @RequestMapping(value = "/team/doctor/", method = RequestMethod.GET)
    public ResponseEntity<List<Doctor>> showDoctors(){
        List<Doctor> doctors = doctorService.findAllDoctors();
        if(doctors.isEmpty()){
            return new ResponseEntity<List<Doctor>>((HttpStatus.NO_CONTENT));
        }
        return new ResponseEntity<List<Doctor>>(doctors, HttpStatus.OK);
    }

}
