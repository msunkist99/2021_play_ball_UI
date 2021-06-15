package org.launchcode.play_ball_UI.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(name= "get-game-detail", procedureName= "play_ball.GetGameDetail",
        parameters= {
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "game_id", type= String.class),
        })

public class GameDetail {

        @Id
        private String gameId;
        private String date;
        private int gameNum;
        private String gameNumText;
        private String dayOfWeek;                             // 3
        private String startTime;
        private char dhUsedFlag;            // T/F          // 5
        private char dayNight;              // D/N
        private String dayNightText;
        private String visitTeam;
        private String visitTeamName;
        private String visitTeamCity;
        private char visitTeamLeague;
        private String visitTeamLeagueText;
        private String homeTeam;
        private String homeTeamName;
        private String homeTeamCity;
        private char homeTeamLeague;
        private String homeTeamLeagueText;
        private String ballparkId;                              // 9
        private String ballparkName;
        private String ballparkAka;
        private String ballparkCity;
        private String ballparkState;
        private String ballparkStartDate;
        private String ballparkEndDate;
        private String ballparkLeague;
        private String ballparkLeagueText;
        private String ballparkNotes;

        private String playerIdVisitStartingPitcher;          // 10
        private int playerPositionVisitStartingPitcher;
        private String playerPositionVisitStartingPitcherText;
        private String playerVisitStartingPitcherLastName;
        private String playerVisitStartingPitcherFirstName;
        private char playerVisitStartingPitcherBats;
        private String playerVisitStartingPitcherBatsText;
        private char playerVisitStartingPitcherThrows;
        private String playerVisitStartingPitcherThrowsText;

        private String playerIdHomeStartingPitcher;
        private int playerPositionHomeStartingPitcher;
        private String playerPositionHomeStartingPitcherText;
        private String playerHomeStartingPitcherLastName;
        private String playerHomeStartingPitcherFirstName;
        private char playerHomeStartingPitcherBats;
        private String playerHomeStartingPitcherBatsText;
        private char playerHomeStartingPitcherThrows;
        private String playerHomeStartingPitcherThrowsText;

        private String umpireIdHomePlate;
        private String umpireHomePlateLastName;
        private String umpireHomePlateFirstName;
        private String umpireHomePlateDebutDate;

        private String umpireIdFirstBase;
        private String umpireFirstBaseLastName;
        private String umpireFirstBaseFirstName;
        private String umpireFirstBaseDebutDate;

        private String umpireIdSecondBase;
        private String umpireSecondBaseLastName;
        private String umpireSecondBaseFirstName;
        private String umpireSecondBaseDebutDate;

        private String umpireIdThirdBase;                     // 15
        private String umpireThirdBaseLastName;
        private String umpireThirdBaseFirstName;
        private String umpireThirdBaseDebutDate;

        private String umpireIdLeftField;
        private String umpireLeftFieldLastName;
        private String umpireLeftFieldFirstName;
        private String umpireLeftFieldDebutDate;

        private String umpireIdRightField;
        private String umpireRightFieldLastName;
        private String umpireRightFieldFirstName;
        private String umpireRightFieldDebutDate;

        private int gameAttendance;
        private String psScorer;
        private String translator;                            // 20
        private String inputter;
        private String inputTime;
        private String editTime;
        private String howScored;
        private String pitchesEntered;                        // 25
        private int gameTemperature;
        private char gameWindDirection;
        private String gameWindDirectionText;
        private int gameWindSpeed;
        private char gameFieldCondition;
        private String gameFieldConditionText;
        private char gamePrecipitation;                     // 30
        private String gamePrecipitationText;
        private char gameSky;
        private String gameSkyText;
        private String gameTime;
        private int numberOfInnings;
        private int visitFinalScore;
        private int homeFinalScore;                           // 35
        private int visitHits;
        private int homeHits;
        private int visitErrors;
        private int homeErrors;
        private int visitLeftOnBase;                          // 40
        private int homeLeftOnBase;

        private String playerIdWinningPitcher;
        private int playerPositionWinningPitcher;
        private String playerPositionWinningPitcherText;
        private String playerWinningPitcherLastName;
        private String playerWinningPitcherFirstName;
        private char playerWinningPitcherBats;
        private String playerWinningPitcherBatsText;
        private char playerWinningPitcherThrows;
        private String playerWinningPitcherThrowsText;

        private String playerIdLosingPitcher;
        private int playerPositionLosingPitcher;
        private String playerPositionLosingPitcherText;
        private String playerLosingPitcherLastName;
        private String playerLosingPitcherFirstName;
        private char playerLosingPitcherBats;
        private String playerLosingPitcherBatsText;
        private char playerLosingPitcherThrows;
        private String playerLosingPitcherThrowsText;

        private String playerIdSaveFor;
        private int playerPositionSaveFor;
        private String playerPositionSaveForText;
        private String playerSaveForLastName;
        private String playerSaveForFirstName;
        private char playerSaveForBats;
        private String playerSaveForBatsText;
        private char playerSaveForThrows;
        private String playerSaveForThrowsText;

        private String playerIdWinningRbi;                // 45
        //private int playerPositionWinningRbi;
        //private String playerPositionWinningRbiText;
        private String playerWinningRbiLastName;
        private String playerWinningRbiFirstName;
        private char playerWinningRbiBats;
        private String playerWinningRbiBatsText;
        private char playerWinningRbiThrows;
        private String playerWinningRbiThrowsText;

//        private String playerIdVisit1;
//        private int playerPositionVisit1;
//        private String playerIdVisit2;
//        private int playerPositionVisit2;
//        private String playerIdVisit3;                        // 50
//        private int playerPositionVisit3;
//        private String playerIdVisit4;
//        private int playerPositionVisit4;
//        private String playerIdVisit5;
//        private int playerPositionVisit5;                     // 55
//        private String playerIdVisit6;
//        private int playerPositionVisit6;
//        private String playerIdVisit7;
//        private int playerPositionVisit7;
//        private String playerIdVisit8;                        // 60
//        private int playerPositionVisit8;
//        private String playerIdVisit9;
//        private int playerPositionVisit9;
//        private String playerIdHome1;
//        private int playerPositionHome1;                      // 65
//        private String playerIdHome2;
//        private int playerPositionHome2;
//        private String playerIdHome3;
//        private int playerPositionHome3;
//        private String playerIdHome4;                         // 70
//        private int playerPositionHome4;
//        private String playerIdHome5;
//        private int playerPositionHome5;
//        private String playerIdHome6;
//        private int playerPositionHome6;                      // 75
//        private String playerIdHome7;
//        private int playerPositionHome7;
//        private String playerIdHome8;
//        private int playerPositionHome8;
//        private String playerIdHome9;                         // 80
//        private int playerPositionHome9;

        private String playerIdVisitFinalPitcher;             // 46
        private int playerPositionVisitFinalPitcher;
        private String playerPositionVisitFinalPitcherText;
        private String playerVisitFinalPitcherLastName;
        private String playerVisitFinalPitcherFirstName;
        private char playerVisitFinalPitcherBats;
        private String playerVisitFinalPitcherBatsText;
        private char playerVisitFinalPitcherThrows;
        private String playerVisitFinalPitcherThrowsText;


