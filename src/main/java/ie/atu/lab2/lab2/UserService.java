package ie.atu.lab2.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String username, String email) {
        // Some user registration logic

        /* Send confirmation email
        EmailService.sendEmail(email, "Welcome to our platform");

         */
    }
}
