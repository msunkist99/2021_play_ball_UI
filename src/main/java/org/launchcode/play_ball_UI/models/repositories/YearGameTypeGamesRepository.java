package org.launchcode.play_ball_UI.models.repositories;

import org.launchcode.play_ball_UI.models.YearGameTypeGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearGameTypeGamesRepository extends CrudRepository<YearGameTypeGame, String> {
}
