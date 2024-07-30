package com.spring_boot_03.spring_boot_03.todo;

import org.eclipse.tags.shaded.org.apache.xpath.operations.Bool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
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
        final List<Todo> todos = todoService.findByUser("Pedro");
        modelMap.put("todos", todos);
        return "listTodos";
    }


    @RequestMapping(value= "/add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }


    @RequestMapping(value= "/add-todo", method = RequestMethod.POST)
    public String addNewTodo(@RequestParam String description, ModelMap model) {
        todoService.addTodo(model.get("username").toString(), description, LocalDate.now().plusYears(1), Boolean.FALSE);
        return "redirect:todos";
    }
}