        private String playerIdHomeFinalPitcher;              // 47
        private int playerPositionHomeFinalPitcher;
        private String playerPositionHomeFinalPitcherText;
        private String playerHomeFinalPitcherLastName;
        private String playerHomeFinalPitcherFirstName;
        private char playerHomeFinalPitcherBats;
        private String playerHomeFinalPitcherBatsText;
        private char playerHomeFinalPitcherThrows;
        private String playerHomeFinalPitcherThrowsText;

        private int year;
        private char gameType;
        private String gameTypeText;

        public String getGameId() {
                return gameId;
        }

        public void setGameId(String gameId) {
                this.gameId = gameId;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }

        public int getGameNum() {
                return gameNum;
        }

        public void setGameNum(int gameNum) {
                this.gameNum = gameNum;
        }

        public String getGameNumText() {
                return gameNumText;
        }

        public void setGameNumText(String gameNumText) {
                this.gameNumText = gameNumText;
        }

        public String getDayOfWeek() {
                return dayOfWeek;
        }

        public void setDayOfWeek(String dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
        }

        public String getStartTime() {
                return startTime;
        }

        public void setStartTime(String startTime) {
                this.startTime = startTime;
        }

        public char getDhUsedFlag() {
                return dhUsedFlag;
        }

        public void setDhUsedFlag(char dhUsedFlag) {
                this.dhUsedFlag = dhUsedFlag;
        }

        public char getDayNight() {
                return dayNight;
        }

        public void setDayNight(char dayNight) {
                this.dayNight = dayNight;
        }

        public String getDayNightText() {
                return dayNightText;
        }

        public void setDayNightText(String dayNightText) {
                this.dayNightText = dayNightText;
        }

        public String getVisitTeam() {
                return visitTeam;
        }

        public void setVisitTeam(String visitTeam) {
                this.visitTeam = visitTeam;
        }

        public String getVisitTeamName() {
                return visitTeamName;
        }

        public void setVisitTeamName(String visitTeamName) {
                this.visitTeamName = visitTeamName;
        }

        public String getVisitTeamCity() {
                return visitTeamCity;
        }

        public void setVisitTeamCity(String visitTeamCity) {
                this.visitTeamCity = visitTeamCity;
        }

        public char getVisitTeamLeague() {
                return visitTeamLeague;
        }

        public void setVisitTeamLeague(char visitTeamLeague) {
                this.visitTeamLeague = visitTeamLeague;
        }

        public String getVisitTeamLeagueText() {
                return visitTeamLeagueText;
        }

        public void setVisitTeamLeagueText(String visitTeamLeagueText) {
                this.visitTeamLeagueText = visitTeamLeagueText;
        }

        public String getHomeTeam() {
                return homeTeam;
        }

        public void setHomeTeam(String homeTeam) {
                this.homeTeam = homeTeam;
        }

        public String getHomeTeamName() {
                return homeTeamName;
        }

        public void setHomeTeamName(String homeTeamName) {
                this.homeTeamName = homeTeamName;
        }

        public String getHomeTeamCity() {
                return homeTeamCity;
        }

        public void setHomeTeamCity(String homeTeamCity) {
                this.homeTeamCity = homeTeamCity;
        }

        public char getHomeTeamLeague() {
                return homeTeamLeague;
        }

        public void setHomeTeamLeague(char homeTeamLeague) {
                this.homeTeamLeague = homeTeamLeague;
        }

        public String getHomeTeamLeagueText() {
                return homeTeamLeagueText;
        }

        public void setHomeTeamLeagueText(String homeTeamLeagueText) {
                this.homeTeamLeagueText = homeTeamLeagueText;
        }

        public String getBallparkId() {
                return ballparkId;
        }

        public void setBallparkId(String ballparkId) {
                this.ballparkId = ballparkId;
        }

        public String getBallparkName() {
                return ballparkName;
        }

        public void setBallparkName(String ballparkName) {
                this.ballparkName = ballparkName;
        }

        public String getBallparkAka() {
                return ballparkAka;
        }

        public void setBallparkAka(String ballparkAka) {
                this.ballparkAka = ballparkAka;
        }

        public String getBallparkCity() {
                return ballparkCity;
        }

        public void setBallparkCity(String ballparkCity) {
                this.ballparkCity = ballparkCity;
        }

        public String getBallparkState() {
                return ballparkState;
        }

        public void setBallparkState(String ballparkState) {
                this.ballparkState = ballparkState;
        }

        public String getBallparkStartDate() {
                return ballparkStartDate;
        }

        public void setBallparkStartDate(String ballparkStartDate) {
                this.ballparkStartDate = ballparkStartDate;
        }

        public String getBallparkEndDate() {
                return ballparkEndDate;
        }

        public void setBallparkEndDate(String ballparkEndDate) {
                this.ballparkEndDate = ballparkEndDate;
        }

        public String getBallparkLeague() {
                return ballparkLeague;
        }

        public void setBallparkLeague(String ballparkLeague) {
                this.ballparkLeague = ballparkLeague;
        }

        public String getBallparkLeagueText() {
                return ballparkLeagueText;
        }

        public void setBallparkLeagueText(String ballparkLeagueText) {
                this.ballparkLeagueText = ballparkLeagueText;
        }

        public String getBallparkNotes() {
                return ballparkNotes;
        }

        public void setBallparkNotes(String ballparkNotes) {
                this.ballparkNotes = ballparkNotes;
        }

        public String getPlayerIdVisitStartingPitcher() {
                return playerIdVisitStartingPitcher;
        }

        public void setPlayerIdVisitStartingPitcher(String playerIdVisitStartingPitcher) {
                this.playerIdVisitStartingPitcher = playerIdVisitStartingPitcher;
        }

        public int getPlayerPositionVisitStartingPitcher() {
                return playerPositionVisitStartingPitcher;
        }

        public void setPlayerPositionVisitStartingPitcher(int playerPositionVisitStartingPitcher) {
                this.playerPositionVisitStartingPitcher = playerPositionVisitStartingPitcher;
        }

        public String getPlayerPositionVisitStartingPitcherText() {
                return playerPositionVisitStartingPitcherText;
        }

        public void setPlayerPositionVisitStartingPitcherText(String playerPositionVisitStartingPitcherText) {
                this.playerPositionVisitStartingPitcherText = playerPositionVisitStartingPitcherText;
        }

        public String getPlayerVisitStartingPitcherLastName() {
                return playerVisitStartingPitcherLastName;
        }

        public void setPlayerVisitStartingPitcherLastName(String playerVisitStartingPitcherLastName) {
                this.playerVisitStartingPitcherLastName = playerVisitStartingPitcherLastName;
        }

        public String getPlayerVisitStartingPitcherFirstName() {
                return playerVisitStartingPitcherFirstName;
        }

        public void setPlayerVisitStartingPitcherFirstName(String playerVisitStartingPitcherFirstName) {
                this.playerVisitStartingPitcherFirstName = playerVisitStartingPitcherFirstName;
        }

        public char getPlayerVisitStartingPitcherBats() {
                return playerVisitStartingPitcherBats;
        }

        public void setPlayerVisitStartingPitcherBats(char playerVisitStartingPitcherBats) {
                this.playerVisitStartingPitcherBats = playerVisitStartingPitcherBats;
        }

