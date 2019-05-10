package com.lambda.sprint.services;

import com.lambda.sprint.models.Todo;

public interface TodoService
{
    Todo findById(Long id);
    Todo update(Todo todo);
    Todo save(Todo todo);
    void delete(Long id);
}
