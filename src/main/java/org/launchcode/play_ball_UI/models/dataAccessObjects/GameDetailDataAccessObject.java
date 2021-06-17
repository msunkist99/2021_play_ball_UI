package org.launchcode.play_ball_UI.models.dataAccessObjects;

import org.hibernate.query.criteria.internal.expression.function.SubstringFunction;
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

        List<Object[]> objectList = entityManager.createNamedStoredProcedureQuery("get-game-detail")
                .setParameter("game_id", gameId)
                .getResultList();

        ArrayList<GameDetail> gameDetails = new ArrayList<>();

        for (Object[] row : objectList) {
            GameDetail gameDetail = new GameDetail();

            gameDetail.setGameId(row[0].toString());
            gameDetail.setDhUsedFlag((Character) row[1]);
            gameDetail.setDate(row[2].toString());


            gameDetail.setDayOfWeek(row[3].toString());
            //gameDetail.setStartTime(row[4].toString());

            if (row[4].toString().length() == 3) {
                gameDetail.setStartTime(row[4].toString().substring(0,1) + ":" + row[4].toString().substring(1,3));
            }
            else if (row[4].toString().length() == 4) {
                gameDetail.setStartTime(row[4].toString().substring(0,2) + ":" + row[4].toString().substring(2,4));
            }
            else {
                gameDetail.setStartTime(row[4].toString());
            }

            gameDetail.setDayNight((Character) row[5]);
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
            gameDetail.setHomeTeamLeague((Character)row[14]);
            gameDetail.setHomeTeamLeagueText(LookupDataAccessObject.lookupData.get("league" + row[14].toString()));

            gameDetail.setBallparkId(row[15].toString());
            gameDetail.setBallparkName(row[16].toString());
            gameDetail.setBallparkAka(row[17].toString());
            gameDetail.setBallparkCity(row[18].toString());
            gameDetail.setBallparkState(row[19].toString());
            gameDetail.setBallparkStartDate(row[20].toString());
            gameDetail.setBallparkEndDate(row[21].toString());

            try {
                gameDetail.setBallparkLeague(row[22].toString());
                gameDetail.setBallparkLeagueText(LookupDataAccessObject.lookupData.get("league" + row[22].toString()));
            }
            catch(Exception e) {
                gameDetail.setBallparkLeague(null);
                gameDetail.setBallparkLeagueText(null);
            }

            gameDetail.setBallparkNotes(row[23].toString());

            if (row[24].toString().isEmpty() || row[24].toString() == null) {
                gameDetail.setPlayerIdVisitStartingPitcher(null);
            }
            else
            {
                gameDetail.setPlayerIdVisitStartingPitcher(row[24].toString());
                gameDetail.setPlayerPositionVisitStartingPitcher(1);            // pitcher
                gameDetail.setPlayerPositionVisitStartingPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerVisitStartingPitcherLastName(row[25].toString());
                gameDetail.setPlayerVisitStartingPitcherFirstName(row[26].toString());
                gameDetail.setPlayerVisitStartingPitcherBats((Character) row[27]);
                gameDetail.setPlayerVisitStartingPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[27].toString()));
                gameDetail.setPlayerVisitStartingPitcherThrows((Character) row[28]);
                gameDetail.setPlayerVisitStartingPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[28].toString()));
                gameDetail.setPlayerPositionVisitStartingPitcher((Integer)row[29]);
                gameDetail.setPlayerPositionVisitStartingPitcherText(LookupDataAccessObject.lookupData.get("field_position" + row[29].toString()));
            }


            if(row[30].toString().isEmpty() || row[30].toString() == null) {
                gameDetail.setPlayerIdHomeStartingPitcher(null);
            }
            else {
                gameDetail.setPlayerIdHomeStartingPitcher(row[30].toString());
                gameDetail.setPlayerHomeStartingPitcherLastName(row[31].toString());
                gameDetail.setPlayerHomeStartingPitcherFirstName(row[32].toString());
                gameDetail.setPlayerHomeStartingPitcherBats((Character) row[33]);
                gameDetail.setPlayerHomeStartingPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[33].toString()));
                gameDetail.setPlayerHomeStartingPitcherThrows((Character) row[34]);
                gameDetail.setPlayerHomeStartingPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[34].toString()));
                gameDetail.setPlayerPositionHomeStartingPitcher((Integer) row[35]);
                gameDetail.setPlayerPositionHomeStartingPitcherText(LookupDataAccessObject.lookupData.get("field_position" + row[35].toString()));
            }
            if (row[36].toString() == "(none)") {
                gameDetail.setUmpireIdHomePlate("");
            }
            else {
                gameDetail.setUmpireIdHomePlate(row[36].toString());
            }

            if (row[37].toString() == "(none)")
            {
                gameDetail.setUmpireIdFirstBase("");
            }
            else {
                gameDetail.setUmpireIdFirstBase(row[37].toString());
            }

            if (row[38].toString().equals("(none)")) {
                gameDetail.setUmpireIdSecondBase("");
            }
            else {
                gameDetail.setUmpireIdSecondBase(row[38].toString());
            }

            if (row[39].toString().equals("(none)")) {
                gameDetail.setUmpireIdThirdBase("");
            }
            else {
                gameDetail.setUmpireIdThirdBase(row[39].toString());
            }

            if (row[40].toString().equals("(none)")) {
                gameDetail.setUmpireIdLeftField("");
            }
            else {
                gameDetail.setUmpireIdLeftField(row[40].toString());
            }

            if (row[41].toString().equals("(none)")) {
                gameDetail.setUmpireIdRightField("");
            }
            else {
                gameDetail.setUmpireIdRightField(row[41].toString());
            }

            gameDetail.setGameAttendance((Integer) row[42]);
            gameDetail.setPsScorer(row[43].toString());
            gameDetail.setTranslator(row[44].toString());
            gameDetail.setInputter(row[45].toString());
            gameDetail.setInputTime(row[46].toString());
            gameDetail.setEditTime(row[47].toString());
            gameDetail.setHowScored(row[48].toString());
            gameDetail.setPitchesEntered(row[49].toString());
            gameDetail.setGameTemperature((Integer)row[50]);

            gameDetail.setGameWindDirection((Character) row[51]);
            gameDetail.setGameWindDirectionText(LookupDataAccessObject.lookupData.get("wind_direction" + row[51].toString()));

            gameDetail.setGameWindSpeed((Integer)row[52]);

            gameDetail.setGameFieldCondition((Character) row[53]);
            gameDetail.setGameFieldConditionText(LookupDataAccessObject.lookupData.get("field_condition" + row[53].toString()));

            gameDetail.setGamePrecipitation((Character) row[54]);
            gameDetail.setGamePrecipitationText(LookupDataAccessObject.lookupData.get("precipitation" + row[54].toString()));

            gameDetail.setGameSky((Character) row[55]);
            gameDetail.setGameSkyText(LookupDataAccessObject.lookupData.get("sky" + row[55].toString()));

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

            if (row[66].toString().isEmpty() || row[66].toString() == null) {
                gameDetail.setPlayerIdWinningPitcher(null);
            }
            else
            {
                gameDetail.setPlayerIdWinningPitcher(row[66].toString());
                gameDetail.setPlayerPositionWinningPitcher(1);
                gameDetail.setPlayerPositionWinningPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerWinningPitcherLastName(row[67].toString());
                gameDetail.setPlayerWinningPitcherFirstName(row[68].toString());
                gameDetail.setPlayerWinningPitcherBats((Character) row[69]);
                gameDetail.setPlayerWinningPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[69].toString()));
                gameDetail.setPlayerWinningPitcherThrows((Character) row[70]);
                gameDetail.setPlayerWinningPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[70].toString()));
            }

            if (row[71].toString().isEmpty() || row[71].toString() == null) {
                gameDetail.setPlayerIdLosingPitcher(null);
            }
            else {
                gameDetail.setPlayerIdLosingPitcher(row[71].toString());
                gameDetail.setPlayerPositionLosingPitcher(1);
                gameDetail.setPlayerPositionLosingPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerLosingPitcherLastName(row[72].toString());
                gameDetail.setPlayerLosingPitcherFirstName(row[73].toString());
                gameDetail.setPlayerLosingPitcherBats((Character) row[74]);
                gameDetail.setPlayerLosingPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[74].toString()));
                gameDetail.setPlayerLosingPitcherThrows((Character) row[75]);
                gameDetail.setPlayerLosingPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[75].toString()));
            }

            if (row[76].toString().isEmpty() || row[76].toString() == null) {
                gameDetail.setPlayerIdSaveFor(null);
            }
            else {
                gameDetail.setPlayerIdSaveFor(row[76].toString());
                gameDetail.setPlayerPositionSaveFor(1);
                gameDetail.setPlayerPositionSaveForText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerSaveForLastName(row[77].toString());
                gameDetail.setPlayerSaveForFirstName(row[78].toString());
                gameDetail.setPlayerSaveForBats((Character) row[79]);
                gameDetail.setPlayerSaveForBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[79].toString()));
                gameDetail.setPlayerSaveForThrows((Character) row[80]);
                gameDetail.setPlayerSaveForThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[80].toString()));
            }

            if (row[81].toString().isEmpty() || row[81].toString() == null) {
                gameDetail.setPlayerIdWinningRbi(null);
            }
            else
            {
                gameDetail.setPlayerIdWinningRbi(row[81].toString());
                //gameDetail.setPlayerPositionWinningRbi(1);
                //gameDetail.setPlayerPositionWinningRbiText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerWinningRbiLastName(row[82].toString());
                gameDetail.setPlayerWinningRbiFirstName(row[83].toString());
                gameDetail.setPlayerWinningRbiBats((Character) row[84]);
                gameDetail.setPlayerWinningRbiBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[84].toString()));
                gameDetail.setPlayerWinningRbiThrows((Character) row[85]);
                gameDetail.setPlayerWinningRbiThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[85].toString()));
            }

            if (row[86].toString().isEmpty() || row[86].toString() == null) {
                gameDetail.setPlayerIdVisitFinalPitcher(null);
            }
            else {
                gameDetail.setPlayerIdVisitFinalPitcher(row[86].toString());
                gameDetail.setPlayerPositionVisitFinalPitcher(1);
                gameDetail.setPlayerPositionVisitFinalPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerVisitFinalPitcherLastName(row[87].toString());
                gameDetail.setPlayerVisitFinalPitcherFirstName(row[88].toString());
                gameDetail.setPlayerVisitFinalPitcherBats((Character) row[89]);
                gameDetail.setPlayerVisitFinalPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[89].toString()));
                gameDetail.setPlayerVisitFinalPitcherThrows((Character) row[90]);
                gameDetail.setPlayerVisitFinalPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[90].toString()));
            }

            if (row[91].toString().isEmpty() || row[91].toString() == null) {
                gameDetail.setPlayerIdHomeFinalPitcher(null);
            }
            else {
                gameDetail.setPlayerIdHomeFinalPitcher(row[91].toString());
                gameDetail.setPlayerPositionHomeFinalPitcher(1);
                gameDetail.setPlayerPositionHomeFinalPitcherText(LookupDataAccessObject.lookupData.get("field_position1"));
                gameDetail.setPlayerHomeFinalPitcherLastName(row[92].toString());
                gameDetail.setPlayerHomeFinalPitcherFirstName(row[93].toString());
                gameDetail.setPlayerHomeFinalPitcherBats((Character) row[94]);
                gameDetail.setPlayerHomeFinalPitcherBatsText(LookupDataAccessObject.lookupData.get("left_right" + row[94].toString()));
                gameDetail.setPlayerHomeFinalPitcherThrows((Character) row[95]);
                gameDetail.setPlayerHomeFinalPitcherThrowsText(LookupDataAccessObject.lookupData.get("left_right" + row[95].toString()));
            }

            gameDetail.setGameType((Character)row[96]);
            gameDetail.setGameTypeText(LookupDataAccessObject.lookupData.get( "game_type" + row[96].toString()));

            gameDetail.setYear((Integer)row[97]);

            try {
                gameDetail.setUmpireHomePlateLastName(row[98].toString());
                gameDetail.setUmpireHomePlateFirstName(row[99].toString());
                gameDetail.setUmpireHomePlateDebutDate(row[100].toString());
            }
            catch (Exception e) {
                gameDetail.setUmpireHomePlateLastName(null);
                gameDetail.setUmpireHomePlateFirstName(null);
                gameDetail.setUmpireHomePlateDebutDate(null);
            }