        public String getPlayerVisitStartingPitcherBatsText() {
                return playerVisitStartingPitcherBatsText;
        }

        public void setPlayerVisitStartingPitcherBatsText(String playerVisitStartingPitcherBatsText) {
                this.playerVisitStartingPitcherBatsText = playerVisitStartingPitcherBatsText;
        }

        public char getPlayerVisitStartingPitcherThrows() {
                return playerVisitStartingPitcherThrows;
        }

        public void setPlayerVisitStartingPitcherThrows(char playerVisitStartingPitcherThrows) {
                this.playerVisitStartingPitcherThrows = playerVisitStartingPitcherThrows;
        }

        public String getPlayerVisitStartingPitcherThrowsText() {
                return playerVisitStartingPitcherThrowsText;
        }

        public void setPlayerVisitStartingPitcherThrowsText(String playerVisitStartingPitcherThrowsText) {
                this.playerVisitStartingPitcherThrowsText = playerVisitStartingPitcherThrowsText;
        }

        public String getPlayerIdHomeStartingPitcher() {
                return playerIdHomeStartingPitcher;
        }

        public void setPlayerIdHomeStartingPitcher(String playerIdHomeStartingPitcher) {
                this.playerIdHomeStartingPitcher = playerIdHomeStartingPitcher;
        }

        public int getPlayerPositionHomeStartingPitcher() {
                return playerPositionHomeStartingPitcher;
        }

        public void setPlayerPositionHomeStartingPitcher(int playerPositionHomeStartingPitcher) {
                this.playerPositionHomeStartingPitcher = playerPositionHomeStartingPitcher;
        }

        public String getPlayerPositionHomeStartingPitcherText() {
                return playerPositionHomeStartingPitcherText;
        }

        public void setPlayerPositionHomeStartingPitcherText(String playerPositionHomeStartingPitcherText) {
                this.playerPositionHomeStartingPitcherText = playerPositionHomeStartingPitcherText;
        }

        public String getPlayerHomeStartingPitcherLastName() {
                return playerHomeStartingPitcherLastName;
        }

        public void setPlayerHomeStartingPitcherLastName(String playerHomeStartingPitcherLastName) {
                this.playerHomeStartingPitcherLastName = playerHomeStartingPitcherLastName;
        }

        public String getPlayerHomeStartingPitcherFirstName() {
                return playerHomeStartingPitcherFirstName;
        }

        public void setPlayerHomeStartingPitcherFirstName(String playerHomeStartingPitcherFirstName) {
                this.playerHomeStartingPitcherFirstName = playerHomeStartingPitcherFirstName;
        }

        public char getPlayerHomeStartingPitcherBats() {
                return playerHomeStartingPitcherBats;
        }

        public void setPlayerHomeStartingPitcherBats(char playerHomeStartingPitcherBats) {
                this.playerHomeStartingPitcherBats = playerHomeStartingPitcherBats;
        }

        public String getPlayerHomeStartingPitcherBatsText() {
                return playerHomeStartingPitcherBatsText;
        }

        public void setPlayerHomeStartingPitcherBatsText(String playerHomeStartingPitcherBatsText) {
                this.playerHomeStartingPitcherBatsText = playerHomeStartingPitcherBatsText;
        }

        public char getPlayerHomeStartingPitcherThrows() {
                return playerHomeStartingPitcherThrows;
        }

        public void setPlayerHomeStartingPitcherThrows(char playerHomeStartingPitcherThrows) {
                this.playerHomeStartingPitcherThrows = playerHomeStartingPitcherThrows;
        }

        public String getPlayerHomeStartingPitcherThrowsText() {
                return playerHomeStartingPitcherThrowsText;
        }

        public void setPlayerHomeStartingPitcherThrowsText(String playerHomeStartingPitcherThrowsText) {
                this.playerHomeStartingPitcherThrowsText = playerHomeStartingPitcherThrowsText;
        }

        public String getUmpireIdHomePlate() {
                return umpireIdHomePlate;
        }

        public void setUmpireIdHomePlate(String umpireIdHomePlate) {
                this.umpireIdHomePlate = umpireIdHomePlate;
        }

        public String getUmpireHomePlateLastName() {
                return umpireHomePlateLastName;
        }

        public void setUmpireHomePlateLastName(String umpireHomePlateLastName) {
                this.umpireHomePlateLastName = umpireHomePlateLastName;
        }

        public String getUmpireHomePlateFirstName() {
                return umpireHomePlateFirstName;
        }

        public void setUmpireHomePlateFirstName(String umpireHomePlateFirstName) {
                this.umpireHomePlateFirstName = umpireHomePlateFirstName;
        }

        public String getUmpireIdFirstBase() {
                return umpireIdFirstBase;
        }

        public void setUmpireIdFirstBase(String umpireIdFirstBase) {
                this.umpireIdFirstBase = umpireIdFirstBase;
        }

        public String getUmpireFirstBaseLastName() {
                return umpireFirstBaseLastName;
        }

        public void setUmpireFirstBaseLastName(String umpireFirstBaseLastName) {
                this.umpireFirstBaseLastName = umpireFirstBaseLastName;
        }

        public String getUmpireFirstBaseFirstName() {
                return umpireFirstBaseFirstName;
        }

        public void setUmpireFirstBaseFirstName(String umpireFirstBaseFirstName) {
                this.umpireFirstBaseFirstName = umpireFirstBaseFirstName;
        }

        public String getUmpireIdSecondBase() {
                return umpireIdSecondBase;
        }

        public void setUmpireIdSecondBase(String umpireIdSecondBase) {
                this.umpireIdSecondBase = umpireIdSecondBase;
        }

        public String getUmpireSecondBaseLastName() {
                return umpireSecondBaseLastName;
        }

        public void setUmpireSecondBaseLastName(String umpireSecondBaseLastName) {
                this.umpireSecondBaseLastName = umpireSecondBaseLastName;
        }

        public String getUmpireSecondBaseFirstName() {
                return umpireSecondBaseFirstName;
        }

        public void setUmpireSecondBaseFirstName(String umpireSecondBaseFirstName) {
                this.umpireSecondBaseFirstName = umpireSecondBaseFirstName;
        }

        public String getUmpireIdThirdBase() {
                return umpireIdThirdBase;
        }

        public void setUmpireIdThirdBase(String umpireIdThirdBase) {
                this.umpireIdThirdBase = umpireIdThirdBase;
        }

        public String getUmpireThirdBaseLastName() {
                return umpireThirdBaseLastName;
        }

        public void setUmpireThirdBaseLastName(String umpireThirdBaseLastName) {
                this.umpireThirdBaseLastName = umpireThirdBaseLastName;
        }

        public String getUmpireThirdBaseFirstName() {
                return umpireThirdBaseFirstName;
        }

        public void setUmpireThirdBaseFirstName(String umpireThirdBaseFirstName) {
                this.umpireThirdBaseFirstName = umpireThirdBaseFirstName;
        }

        public String getUmpireIdLeftField() {
                return umpireIdLeftField;
        }

        public void setUmpireIdLeftField(String umpireIdLeftField) {
                this.umpireIdLeftField = umpireIdLeftField;
        }

