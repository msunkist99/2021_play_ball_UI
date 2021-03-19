package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.launchcode.play_ball_UI.models.YearGameTypeGame;
import org.launchcode.play_ball_UI.models.YearGameTypePlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class YearGameTypePlayerDataAccessObject {

    @Autowired
    private EntityManager entityManager;

    public Iterable<YearGameTypePlayer> getYearGameTypePlayersData(int gameYear, char gameType) {

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-year-game-type-player-data")
                .setParameter("gameYear", gameYear)
                .setParameter("gameType", gameType)
                .getResultList();

        List<YearGameTypePlayer> yearGameTypePlayers = new ArrayList<>();

        for (Object[] row : objectList) {
            YearGameTypePlayer yearGameTypePlayer = new YearGameTypePlayer();

            yearGameTypePlayer.setPlayerId(row[0].toString());
            yearGameTypePlayer.setPlayerLastName(row[1].toString());
            yearGameTypePlayer.setPlayerFirstName(row[2].toString());
            yearGameTypePlayer.setPlayerTeamId(row[3].toString());
            yearGameTypePlayer.setPlayerTeamName(row[4].toString());
            yearGameTypePlayer.setPlayerTeamCity(row[5].toString());

            yearGameTypePlayers.add(yearGameTypePlayer);
        }

        return yearGameTypePlayers;
    }
}