//            if (row[36].toString().isEmpty() || row[36].toString() == null) {       // home plate umpire id
//                gameDetail.setUmpireHomePlateLastName(null);
//                gameDetail.setUmpireHomePlateFirstName(null);
//                gameDetail.setUmpireHomePlateDebutDate(null);
//            }
//            else {
//                gameDetail.setUmpireHomePlateLastName(row[98].toString());
//                gameDetail.setUmpireHomePlateFirstName(row[99].toString());
//                gameDetail.setUmpireHomePlateDebutDate(row[100].toString());
//            }

            try{
                gameDetail.setUmpireFirstBaseLastName(row[101].toString());
                gameDetail.setUmpireFirstBaseFirstName(row[102].toString());
                gameDetail.setUmpireFirstBaseDebutDate(row[103].toString());
            }
            catch (Exception e) {
                gameDetail.setUmpireFirstBaseLastName(null);
                gameDetail.setUmpireFirstBaseFirstName(null);
                gameDetail.setUmpireFirstBaseDebutDate(null);
            }

            try {
                gameDetail.setUmpireSecondBaseLastName(row[104].toString());
                gameDetail.setUmpireSecondBaseFirstName(row[105].toString());
                gameDetail.setUmpireSecondBaseDebutDate(row[106].toString());
            }
            catch (Exception e) {
                gameDetail.setUmpireSecondBaseLastName(null);
                gameDetail.setUmpireSecondBaseFirstName(null);
                gameDetail.setUmpireSecondBaseDebutDate(null);
            }