        public String getUmpireLeftFieldLastName() {
                return umpireLeftFieldLastName;
        }

        public void setUmpireLeftFieldLastName(String umpireLeftFieldLastName) {
                this.umpireLeftFieldLastName = umpireLeftFieldLastName;
        }

        public String getUmpireLeftFieldFirstName() {
                return umpireLeftFieldFirstName;
        }

        public void setUmpireLeftFieldFirstName(String umpireLeftFieldFirstName) {
                this.umpireLeftFieldFirstName = umpireLeftFieldFirstName;
        }

        public String getUmpireIdRightField() {
                return umpireIdRightField;
        }

        public void setUmpireIdRightField(String umpireIdRightField) {
                this.umpireIdRightField = umpireIdRightField;
        }

        public String getUmpireRightFieldLastName() {
                return umpireRightFieldLastName;
        }

        public void setUmpireRightFieldLastName(String umpireRightFieldLastName) {
                this.umpireRightFieldLastName = umpireRightFieldLastName;
        }

        public String getUmpireRightFieldFirstName() {
                return umpireRightFieldFirstName;
        }

        public void setUmpireRightFieldFirstName(String umpireRightFieldFirstName) {
                this.umpireRightFieldFirstName = umpireRightFieldFirstName;
        }

        public int getGameAttendance() {
                return gameAttendance;
        }

        public void setGameAttendance(int gameAttendance) {
                this.gameAttendance = gameAttendance;
        }

        public String getPsScorer() {
                return psScorer;
        }

        public void setPsScorer(String psScorer) {
                this.psScorer = psScorer;
        }

        public String getTranslator() {
                return translator;
        }

        public void setTranslator(String translator) {
                this.translator = translator;
        }

        public String getInputter() {
                return inputter;
        }

        public void setInputter(String inputter) {
                this.inputter = inputter;
        }

        public String getInputTime() {
                return inputTime;
        }

        public void setInputTime(String inputTime) {
                this.inputTime = inputTime;
        }

        public String getEditTime() {
                return editTime;
        }

        public void setEditTime(String editTime) {
                this.editTime = editTime;
        }

        public String getHowScored() {
                return howScored;
        }

        public void setHowScored(String howScored) {
                this.howScored = howScored;
        }

        public String getPitchesEntered() {
                return pitchesEntered;
        }

        public void setPitchesEntered(String pitchesEntered) {
                this.pitchesEntered = pitchesEntered;
        }

        public int getGameTemperature() {
                return gameTemperature;
        }

        public void setGameTemperature(int gameTemperature) {
                this.gameTemperature = gameTemperature;
        }

        public char getGameWindDirection() {
                return gameWindDirection;
        }

        public void setGameWindDirection(char gameWindDirection) {
                this.gameWindDirection = gameWindDirection;
        }

        public String getGameWindDirectionText() {
                return gameWindDirectionText;
        }

        public void setGameWindDirectionText(String gameWindDirectionText) {
                this.gameWindDirectionText = gameWindDirectionText;
        }

        public int getGameWindSpeed() {
                return gameWindSpeed;
        }

        public void setGameWindSpeed(int gameWindSpeed) {
                this.gameWindSpeed = gameWindSpeed;
        }

        public char getGameFieldCondition() {
                return gameFieldCondition;
        }

        public void setGameFieldCondition(char gameFieldCondition) {
                this.gameFieldCondition = gameFieldCondition;
        }

        public String getGameFieldConditionText() {
                return gameFieldConditionText;
        }

        public void setGameFieldConditionText(String gameFieldConditionText) {
                this.gameFieldConditionText = gameFieldConditionText;
        }

        public char getGamePrecipitation() {
                return gamePrecipitation;
        }

        public void setGamePrecipitation(char gamePrecipitation) {
                this.gamePrecipitation = gamePrecipitation;
        }

        public String getGamePrecipitationText() {
                return gamePrecipitationText;
        }

        public void setGamePrecipitationText(String gamePrecipitationText) {
                this.gamePrecipitationText = gamePrecipitationText;
        }

        public char getGameSky() {
                return gameSky;
        }

        public void setGameSky(char gameSky) {
                this.gameSky = gameSky;
        }

        public String getGameSkyText() {
                return gameSkyText;
        }

        public void setGameSkyText(String gameSkyText) {
                this.gameSkyText = gameSkyText;
        }

        public String getGameTime() {
                return gameTime;
        }

        public void setGameTime(String gameTime) {
                this.gameTime = gameTime;
        }

        public int getNumberOfInnings() {
                return numberOfInnings;
        }

        public void setNumberOfInnings(int numberOfInnings) {
                this.numberOfInnings = numberOfInnings;
        }

        public int getVisitFinalScore() {
                return visitFinalScore;
        }

        public void setVisitFinalScore(int visitFinalScore) {
                this.visitFinalScore = visitFinalScore;
        }

        public int getHomeFinalScore() {
                return homeFinalScore;
        }

        public void setHomeFinalScore(int homeFinalScore) {
                this.homeFinalScore = homeFinalScore;
        }

        public int getVisitHits() {
                return visitHits;
        }

        public void setVisitHits(int visitHits) {
                this.visitHits = visitHits;
        }

        public int getHomeHits() {
                return homeHits;
        }

        public void setHomeHits(int homeHits) {
                this.homeHits = homeHits;
        }

        public int getVisitErrors() {
                return visitErrors;
        }

        public void setVisitErrors(int visitErrors) {
                this.visitErrors = visitErrors;
        }

        public int getHomeErrors() {
                return homeErrors;
        }

        public void setHomeErrors(int homeErrors) {
                this.homeErrors = homeErrors;
        }

        public int getVisitLeftOnBase() {
                return visitLeftOnBase;
        }

        public void setVisitLeftOnBase(int visitLeftOnBase) {
                this.visitLeftOnBase = visitLeftOnBase;
        }

        public int getHomeLeftOnBase() {
                return homeLeftOnBase;
        }

        public void setHomeLeftOnBase(int homeLeftOnBase) {
                this.homeLeftOnBase = homeLeftOnBase;
        }

        public String getPlayerIdWinningPitcher() {
                return playerIdWinningPitcher;
        }

        public void setPlayerIdWinningPitcher(String playerIdWinningPitcher) {
                this.playerIdWinningPitcher = playerIdWinningPitcher;
        }

        public int getPlayerPositionWinningPitcher() {
                return playerPositionWinningPitcher;
        }

        public void setPlayerPositionWinningPitcher(int playerPositionWinningPitcher) {
                this.playerPositionWinningPitcher = playerPositionWinningPitcher;
        }

        public String getPlayerPositionWinningPitcherText() {
                return playerPositionWinningPitcherText;
        }

        public void setPlayerPositionWinningPitcherText(String playerPositionWinningPitcherText) {
                this.playerPositionWinningPitcherText = playerPositionWinningPitcherText;
        }

        public String getPlayerWinningPitcherLastName() {
                return playerWinningPitcherLastName;
        }

        public void setPlayerWinningPitcherLastName(String playerWinningPitcherLastName) {
                this.playerWinningPitcherLastName = playerWinningPitcherLastName;
        }

        public String getPlayerWinningPitcherFirstName() {
                return playerWinningPitcherFirstName;
        }

