package com.spring_boot_03.spring_boot_03.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    @ResponseBody
    public String sayHello() {
        return "Login!";
    }

    @RequestMapping("/login-html")
    @ResponseBody
    public String sayHelloHtml() {
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<title>Login page</title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body>");
        stringBuffer.append("Login page!");
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");

        return stringBuffer.toString();
    }

    @RequestMapping("/login-jsp")
    public String sayHelloJsp(@RequestParam final String name, final ModelMap model) {
        model.put("name", name);
        logger.debug("Request param: {}", name);
        return "login";
    }
}