//            if (row[38].toString().isEmpty() || row[38].toString() == null) {       // second base umpire id
//                gameDetail.setUmpireSecondBaseLastName(null);
//                gameDetail.setUmpireSecondBaseFirstName(null);
//                gameDetail.setUmpireSecondBaseDebutDate(null);
//            }
//            else {
//                gameDetail.setUmpireSecondBaseLastName(row[104].toString());
//                gameDetail.setUmpireSecondBaseFirstName(row[105].toString());
//                gameDetail.setUmpireSecondBaseDebutDate(row[106].toString());
//            }

            try {
                gameDetail.setUmpireThirdBaseLastName(row[107].toString());
                gameDetail.setUmpireThirdBaseFirstName(row[108].toString());
                gameDetail.setUmpireThirdBaseDebutDate(row[109].toString());
            }
            catch (Exception e) {
                gameDetail.setUmpireThirdBaseLastName(null);
                gameDetail.setUmpireThirdBaseLastName(null);
                gameDetail.setUmpireThirdBaseDebutDate(null);
            }

//            if (row[39].toString().isEmpty() || row[39].toString() == null) {       // third base umpire id
//                gameDetail.setUmpireThirdBaseLastName(null);
//                gameDetail.setUmpireThirdBaseLastName(null);
//                gameDetail.setUmpireThirdBaseDebutDate(null);
//            }
//            else {
//                gameDetail.setUmpireThirdBaseLastName(row[107].toString());
//                gameDetail.setUmpireThirdBaseFirstName(row[108].toString());
//                gameDetail.setUmpireThirdBaseDebutDate(row[109].toString());
//            }

            try {
                gameDetail.setUmpireLeftFieldLastName(row[110].toString());
                gameDetail.setUmpireLeftFieldFirstName(row[111].toString());
                gameDetail.setUmpireLeftFieldDebutDate(row[112].toString());
            }
            catch (Exception e) {
                gameDetail.setUmpireLeftFieldLastName(null);
                gameDetail.setUmpireLeftFieldFirstName(null);
                gameDetail.setUmpireLeftFieldDebutDate(null);
            }

