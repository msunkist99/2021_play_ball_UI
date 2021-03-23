package org.launchcode.play_ball_UI.models.repositories;

import org.launchcode.play_ball_UI.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}