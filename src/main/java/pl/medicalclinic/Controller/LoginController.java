package pl.medicalclinic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import pl.medicalclinic.DAO.UsersRepository;
import pl.medicalclinic.DTO.UserDto;
import pl.medicalclinic.Model.User;
import pl.medicalclinic.Services.UserService;

@Controller
public class LoginController {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String logIn(HttpServletRequest request, @ModelAttribute("userDto") UserDto userDto, Model model){
        if(request.getMethod().equalsIgnoreCase("post")){
            User user = usersRepository.findByUsernameAndPassword(userDto.getUsername(), userDto.getPassword());
            if(user!=null && user.getUsername().equals(userDto.getUsername())){
                return "redirect:/";
            }
        }
        return "login";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request,  @ModelAttribute("userDto") UserDto userDto, Model model){
        if(request.getMethod().equalsIgnoreCase("post")){
            if (userService.registerNewUser(userDto) != null) {
                return "redirect:/";
            }
        }
        return "register";
    }
}
