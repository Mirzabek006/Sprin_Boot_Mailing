package uz.pdp.springboot_example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.springboot_example.properties.MailingProperty;

@RequiredArgsConstructor
@Controller
public class HomeController {

    @Value("${g58.message}")
    private String message;

    @Autowired
    private final MailingProperty mailingProperty;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", message);
        System.out.println(mailingProperty);
        return "home";
    }
}