        public void setPlayerWinningPitcherFirstName(String playerWinningPitcherFirstName) {
                this.playerWinningPitcherFirstName = playerWinningPitcherFirstName;
        }

        public char getPlayerWinningPitcherBats() {
                return playerWinningPitcherBats;
        }

        public void setPlayerWinningPitcherBats(char playerWinningPitcherBats) {
                this.playerWinningPitcherBats = playerWinningPitcherBats;
        }

        public String getPlayerWinningPitcherBatsText() {
                return playerWinningPitcherBatsText;
        }

        public void setPlayerWinningPitcherBatsText(String playerWinningPitcherBatsText) {
                this.playerWinningPitcherBatsText = playerWinningPitcherBatsText;
        }

        public char getPlayerWinningPitcherThrows() {
                return playerWinningPitcherThrows;
        }

        public void setPlayerWinningPitcherThrows(char playerWinningPitcherThrows) {
                this.playerWinningPitcherThrows = playerWinningPitcherThrows;
        }

        public String getPlayerWinningPitcherThrowsText() {
                return playerWinningPitcherThrowsText;
        }

        public void setPlayerWinningPitcherThrowsText(String playerWinningPitcherThrowsText) {
                this.playerWinningPitcherThrowsText = playerWinningPitcherThrowsText;
        }

        public String getPlayerIdLosingPitcher() {
                return playerIdLosingPitcher;
        }

        public void setPlayerIdLosingPitcher(String playerIdLosingPitcher) {
                this.playerIdLosingPitcher = playerIdLosingPitcher;
        }

        public int getPlayerPositionLosingPitcher() {
                return playerPositionLosingPitcher;
        }

        public void setPlayerPositionLosingPitcher(int playerPositionLosingPitcher) {
                this.playerPositionLosingPitcher = playerPositionLosingPitcher;
        }

        public String getPlayerPositionLosingPitcherText() {
                return playerPositionLosingPitcherText;
        }

        public void setPlayerPositionLosingPitcherText(String playerPositionLosingPitcherText) {
                this.playerPositionLosingPitcherText = playerPositionLosingPitcherText;
        }

        public String getPlayerLosingPitcherLastName() {
                return playerLosingPitcherLastName;
        }

        public void setPlayerLosingPitcherLastName(String playerLosingPitcherLastName) {
                this.playerLosingPitcherLastName = playerLosingPitcherLastName;
        }

        public String getPlayerLosingPitcherFirstName() {
                return playerLosingPitcherFirstName;
        }

        public void setPlayerLosingPitcherFirstName(String playerLosingPitcherFirstName) {
                this.playerLosingPitcherFirstName = playerLosingPitcherFirstName;
        }

        public char getPlayerLosingPitcherBats() {
                return playerLosingPitcherBats;
        }

        public void setPlayerLosingPitcherBats(char playerLosingPitcherBats) {
                this.playerLosingPitcherBats = playerLosingPitcherBats;
        }

        public String getPlayerLosingPitcherBatsText() {
                return playerLosingPitcherBatsText;
        }

        public void setPlayerLosingPitcherBatsText(String playerLosingPitcherBatsText) {
                this.playerLosingPitcherBatsText = playerLosingPitcherBatsText;
        }

        public char getPlayerLosingPitcherThrows() {
                return playerLosingPitcherThrows;
        }

        public void setPlayerLosingPitcherThrows(char playerLosingPitcherThrows) {
                this.playerLosingPitcherThrows = playerLosingPitcherThrows;
        }

        public String getPlayerLosingPitcherThrowsText() {
                return playerLosingPitcherThrowsText;
        }

        public void setPlayerLosingPitcherThrowsText(String playerLosingPitcherThrowsText) {
                this.playerLosingPitcherThrowsText = playerLosingPitcherThrowsText;
        }

        public String getPlayerIdSaveFor() {
                return playerIdSaveFor;
        }

        public void setPlayerIdSaveFor(String playerIdSaveFor) {
                this.playerIdSaveFor = playerIdSaveFor;
        }

        public int getPlayerPositionSaveFor() {
                return playerPositionSaveFor;
        }

        public void setPlayerPositionSaveFor(int playerPositionSaveFor) {
                this.playerPositionSaveFor = playerPositionSaveFor;
        }

        public String getPlayerPositionSaveForText() {
                return playerPositionSaveForText;
        }

        public void setPlayerPositionSaveForText(String playerPositionSaveForText) {
                this.playerPositionSaveForText = playerPositionSaveForText;
        }

        public String getPlayerSaveForLastName() {
                return playerSaveForLastName;
        }

        public void setPlayerSaveForLastName(String playerSaveForLastName) {
                this.playerSaveForLastName = playerSaveForLastName;
        }

        public String getPlayerSaveForFirstName() {
                return playerSaveForFirstName;
        }

        public void setPlayerSaveForFirstName(String playerSaveForFirstName) {
                this.playerSaveForFirstName = playerSaveForFirstName;
        }

        public char getPlayerSaveForBats() {
                return playerSaveForBats;
        }

        public void setPlayerSaveForBats(char playerSaveForBats) {
                this.playerSaveForBats = playerSaveForBats;
        }

        public String getPlayerSaveForBatsText() {
                return playerSaveForBatsText;
        }

        public void setPlayerSaveForBatsText(String playerSaveForBatsText) {
                this.playerSaveForBatsText = playerSaveForBatsText;
        }

        public char getPlayerSaveForThrows() {
                return playerSaveForThrows;
        }

        public void setPlayerSaveForThrows(char playerSaveForThrows) {
                this.playerSaveForThrows = playerSaveForThrows;
        }

        public String getPlayerSaveForThrowsText() {
                return playerSaveForThrowsText;
        }

        public void setPlayerSaveForThrowsText(String playerSaveForThrowsText) {
                this.playerSaveForThrowsText = playerSaveForThrowsText;
        }

        public String getPlayerIdWinningRbi() {
                return playerIdWinningRbi;
        }

        public void setPlayerIdWinningRbi(String playerIdWinningRbi) {
                this.playerIdWinningRbi = playerIdWinningRbi;
        }

//        public int getPlayerPositionWinningRbi() {
//                return playerPositionWinningRbi;
//        }
//
//        public void setPlayerPositionWinningRbi(int playerPositionWinningRbi) {
//                this.playerPositionWinningRbi = playerPositionWinningRbi;
//        }

//        public String getPlayerPositionWinningRbiText() {
//                return playerPositionWinningRbiText;
//        }
//
//        public void setPlayerPositionWinningRbiText(String playerPositionWinningRbiText) {
//                this.playerPositionWinningRbiText = playerPositionWinningRbiText;
//        }

        public String getPlayerWinningRbiLastName() {
                return playerWinningRbiLastName;
        }

        public void setPlayerWinningRbiLastName(String playerWinningRbiLastName) {
                this.playerWinningRbiLastName = playerWinningRbiLastName;
        }

        public String getPlayerWinningRbiFirstName() {
                return playerWinningRbiFirstName;
        }

        public void setPlayerWinningRbiFirstName(String playerWinningRbiFirstName) {
                this.playerWinningRbiFirstName = playerWinningRbiFirstName;
        }

