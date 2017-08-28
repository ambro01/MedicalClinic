package pl.medicalclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.medicalclinic.DAO.PatientsRepository;

@Controller
public class MainController {
    @Autowired
    private PatientsRepository patientsRepository;

    @RequestMapping("/test")
    public void met(){
        System.out.println(patientsRepository.findById(1L));
    }

}
