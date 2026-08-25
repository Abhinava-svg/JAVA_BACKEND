package SpringBootMavenApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class TeluskoController {

    @GetMapping("/greet")
    public String greet(Model model) {

        model.addAttribute("wish", "Good Morning!");

        return "greet";
    }
}
