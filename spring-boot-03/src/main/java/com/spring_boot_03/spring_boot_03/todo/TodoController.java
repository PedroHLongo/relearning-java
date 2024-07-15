package com.spring_boot_03.spring_boot_03.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("username")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value= "/todos", method = RequestMethod.GET)
    public String todos(final ModelMap modelMap) {
        final List<Todo> todos = todoService.findByUser("pedro");
        modelMap.put("todos", todos);
        return "listTodos";
    }
}
