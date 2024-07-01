package com.spring_boot_03.spring_boot_03.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String sayHelloJsp() {
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam final String name,
                                  @RequestParam final String password,
                                  final ModelMap modelMap) {
        modelMap.put("name", name);
        System.out.println("NAME -> " + name);
        modelMap.put("password", password);
        System.out.println("PASSWORD -> " + password);
        return "welcome";
    }
}
