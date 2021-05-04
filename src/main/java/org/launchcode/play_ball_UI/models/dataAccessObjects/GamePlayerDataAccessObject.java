package org.launchcode.play_ball_UI.models.dataAccessObjects;

// https://examples.javacodegeeks.com/enterprise-java/spring/spring-jdbc-storedprocedure-class-example/


import org.launchcode.play_ball_UI.models.GamePlayer;
import org.launchcode.play_ball_UI.models.YearGameTypePlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.launchcode.play_ball_UI.models.dataAccessObjects.LookupDataAccessObject;

import javax.persistence.EntityManager;
import java.util.*;

@Repository
public class GamePlayerDataAccessObject {

    @Autowired
    private EntityManager entityManager;

    private static Map<String, String> lookupData = new HashMap<>();

    public Iterable<GamePlayer> getGamesPlayers(int gameYear, String gameId, String gameVisitingTeamId, String gameHomeTeamId, String playerId, String option, String sortKey) {

        if (lookupData.isEmpty())  {
            lookupData = LookupDataAccessObject.getLookupData(entityManager);
        }

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-games-players")
                .setParameter("game_year", gameYear)
                .setParameter("game_id", gameId)
                .setParameter("game_visiting_team", gameVisitingTeamId)
                .setParameter("game_home_team", gameHomeTeamId)
                .setParameter("player_id", playerId)
                .getResultList();

        ArrayList<GamePlayer> gamesPlayers = new ArrayList<>();

        for (Object[] row : objectList) {
            GamePlayer gamePlayer = new GamePlayer();

            gamePlayer.setGameId(row[0].toString());
            gamePlayer.setDate(row[1].toString());
            gamePlayer.setYear((Integer) row[2]);

            gamePlayer.setGameType((Character) row[3]);
            //gamePlayer.setGameTypeText(row[4].toString());
            gamePlayer.setGameTypeText(lookupData.get( "game_type" + row[3].toString()));

            gamePlayer.setDayNight((Character) row[4]);
            //gamePlayer.setDayNightText(row[4].toString());
            gamePlayer.setDayNightText(lookupData.get("day_night" + row[4].toString()));

            gamePlayer.setGameNum((Integer) row[5]);
            gamePlayer.setGameNumText(lookupData.get("game_num" + row[5].toString()));

            gamePlayer.setHomeTeam(row[6].toString());
            gamePlayer.setHomeTeamName(row[7].toString());
            gamePlayer.setHomeTeamCity(row[8].toString());

            gamePlayer.setHomeTeamLeague((Character) row[9]);
            gamePlayer.setHomeTeamLeagueText(lookupData.get("league" + row[9].toString()));

            gamePlayer.setVisitingTeam(row[10].toString());
            gamePlayer.setVisitingTeamName(row[11].toString());
            gamePlayer.setVisitingTeamCity(row[12].toString());

            gamePlayer.setVisitingTeamLeague((Character) row[13]);
            gamePlayer.setVisitingTeamLeagueText(lookupData.get("league" + row[13].toString()));

            gamePlayer.setPlayerId(row[14].toString());
            gamePlayer.setPlayerLastName(row[15].toString());
            gamePlayer.setPlayerFirstName(row[16].toString());

            gamePlayer.setPlayerBats((Character) row[17]);
            gamePlayer.setPlayerBatsText(lookupData.get("left_right" + row[17].toString()));

            gamePlayer.setPlayerThrows((Character) row[18]);
            gamePlayer.setPlayerThrowsText(lookupData.get("left_right" + row[18].toString()));

            gamePlayer.setPlayerStartSub((Integer) row[19]);
            gamePlayer.setPlayerStartSubText(lookupData.get("start_sub" + row[19].toString()));

            gamePlayer.setPlayerVisitHome((Integer) row[20]);
            gamePlayer.setPlayerVisitHomeText(lookupData.get("visit_home" + row[20].toString()));

            gamePlayer.setPlayerBattingOrder((Integer) row[21]);

            gamePlayer.setPlayerFieldPosition((Integer) row[22]);
            gamePlayer.setPlayerFieldPositionText(lookupData.get("field_position" + row[22].toString()));

            gamesPlayers.add(gamePlayer);
        }

        if (sortKey != "") {
            gamesPlayers = getSortedGamesPlayers(gamesPlayers, option, sortKey);
        }

        return  gamesPlayers;
    }


    private ArrayList<GamePlayer> getSortedGamesPlayers(ArrayList<GamePlayer> gamesPlayers , String option, String firstSortKey) {

        if (option.equals("game")) {        // sort game data by player last name, first name
            gamesPlayers.sort(Comparator.comparing(GamePlayer :: getPlayerLastName)
                    .thenComparing(GamePlayer :: getPlayerFirstName)
                    .thenComparing(GamePlayer :: getPlayerVisitHome));

        }
        else {      // dataSetType == "player"
            gamesPlayers.sort(Comparator.comparing(GamePlayer :: getVisitingTeamName)
                    .thenComparing(GamePlayer :: getGameId));
        }

        return gamesPlayers;
    }
}