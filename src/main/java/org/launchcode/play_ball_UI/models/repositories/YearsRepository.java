package org.launchcode.play_ball_UI.models.repositories;

import org.launchcode.play_ball_UI.models.GamePlayer;
import org.launchcode.play_ball_UI.models.Year;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearsRepository extends CrudRepository<Year, Integer> {
}