        public char getPlayerWinningRbiBats() {
                return playerWinningRbiBats;
        }

        public void setPlayerWinningRbiBats(char playerWinningRbiBats) {
                this.playerWinningRbiBats = playerWinningRbiBats;
        }

        public String getPlayerWinningRbiBatsText() {
                return playerWinningRbiBatsText;
        }

        public void setPlayerWinningRbiBatsText(String playerWinningRbiBatsText) {
                this.playerWinningRbiBatsText = playerWinningRbiBatsText;
        }

        public char getPlayerWinningRbiThrows() {
                return playerWinningRbiThrows;
        }

        public void setPlayerWinningRbiThrows(char playerWinningRbiThrows) {
                this.playerWinningRbiThrows = playerWinningRbiThrows;
        }

        public String getPlayerWinningRbiThrowsText() {
                return playerWinningRbiThrowsText;
        }

        public void setPlayerWinningRbiThrowsText(String playerWinningRbiThrowsText) {
                this.playerWinningRbiThrowsText = playerWinningRbiThrowsText;
        }

        public String getPlayerIdVisitFinalPitcher() {
                return playerIdVisitFinalPitcher;
        }

        public void setPlayerIdVisitFinalPitcher(String playerIdVisitFinalPitcher) {
                this.playerIdVisitFinalPitcher = playerIdVisitFinalPitcher;
        }

        public int getPlayerPositionVisitFinalPitcher() {
                return playerPositionVisitFinalPitcher;
        }

        public void setPlayerPositionVisitFinalPitcher(int playerPositionVisitFinalPitcher) {
                this.playerPositionVisitFinalPitcher = playerPositionVisitFinalPitcher;
        }

        public String getPlayerPositionVisitFinalPitcherText() {
                return playerPositionVisitFinalPitcherText;
        }

        public void setPlayerPositionVisitFinalPitcherText(String playerPositionVisitFinalPitcherText) {
                this.playerPositionVisitFinalPitcherText = playerPositionVisitFinalPitcherText;
        }

        public String getPlayerVisitFinalPitcherLastName() {
                return playerVisitFinalPitcherLastName;
        }

        public void setPlayerVisitFinalPitcherLastName(String playerVisitFinalPitcherLastName) {
                this.playerVisitFinalPitcherLastName = playerVisitFinalPitcherLastName;
        }

        public String getPlayerVisitFinalPitcherFirstName() {
                return playerVisitFinalPitcherFirstName;
        }

        public void setPlayerVisitFinalPitcherFirstName(String playerVisitFinalPitcherFirstName) {
                this.playerVisitFinalPitcherFirstName = playerVisitFinalPitcherFirstName;
        }

        public char getPlayerVisitFinalPitcherBats() {
                return playerVisitFinalPitcherBats;
        }

        public void setPlayerVisitFinalPitcherBats(char playerVisitFinalPitcherBats) {
                this.playerVisitFinalPitcherBats = playerVisitFinalPitcherBats;
        }

        public String getPlayerVisitFinalPitcherBatsText() {
                return playerVisitFinalPitcherBatsText;
        }

        public void setPlayerVisitFinalPitcherBatsText(String playerVisitFinalPitcherBatsText) {
                this.playerVisitFinalPitcherBatsText = playerVisitFinalPitcherBatsText;
        }

        public char getPlayerVisitFinalPitcherThrows() {
                return playerVisitFinalPitcherThrows;
        }

        public void setPlayerVisitFinalPitcherThrows(char playerVisitFinalPitcherThrows) {
                this.playerVisitFinalPitcherThrows = playerVisitFinalPitcherThrows;
        }

        public String getPlayerVisitFinalPitcherThrowsText() {
                return playerVisitFinalPitcherThrowsText;
        }

        public void setPlayerVisitFinalPitcherThrowsText(String playerVisitFinalPitcherThrowsText) {
                this.playerVisitFinalPitcherThrowsText = playerVisitFinalPitcherThrowsText;
        }

        public String getPlayerIdHomeFinalPitcher() {
                return playerIdHomeFinalPitcher;
        }

        public void setPlayerIdHomeFinalPitcher(String playerIdHomeFinalPitcher) {
                this.playerIdHomeFinalPitcher = playerIdHomeFinalPitcher;
        }

        public int getPlayerPositionHomeFinalPitcher() {
                return playerPositionHomeFinalPitcher;
        }

        public void setPlayerPositionHomeFinalPitcher(int playerPositionHomeFinalPitcher) {
                this.playerPositionHomeFinalPitcher = playerPositionHomeFinalPitcher;
        }

        public String getPlayerPositionHomeFinalPitcherText() {
                return playerPositionHomeFinalPitcherText;
        }

        public void setPlayerPositionHomeFinalPitcherText(String playerPositionHomeFinalPitcherText) {
                this.playerPositionHomeFinalPitcherText = playerPositionHomeFinalPitcherText;
        }

        public String getPlayerHomeFinalPitcherLastName() {
                return playerHomeFinalPitcherLastName;
        }

        public void setPlayerHomeFinalPitcherLastName(String playerHomeFinalPitcherLastName) {
                this.playerHomeFinalPitcherLastName = playerHomeFinalPitcherLastName;
        }

        public String getPlayerHomeFinalPitcherFirstName() {
                return playerHomeFinalPitcherFirstName;
        }

        public void setPlayerHomeFinalPitcherFirstName(String playerHomeFinalPitcherFirstName) {
                this.playerHomeFinalPitcherFirstName = playerHomeFinalPitcherFirstName;
        }

        public char getPlayerHomeFinalPitcherBats() {
                return playerHomeFinalPitcherBats;
        }

        public void setPlayerHomeFinalPitcherBats(char playerHomeFinalPitcherBats) {
                this.playerHomeFinalPitcherBats = playerHomeFinalPitcherBats;
        }

        public String getPlayerHomeFinalPitcherBatsText() {
                return playerHomeFinalPitcherBatsText;
        }

        public void setPlayerHomeFinalPitcherBatsText(String playerHomeFinalPitcherBatsText) {
                this.playerHomeFinalPitcherBatsText = playerHomeFinalPitcherBatsText;
        }

        public char getPlayerHomeFinalPitcherThrows() {
                return playerHomeFinalPitcherThrows;
        }

        public void setPlayerHomeFinalPitcherThrows(char playerHomeFinalPitcherThrows) {
                this.playerHomeFinalPitcherThrows = playerHomeFinalPitcherThrows;
        }

        public String getPlayerHomeFinalPitcherThrowsText() {
                return playerHomeFinalPitcherThrowsText;
        }

