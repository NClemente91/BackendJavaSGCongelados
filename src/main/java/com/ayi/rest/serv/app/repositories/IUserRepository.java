package com.ayi.rest.serv.app.repositories;

import com.ayi.rest.serv.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
