package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.launchcode.play_ball_UI.models.GameDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GameDetailDataAccessObject {
    @Autowired
    private EntityManager entityManager;

    public Iterable<GameDetail> getGameDetail(String gameId) {

        if (LookupDataAccessObject.lookupData.isEmpty()) {
            LookupDataAccessObject.getLookupData(entityManager);
        }

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-game_detail")
                .setParameter("game_id", gameId)
                .getResultList();

        ArrayList<GameDetail> gameDetails = new ArrayList<>();

        for (Object[] row : objectList) {
            GameDetail gameDetail = new GameDetail();

            gameDetail.setGameId(row[0].toString());
            gameDetail.setDhUsedFlag(row[1].toString());
            gameDetail.setDate(row[2].toString());


            gameDetail.setDayOfWeek(row[3].toString());
            gameDetail.setStartTime(row[4].toString());

            gameDetail.setDayNight(row[5].toString());
            gameDetail.setDayNightText(LookupDataAccessObject.lookupData.get("day_night" + row[5].toString()));

            gameDetail.setGameNum((Integer) row[6]);
            gameDetail.setGameNumText(LookupDataAccessObject.lookupData.get("game_num" + row[6].toString()));


            gameDetail.setVisitTeam(row[7].toString());
            gameDetail.setVisitTeamName(row[8].toString());
            gameDetail.setVisitTeamCity(row[9].toString());
            gameDetail.setVisitTeamLeague((Character)row[10]);
            gameDetail.setVisitTeamLeagueText(LookupDataAccessObject.lookupData.get("league" + row[10].toString()));

            gameDetail.setHomeTeam(row[11].toString());
            gameDetail.setHomeTeamName(row[12].toString());
            gameDetail.setHomeTeamCity(row[13].toString());
            gameDetail.setHomeTeamLeague((Character)row[41]);
            gameDetail.setHomeTeamLeagueText(LookupDataAccessObject.lookupData.get("league" + row[14].toString()));

            gameDetail.setBallparkId(row[15].toString());
            gameDetail.setBallparkName(row[16].toString());
            gameDetail.setBallparkAka(row[17].toString());
            gameDetail.setBallparkCity(row[18].toString());
            gameDetail.setBallparkState(row[19].toString());
            gameDetail.setBallparkStartDate(row[20].toString());
            gameDetail.setBallparkEndDate(row[21].toString());
            gameDetail.setBallparkLeague(row[22].toString());
            gameDetail.setBallparkLeagueText(LookupDataAccessObject.lookupData.get("league" + row[22].toString()));
            gameDetail.setBallparkNotes(row[23].toString());

            gameDetail.setPlayerIdVisitStartingPitcher(row[24].toString());
            gameDetail.setPlayerPositionVisitStartingPitcher(1);            // pitcher
            gameDetail.setPlayerPositionVisitStartingPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerVisitStartingPitcherLastName(row[25].toString());
            gameDetail.setPlayerVisitStartingPitcherFirstName(row[26].toString());
            gameDetail.setPlayerVisitStartingPitcherBats((Character) row[27]);
            gameDetail.setPlayerVisitStartingPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[27].toString()));
            gameDetail.setPlayerVisitStartingPitcherThrows((Character) row[28]);
            gameDetail.setPlayerVisitStartingPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[28].toString()));
            gameDetail.setPlayerPositionVisitStartingPitcher((Integer)row[29]);            // pitcher
            gameDetail.setPlayerPositionVisitStartingPitcherText(LookupDataAccessObject.lookupData.get("field_position" + row[29].toString()));


            gameDetail.setPlayerIdHomeStartingPitcher(row[30].toString());
            gameDetail.setPlayerHomeStartingPitcherLastName(row[31].toString());
            gameDetail.setPlayerHomeStartingPitcherFirstName(row[32].toString());
            gameDetail.setPlayerHomeStartingPitcherBats((Character) row[33]);
            gameDetail.setPlayerHomeStartingPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[33].toString()));
            gameDetail.setPlayerHomeStartingPitcherThrows((Character) row[34]);
            gameDetail.setPlayerHomeStartingPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[34].toString()));
            gameDetail.setPlayerPositionHomeStartingPitcher((Integer) row[35]);
            gameDetail.setPlayerPositionHomeStartingPitcherText(LookupDataAccessObject.lookupData.get("field_position" + row[35].toString()));

            gameDetail.setUmpireIdHomePlate(row[36].toString());
            gameDetail.setUmpireIdFirstBase(row[37].toString());
            gameDetail.setUmpireIdSecondBase(row[38].toString());
            gameDetail.setUmpireIdThirdBase(row[39].toString());
            gameDetail.setUmpireIdLeftField(row[40].toString());
            gameDetail.setUmpireIdRightField(row[41].toString());
            gameDetail.setGameAttendance((Integer) row[42]);
            gameDetail.setPsScorer(row[43].toString());
            gameDetail.setTranslator(row[44].toString());
            gameDetail.setInputter(row[45].toString());
            gameDetail.setInputTime(row[46].toString());
            gameDetail.setEditTime(row[47].toString());
            gameDetail.setHowScored(row[48].toString());
            gameDetail.setPitchesEntered(row[49].toString());
            gameDetail.setGameTemperature((Integer)row[50]);

            gameDetail.setGameWindDirection(row[51].toString());
            gameDetail.setGameWindDirectionText(LookupDataAccessObject.lookupData.get("wind_direction" + row[51].toString()));

            gameDetail.setGameWindSpeed((Integer)row[52]);

            gameDetail.setGameFieldCondition(row[53].toString());
            gameDetail.setGameWindDirectionText(LookupDataAccessObject.lookupData.get("field_condition" + row[53].toString()));

            gameDetail.setGamePrecipitation(row[54].toString());
            gameDetail.setGamePrecipitationText(LookupDataAccessObject.lookupData.get("precipitation" + row[54].toString()));

            gameDetail.setGameSky(row[55].toString());
            gameDetail.setGameWindDirectionText(LookupDataAccessObject.lookupData.get("sky" + row[55].toString()));

            gameDetail.setGameTime(row[56].toString());
            gameDetail.setNumberOfInnings((Integer)row[57]);
            gameDetail.setVisitFinalScore((Integer)row[58]);
            gameDetail.setHomeFinalScore((Integer)row[59]);
            gameDetail.setVisitHits((Integer)row[60]);
            gameDetail.setHomeHits((Integer)row[61]);
            gameDetail.setVisitErrors((Integer)row[62]);
            gameDetail.setHomeErrors((Integer)row[63]);
            gameDetail.setVisitLeftOnBase((Integer)row[64]);
            gameDetail.setHomeLeftOnBase((Integer)row[65]);

            gameDetail.setPlayerIdWinningPitcher(row[66].toString());
            gameDetail.setPlayerPositionWinningPitcher(1);
            gameDetail.setPlayerPositionWinningPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerWinningPitcherLastName(row[67].toString());
            gameDetail.setPlayerWinningPitcherFirstName(row[68].toString());
            gameDetail.setPlayerWinningPitcherBats((Character) row[69]);
            gameDetail.setPlayerWinningPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[69].toString()));
            gameDetail.setPlayerWinningPitcherThrows((Character) row[70]);
            gameDetail.setPlayerWinningPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[70].toString()));

            gameDetail.setPlayerIdLosingPitcher(row[71].toString());
            gameDetail.setPlayerPositionLosingPitcher(1);
            gameDetail.setPlayerPositionLosingPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerLosingPitcherLastName(row[72].toString());
            gameDetail.setPlayerLosingPitcherFirstName(row[73].toString());
            gameDetail.setPlayerLosingPitcherBats((Character) row[74]);
            gameDetail.setPlayerLosingPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[74].toString()));
            gameDetail.setPlayerLosingPitcherThrows((Character) row[75]);
            gameDetail.setPlayerLosingPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[75].toString()));

            gameDetail.setPlayerIdSaveFor(row[76].toString());
            gameDetail.setPlayerPositionSaveFor(1);
            gameDetail.setPlayerPositionSaveForText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerSaveForLastName(row[77].toString());
            gameDetail.setPlayerSaveForFirstName(row[78].toString());
            gameDetail.setPlayerSaveForBats((Character) row[79]);
            gameDetail.setPlayerSaveForBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[79].toString()));
            gameDetail.setPlayerSaveForThrows((Character) row[80]);
            gameDetail.setPlayerSaveForThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[80].toString()));

            gameDetail.setPlayerIdWinningRbi(row[81].toString());
            gameDetail.setPlayerPositionWinningRbi(1);
            gameDetail.setPlayerPositionWinningRbiText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerWinningRbiLastName(row[82].toString());
            gameDetail.setPlayerWinningRbiFirstName(row[83].toString());
            gameDetail.setPlayerWinningRbiBats((Character) row[84]);
            gameDetail.setPlayerWinningRbiBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[84].toString()));
            gameDetail.setPlayerWinningRbiThrows((Character) row[85]);
            gameDetail.setPlayerWinningRbiThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[85].toString()));

            gameDetail.setPlayerIdVisitFinalPitcher(row[86].toString());
            gameDetail.setPlayerPositionVisitFinalPitcher(1);
            gameDetail.setPlayerPositionVisitFinalPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerVisitFinalPitcherLastName(row[87].toString());
            gameDetail.setPlayerVisitFinalPitcherFirstName(row[88].toString());
            gameDetail.setPlayerVisitFinalPitcherBats((Character) row[89]);
            gameDetail.setPlayerVisitFinalPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[89].toString()));
            gameDetail.setPlayerVisitFinalPitcherThrows((Character) row[90]);
            gameDetail.setPlayerVisitFinalPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[90].toString()));

            gameDetail.setPlayerIdHomeFinalPitcher(row[91].toString());
            gameDetail.setPlayerPositionHomeFinalPitcher(1);
            gameDetail.setPlayerPositionHomeFinalPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
            gameDetail.setPlayerHomeFinalPitcherLastName(row[92].toString());
            gameDetail.setPlayerHomeFinalPitcherFirstName(row[93].toString());
            gameDetail.setPlayerHomeFinalPitcherBats((Character) row[94]);
            gameDetail.setPlayerHomeFinalPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[94].toString()));
            gameDetail.setPlayerHomeFinalPitcherThrows((Character) row[95]);
            gameDetail.setPlayerHomeFinalPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[95].toString()));

            gameDetail.setPlayerIdVisitFinalPitcher(row[96].toString());
            gameDetail.setPlayerIdHomeFinalPitcher(row[97].toString());

            gameDetails.add(gameDetail);
        }

        return gameDetails;
    }
}
