package com.spring_boot_03.spring_boot_03.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    public String sayHelloJsp(@RequestParam final String name,
                              @RequestParam final String password,
                              final ModelMap model) {
        model.put("name", name);
        logger.debug("Request param: {}", name);
        System.out.println("NAME -> " + name);
        System.out.println("PASSWORD  -> " + password);
        return "login";
    }
}