//            if (row[40].toString().isEmpty() || row[40].toString() == null) {       // left field umpire id
//                gameDetail.setUmpireLeftFieldLastName(null);
//                gameDetail.setUmpireLeftFieldFirstName(null);
//                gameDetail.setUmpireLeftFieldDebutDate(null);
//            }
//            else {
//                gameDetail.setUmpireLeftFieldLastName(row[110].toString());
//                gameDetail.setUmpireLeftFieldFirstName(row[111].toString());
//                gameDetail.setUmpireLeftFieldDebutDate(row[112].toString());
//            }

            try {
                gameDetail.setUmpireRightFieldLastName(row[113].toString());
                gameDetail.setUmpireRightFieldFirstName(row[114].toString());
                gameDetail.setUmpireRightFieldDebutDate(row[115].toString());
            }
            catch (Exception e) {
                gameDetail.setUmpireRightFieldLastName(null);
                gameDetail.setUmpireRightFieldFirstName(null);
                gameDetail.setUmpireRightFieldDebutDate(null);
            }

//            if (row[41].toString().isEmpty() || row[41].toString() == null) {       // right field umpire id
//                gameDetail.setUmpireRightFieldLastName(null);
//                gameDetail.setUmpireRightFieldFirstName(null);
//                gameDetail.setUmpireRightFieldDebutDate(null);
//            }
//            else {
//                gameDetail.setUmpireRightFieldLastName(row[113].toString());
//                gameDetail.setUmpireRightFieldFirstName(row[114].toString());
//                gameDetail.setUmpireRightFieldDebutDate(row[115].toString());
//            }


            gameDetails.add(gameDetail);
        }

        return gameDetails;
    }
}
