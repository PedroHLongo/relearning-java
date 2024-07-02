package com.spring_boot_03.spring_boot_03.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String sayHelloJsp() {
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam final String username,
                                  @RequestParam final String password,
                                  final ModelMap modelMap) {
        final boolean isValidUser = authenticationService.authenticate(username, password);
        if (Boolean.TRUE.equals(isValidUser)) {
            modelMap.put("username", username);
            System.out.println("USERNAME -> " + username);
            return "welcome";
        }

        modelMap.put("errorMessage", "Invalid credentials! Please try again.");
        return "login";
    }
}
