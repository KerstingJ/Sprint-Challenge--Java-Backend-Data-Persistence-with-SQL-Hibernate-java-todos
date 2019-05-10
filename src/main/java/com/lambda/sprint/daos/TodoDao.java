package com.lambda.sprint.daos;

import com.lambda.sprint.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoDao extends CrudRepository<Todo, Long>
{
}
