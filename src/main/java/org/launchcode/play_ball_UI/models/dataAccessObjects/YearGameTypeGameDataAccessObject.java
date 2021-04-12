package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.launchcode.play_ball_UI.models.YearGameType;
import org.launchcode.play_ball_UI.models.YearGameTypeGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class YearGameTypeGameDataAccessObject {

    @Autowired
    private EntityManager entityManager;

    public Iterable<YearGameTypeGame> getYearGameTypeGamesData(int gameYear, char gameType) {

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-year-game-type-game-data")
                .setParameter("gameYear", gameYear)
                .setParameter("gameType", gameType)
                .getResultList();

        List<YearGameTypeGame> yearGameTypeGames = new ArrayList<>();

        for (Object[] row : objectList) {
            YearGameTypeGame yearGameTypeGame = new YearGameTypeGame();

            yearGameTypeGame.setGameId(row[0].toString());
            yearGameTypeGame.setGameSite(row[1].toString());
            yearGameTypeGame.setHomeTeam(row[2].toString());
            yearGameTypeGame.setVisitingTeam(row[3].toString());
            yearGameTypeGame.setDate(row[4].toString());
            yearGameTypeGame.setDayNight((Character) row[5]);
            yearGameTypeGame.setDayNightText(row[6].toString());
            yearGameTypeGame.setGameNum((Integer) row[7]);
            yearGameTypeGame.setGameNumText(row[8].toString());
            yearGameTypeGame.setYear((Integer) row[9]);
            yearGameTypeGame.setGameType((Character) row[10]);
            yearGameTypeGame.setGameTypeText(row[11].toString());
            yearGameTypeGame.setHomeTeamName(row[12].toString());
            yearGameTypeGame.setHomeTeamCity(row[13].toString());
            yearGameTypeGame.setVisitingTeamName(row[14].toString());
            yearGameTypeGame.setVisitingTeamCity(row[15].toString());

            yearGameTypeGames.add(yearGameTypeGame);
        }

        return yearGameTypeGames;
    }
}
