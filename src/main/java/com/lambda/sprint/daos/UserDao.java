package com.lambda.sprint.daos;

import com.lambda.sprint.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}