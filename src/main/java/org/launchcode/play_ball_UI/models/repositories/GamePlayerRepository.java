package org.launchcode.play_ball_UI.models.repositories;

import org.launchcode.play_ball_UI.models.GamePlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamePlayerRepository extends CrudRepository<GamePlayer, String> {

}
