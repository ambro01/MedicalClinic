package pl.medicalclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.medicalclinic.DAO.EmployeesRepository;

@Controller
public class MainController {
    @Autowired
    private EmployeesRepository employeesRepository;

    @RequestMapping("/test")
    public void met(){
        System.out.println(employeesRepository.findById(1L));
    }
}
