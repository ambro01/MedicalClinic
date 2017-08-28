package pl.medicalclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import pl.medicalclinic.DAO.PatientsRepository;
import pl.medicalclinic.DTO.LoginDto;
import pl.medicalclinic.DTO.RegistrationDto;
import pl.medicalclinic.Model.Patient;
import pl.medicalclinic.Services.PatientService;

@Controller
public class LoginController {
    @Autowired
    private PatientsRepository patientsRepository;
    @Autowired
    private PatientService patientService;


    @RequestMapping("/login")
        public String logIn(HttpServletRequest request,  @ModelAttribute("loginDto") LoginDto loginDto, Model model){
        if(request.getMethod().equalsIgnoreCase("post")){
            Patient patient = patientsRepository.findByLoginAndPassword(loginDto.getUsername(), loginDto.getPassword());
            if(patient!=null && patient.getLogin().equals(loginDto.getUsername())){
                return "redirect:/";
            }
        }
        return null;
    }

    @RequestMapping("/register")
    public String logIn(HttpServletRequest request,  @ModelAttribute("registrationDto") RegistrationDto registrationDto, Model model){
        if(request.getMethod().equalsIgnoreCase("post")){
            patientService.isValidNewAccount(registrationDto.getUsername(), registrationDto.getPassword(), registrationDto.getEmail())
            {
                Patient patient = new Patient();
                patient.setLogin(registrationDto.getUsername());
                patient.setPassword(registrationDto.getPassword());
                patient.setEmail(registrationDto.getEmail());
                patient = patientsRepository.save(patient);

                if(patient.getId() != null){
                    return "redirect:/";
                }
            }
        }
        return "register";
    }
}
