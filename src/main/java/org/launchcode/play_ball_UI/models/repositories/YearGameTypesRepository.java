package org.launchcode.play_ball_UI.models.repositories;

import org.launchcode.play_ball_UI.models.Year;
import org.launchcode.play_ball_UI.models.YearGameType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearGameTypesRepository extends CrudRepository<YearGameType, String> {
}
