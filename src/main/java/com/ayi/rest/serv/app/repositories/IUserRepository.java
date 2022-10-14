package com.ayi.rest.serv.app.repositories;

import com.ayi.rest.serv.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
