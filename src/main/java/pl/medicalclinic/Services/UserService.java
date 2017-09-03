package pl.medicalclinic.Services;

import org.springframework.stereotype.Service;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

@Service
public class UserService {
    public final boolean isValidEmail(String email){
        boolean result = true;
            try{
                InternetAddress emailAddress = new InternetAddress(email);
                emailAddress.validate();
            } catch (AddressException ex) {
                result = false;
            }
        return result;
    }

    public final boolean isValidNewAccount(String login, String password, String email){
        if(!login.equals("") && !password.equals("") && isValidEmail(email))
            return true;
        else
            return false;
    }
}
