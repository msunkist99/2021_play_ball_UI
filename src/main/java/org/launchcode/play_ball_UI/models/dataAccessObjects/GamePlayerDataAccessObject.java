package org.launchcode.play_ball_UI.models.dataAccessObjects;

// https://examples.javacodegeeks.com/enterprise-java/spring/spring-jdbc-storedprocedure-class-example/


import org.launchcode.play_ball_UI.models.GamePlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GamePlayerDataAccessObject {

    @Autowired
    private EntityManager entityManager;

    public List<GamePlayer> getGamesPlayers(int gameYear, String gameId, String gameVisitingTeamId, String gameHomeTeamId, String playerId) {
        return entityManager.createNamedStoredProcedureQuery("get-games-players")
                .setParameter("game_year", gameYear)
                .setParameter("game_id", gameId)
                .setParameter("game_visiting_team", gameVisitingTeamId)
                .setParameter("game_home_team", gameHomeTeamId)
                .setParameter("player_id", playerId)
                .getResultList();
    }
}