        public void setPlayerHomeFinalPitcherThrowsText(String playerHomeFinalPitcherThrowsText) {
                this.playerHomeFinalPitcherThrowsText = playerHomeFinalPitcherThrowsText;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public char getGameType() {
                return gameType;
        }

        public void setGameType(char gameType) {
                this.gameType = gameType;
        }

        public String getGameTypeText() {
                return gameTypeText;
        }

        public String getUmpireHomePlateDebutDate() {
                return umpireHomePlateDebutDate;
        }

        public void setUmpireHomePlateDebutDate(String umpireHomePlateDebutDate) {
                this.umpireHomePlateDebutDate = umpireHomePlateDebutDate;
        }

        public String getUmpireFirstBaseDebutDate() {
                return umpireFirstBaseDebutDate;
        }

        public void setUmpireFirstBaseDebutDate(String umpireFirstBaseDebutDate) {
                this.umpireFirstBaseDebutDate = umpireFirstBaseDebutDate;
        }

        public String getUmpireSecondBaseDebutDate() {
                return umpireSecondBaseDebutDate;
        }

        public void setUmpireSecondBaseDebutDate(String umpireSecondBaseDebutDate) {
                this.umpireSecondBaseDebutDate = umpireSecondBaseDebutDate;
        }

        public String getUmpireThirdBaseDebutDate() {
                return umpireThirdBaseDebutDate;
        }

        public void setUmpireThirdBaseDebutDate(String umpireThirdBaseDebutDate) {
                this.umpireThirdBaseDebutDate = umpireThirdBaseDebutDate;
        }

        public String getUmpireLeftFieldDebutDate() {
                return umpireLeftFieldDebutDate;
        }

        public void setUmpireLeftFieldDebutDate(String umpireLeftFieldDebutDate) {
                this.umpireLeftFieldDebutDate = umpireLeftFieldDebutDate;
        }

        public String getUmpireRightFieldDebutDate() {
                return umpireRightFieldDebutDate;
        }

        public void setUmpireRightFieldDebutDate(String umpireRightFieldDebutDate) {
                this.umpireRightFieldDebutDate = umpireRightFieldDebutDate;
        }

        public void setGameTypeText(String gameTypeText) {
                this.gameTypeText = gameTypeText;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof GameDetail)) return false;
                GameDetail that = (GameDetail) o;
                return Objects.equals(getGameId(), that.getGameId());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getGameId());
        }

        @Override
        public String toString() {
                return "GameDetail{" +
                        "gameId='" + gameId + '\'' +
                        ", date='" + date + '\'' +
                        ", gameNum=" + gameNum +
                        ", gameNumText='" + gameNumText + '\'' +
                        ", dayOfWeek='" + dayOfWeek + '\'' +
                        ", startTime='" + startTime + '\'' +
                        ", dhUsedFlag=" + dhUsedFlag +
                        ", dayNight=" + dayNight +
                        ", dayNightText='" + dayNightText + '\'' +
                        ", visitTeam='" + visitTeam + '\'' +
                        ", visitTeamName='" + visitTeamName + '\'' +
                        ", visitTeamCity='" + visitTeamCity + '\'' +
                        ", visitTeamLeague=" + visitTeamLeague +
                        ", visitTeamLeagueText='" + visitTeamLeagueText + '\'' +
                        ", homeTeam='" + homeTeam + '\'' +
                        ", homeTeamName='" + homeTeamName + '\'' +
                        ", homeTeamCity='" + homeTeamCity + '\'' +
                        ", homeTeamLeague=" + homeTeamLeague +
                        ", homeTeamLeagueText='" + homeTeamLeagueText + '\'' +
                        ", ballparkId='" + ballparkId + '\'' +
                        ", ballparkName='" + ballparkName + '\'' +
                        ", ballparkAka='" + ballparkAka + '\'' +
                        ", ballparkCity='" + ballparkCity + '\'' +
                        ", ballparkState='" + ballparkState + '\'' +
                        ", ballparkStartDate='" + ballparkStartDate + '\'' +
                        ", ballparkEndDate='" + ballparkEndDate + '\'' +
                        ", ballparkLeague=" + ballparkLeague +
                        ", ballparkLeagueText='" + ballparkLeagueText + '\'' +
                        ", ballparkNotes='" + ballparkNotes + '\'' +
                        ", playerIdVisitStartingPitcher='" + playerIdVisitStartingPitcher + '\'' +
                        ", playerPositionVisitStartingPitcher=" + playerPositionVisitStartingPitcher +
                        ", playerPositionVisitStartingPitcherText='" + playerPositionVisitStartingPitcherText + '\'' +
                        ", playerVisitStartingPitcherLastName='" + playerVisitStartingPitcherLastName + '\'' +
                        ", playerVisitStartingPitcherFirstName='" + playerVisitStartingPitcherFirstName + '\'' +
                        ", playerVisitStartingPitcherBats=" + playerVisitStartingPitcherBats +
                        ", playerVisitStartingPitcherBatsText='" + playerVisitStartingPitcherBatsText + '\'' +
                        ", playerVisitStartingPitcherThrows=" + playerVisitStartingPitcherThrows +
                        ", playerVisitStartingPitcherThrowsText='" + playerVisitStartingPitcherThrowsText + '\'' +
                        ", playerIdHomeStartingPitcher='" + playerIdHomeStartingPitcher + '\'' +
                        ", playerPositionHomeStartingPitcher=" + playerPositionHomeStartingPitcher +
                        ", playerPositionHomeStartingPitcherText='" + playerPositionHomeStartingPitcherText + '\'' +
                        ", playerHomeStartingPitcherLastName='" + playerHomeStartingPitcherLastName + '\'' +
                        ", playerHomeStartingPitcherFirstName='" + playerHomeStartingPitcherFirstName + '\'' +
                        ", playerHomeStartingPitcherBats=" + playerHomeStartingPitcherBats +
                        ", playerHomeStartingPitcherBatsText='" + playerHomeStartingPitcherBatsText + '\'' +
                        ", playerHomeStartingPitcherThrows=" + playerHomeStartingPitcherThrows +
                        ", playerHomeStartingPitcherThrowsText='" + playerHomeStartingPitcherThrowsText + '\'' +
                        ", umpireIdHomePlate='" + umpireIdHomePlate + '\'' +
                        ", umpireHomePlateLastName='" + umpireHomePlateLastName + '\'' +
                        ", umpireHomePlateFirstName='" + umpireHomePlateFirstName + '\'' +
                        ", umpireHomePlateDebutDate='" + umpireHomePlateDebutDate + '\'' +
                        ", umpireIdFirstBase='" + umpireIdFirstBase + '\'' +
                        ", umpireFirstBaseLastName='" + umpireFirstBaseLastName + '\'' +
                        ", umpireFirstBaseFirstName='" + umpireFirstBaseFirstName + '\'' +
                        ", umpireFirstBaseDebutDate='" + umpireFirstBaseDebutDate + '\'' +
                        ", umpireIdSecondBase='" + umpireIdSecondBase + '\'' +
                        ", umpireSecondBaseLastName='" + umpireSecondBaseLastName + '\'' +
                        ", umpireSecondBaseFirstName='" + umpireSecondBaseFirstName + '\'' +
                        ", umpireSecondBaseDebutDate='" + umpireSecondBaseDebutDate + '\'' +
                        ", umpireIdThirdBase='" + umpireIdThirdBase + '\'' +
                        ", umpireThirdBaseLastName='" + umpireThirdBaseLastName + '\'' +
                        ", umpireThirdBaseFirstName='" + umpireThirdBaseFirstName + '\'' +
                        ", umpireThirdBaseDebutDate='" + umpireThirdBaseDebutDate + '\'' +
                        ", umpireIdLeftField='" + umpireIdLeftField + '\'' +
                        ", umpireLeftFieldLastName='" + umpireLeftFieldLastName + '\'' +
                        ", umpireLeftFieldFirstName='" + umpireLeftFieldFirstName + '\'' +
                        ", umpireLeftFieldDebutDate='" + umpireLeftFieldDebutDate + '\'' +
                        ", umpireIdRightField='" + umpireIdRightField + '\'' +
                        ", umpireRightFieldLastName='" + umpireRightFieldLastName + '\'' +
                        ", umpireRightFieldFirstName='" + umpireRightFieldFirstName + '\'' +
                        ", umpireRightFieldDebutDate='" + umpireRightFieldDebutDate + '\'' +
                        ", gameAttendance=" + gameAttendance +
                        ", psScorer='" + psScorer + '\'' +
                        ", translator='" + translator + '\'' +
                        ", inputter='" + inputter + '\'' +
                        ", inputTime='" + inputTime + '\'' +
                        ", editTime='" + editTime + '\'' +
                        ", howScored='" + howScored + '\'' +
                        ", pitchesEntered='" + pitchesEntered + '\'' +
                        ", gameTemperature=" + gameTemperature +
                        ", gameWindDirection=" + gameWindDirection +
                        ", gameWindDirectionText='" + gameWindDirectionText + '\'' +
                        ", gameWindSpeed=" + gameWindSpeed +
                        ", gameFieldCondition=" + gameFieldCondition +
                        ", gameFieldConditionText='" + gameFieldConditionText + '\'' +
                        ", gamePrecipitation=" + gamePrecipitation +
                        ", gamePrecipitationText='" + gamePrecipitationText + '\'' +
                        ", gameSky=" + gameSky +
                        ", gameSkyText='" + gameSkyText + '\'' +
                        ", gameTime='" + gameTime + '\'' +
                        ", numberOfInnings=" + numberOfInnings +
                        ", visitFinalScore=" + visitFinalScore +
                        ", homeFinalScore=" + homeFinalScore +
                        ", visitHits=" + visitHits +
                        ", homeHits=" + homeHits +
                        ", visitErrors=" + visitErrors +
                        ", homeErrors=" + homeErrors +
                        ", visitLeftOnBase=" + visitLeftOnBase +
                        ", homeLeftOnBase=" + homeLeftOnBase +
                        ", playerIdWinningPitcher='" + playerIdWinningPitcher + '\'' +
                        ", playerPositionWinningPitcher=" + playerPositionWinningPitcher +
                        ", playerPositionWinningPitcherText='" + playerPositionWinningPitcherText + '\'' +
                        ", playerWinningPitcherLastName='" + playerWinningPitcherLastName + '\'' +
                        ", playerWinningPitcherFirstName='" + playerWinningPitcherFirstName + '\'' +
                        ", playerWinningPitcherBats=" + playerWinningPitcherBats +
                        ", playerWinningPitcherBatsText='" + playerWinningPitcherBatsText + '\'' +
                        ", playerWinningPitcherThrows=" + playerWinningPitcherThrows +
                        ", playerWinningPitcherThrowsText='" + playerWinningPitcherThrowsText + '\'' +
                        ", playerIdLosingPitcher='" + playerIdLosingPitcher + '\'' +
                        ", playerPositionLosingPitcher=" + playerPositionLosingPitcher +
                        ", playerPositionLosingPitcherText='" + playerPositionLosingPitcherText + '\'' +
                        ", playerLosingPitcherLastName='" + playerLosingPitcherLastName + '\'' +
                        ", playerLosingPitcherFirstName='" + playerLosingPitcherFirstName + '\'' +
                        ", playerLosingPitcherBats=" + playerLosingPitcherBats +
                        ", playerLosingPitcherBatsText='" + playerLosingPitcherBatsText + '\'' +
                        ", playerLosingPitcherThrows=" + playerLosingPitcherThrows +
                        ", playerLosingPitcherThrowsText='" + playerLosingPitcherThrowsText + '\'' +
                        ", playerIdSaveFor='" + playerIdSaveFor + '\'' +
                        ", playerPositionSaveFor=" + playerPositionSaveFor +
                        ", playerPositionSaveForText='" + playerPositionSaveForText + '\'' +
                        ", playerSaveForLastName='" + playerSaveForLastName + '\'' +
                        ", playerSaveForFirstName='" + playerSaveForFirstName + '\'' +
                        ", playerSaveForBats=" + playerSaveForBats +
                        ", playerSaveForBatsText='" + playerSaveForBatsText + '\'' +
                        ", playerSaveForThrows=" + playerSaveForThrows +
                        ", playerSaveForThrowsText='" + playerSaveForThrowsText + '\'' +
                        ", playerIdWinningRbi='" + playerIdWinningRbi + '\'' +
                        ", playerWinningRbiLastName='" + playerWinningRbiLastName + '\'' +
                        ", playerWinningRbiFirstName='" + playerWinningRbiFirstName + '\'' +
                        ", playerWinningRbiBats=" + playerWinningRbiBats +
                        ", playerWinningRbiBatsText='" + playerWinningRbiBatsText + '\'' +
                        ", playerWinningRbiThrows=" + playerWinningRbiThrows +
                        ", playerWinningRbiThrowsText='" + playerWinningRbiThrowsText + '\'' +
                        ", playerIdVisitFinalPitcher='" + playerIdVisitFinalPitcher + '\'' +
                        ", playerPositionVisitFinalPitcher=" + playerPositionVisitFinalPitcher +
                        ", playerPositionVisitFinalPitcherText='" + playerPositionVisitFinalPitcherText + '\'' +
                        ", playerVisitFinalPitcherLastName='" + playerVisitFinalPitcherLastName + '\'' +
                        ", playerVisitFinalPitcherFirstName='" + playerVisitFinalPitcherFirstName + '\'' +
                        ", playerVisitFinalPitcherBats=" + playerVisitFinalPitcherBats +
                        ", playerVisitFinalPitcherBatsText='" + playerVisitFinalPitcherBatsText + '\'' +
                        ", playerVisitFinalPitcherThrows=" + playerVisitFinalPitcherThrows +
                        ", playerVisitFinalPitcherThrowsText='" + playerVisitFinalPitcherThrowsText + '\'' +
                        ", playerIdHomeFinalPitcher='" + playerIdHomeFinalPitcher + '\'' +
                        ", playerPositionHomeFinalPitcher=" + playerPositionHomeFinalPitcher +
                        ", playerPositionHomeFinalPitcherText='" + playerPositionHomeFinalPitcherText + '\'' +
                        ", playerHomeFinalPitcherLastName='" + playerHomeFinalPitcherLastName + '\'' +
                        ", playerHomeFinalPitcherFirstName='" + playerHomeFinalPitcherFirstName + '\'' +
                        ", playerHomeFinalPitcherBats=" + playerHomeFinalPitcherBats +
                        ", playerHomeFinalPitcherBatsText='" + playerHomeFinalPitcherBatsText + '\'' +
                        ", playerHomeFinalPitcherThrows=" + playerHomeFinalPitcherThrows +
                        ", playerHomeFinalPitcherThrowsText='" + playerHomeFinalPitcherThrowsText + '\'' +
                        ", year=" + year +
                        ", gameType=" + gameType +
                        ", gameTypeText='" + gameTypeText + '\'' +
                        '}';
        }
}

