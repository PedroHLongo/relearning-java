package com.spring_boot_03.spring_boot_03.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1L, "pedro", "todo 1", LocalDate.now().plusDays(1L), Boolean.FALSE));
        todos.add(new Todo(2L, "pedro", "todo 2", LocalDate.now().plusDays(2L), Boolean.FALSE));
        todos.add(new Todo(3L, "pedro", "todo 3", LocalDate.now().plusDays(3L), Boolean.FALSE));
    }

    public List<Todo> findByUser(final String user) {
        return todos.stream().filter(todo -> user.equals(todo.getUsername())).toList();
    }
}
