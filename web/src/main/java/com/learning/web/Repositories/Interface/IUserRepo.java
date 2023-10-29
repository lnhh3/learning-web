package com.learning.web.Repositories.Interface;

import com.learning.web.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepo extends JpaRepository<User, String> {
}
