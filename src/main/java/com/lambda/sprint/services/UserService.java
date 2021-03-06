package com.lambda.sprint.services;

import com.lambda.sprint.models.Todo;
import com.lambda.sprint.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserById(long id);

    User findUserByUsername(String username);

    void delete(long id);

    User save(User user);

    User update(User user, long id);
    public User updateTodos(Todo todo, long id);
}