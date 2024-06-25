package com.spring_boot_03.spring_boot_03.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

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
    public String sayHelloJsp() {
        return "login";
    }
}
