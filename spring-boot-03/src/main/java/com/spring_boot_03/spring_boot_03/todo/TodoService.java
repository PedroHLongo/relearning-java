package com.spring_boot_03.spring_boot_03.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();
    private static long todoCount = 0L;
    static {
        todos.add(new Todo(++todoCount, "Pedro", "todo 1", LocalDate.now().plusDays(1L), Boolean.FALSE));
        todos.add(new Todo(++todoCount,"Pedro", "todo 2", LocalDate.now().plusDays(2L), Boolean.FALSE));
        todos.add(new Todo(++todoCount,"Pedro", "todo 3", LocalDate.now().plusDays(3L), Boolean.FALSE));
    }

    public List<Todo> findByUser(final String user) {
        return todos.stream().filter(todo -> user.equals(todo.getUsername())).toList();
    }

    void addTodo(final String username, final String description, final LocalDate localDate, Boolean done) {
        todos.add(new Todo(++todoCount, username, description, localDate, done));
    }
}
