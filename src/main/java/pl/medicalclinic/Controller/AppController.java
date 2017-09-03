package pl.medicalclinic.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

    @RequestMapping(value = "team_doctors", method = RequestMethod.GET)
    public String getIndexPage() {
        return "team_doctors";
    }
}
