package org.launchcode.play_ball_UI.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(name= "get-games-players", procedureName= "play_ball.GetGamesPlayers",
        parameters= {
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "game_year", type= Integer.class),
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "game_id", type= String.class),
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "game_visiting_team", type= String.class),
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "game_home_team", type= String.class),
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "player_id", type= String.class)
        })


@NamedStoredProcedureQuery(name= "get-lookup-data", procedureName= "play_ball.GetLookupData")

public class GamePlayer {

    @Id
    private String gameId;
    private String date;            // yy/mm/dd         // fix this in stored procedure
    private int year;
    private char gameType;
    private String gameTypeText;
    private char dayNight;
    private String dayNightText;
    private int gameNum;
    private String gameNumText;

    private String homeTeam;
    private String homeTeamName;
    private String homeTeamCity;
    private char homeTeamLeague;
    private String homeTeamLeagueText;

    private String visitingTeam;
    private String visitingTeamName;
    private String visitingTeamCity;
    private char visitingTeamLeague;
    private String visitingTeamLeagueText;

    private String playerId;
    private String playerLastName;
    private String playerFirstName;
    private char playerBats;
    private String playerBatsText;
    private char playerThrows;
    private String playerThrowsText;
    private int playerStartSub;
    private String playerStartSubText;
    private int playerVisitHome;
    private String playerVisitHomeText;
    private int playerBattingOrder;
    private int playerFieldPosition;
    private String playerFieldPositionText;

    // The protected keyword is an access modifier used for attributes, methods and constructors,
    // making them accessible in the same package and subclasses.
    // no argument constructor, required for Hibernate to create an object.
    public GamePlayer(){ }

    public String getGameId() {
        return gameId;
    }

    public String getDate() { return date; }

    public int getYear() {
        return year;
    }

    public char getGameType() {
        return gameType;
    }

    public String getGameTypeText() {
        return gameTypeText;
    }

    public char getDayNight() {
        return dayNight;
    }

    public String getDayNightText() {
        return dayNightText;
    }

    public int getGameNum() {
        return gameNum;
    }

    public String getGameNumText() {
        return gameNumText;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public String getHomeTeamCity() {
        return homeTeamCity;
    }

    public char getHomeTeamLeague() {
        return homeTeamLeague;
    }

    public String getHomeTeamLeagueText() {
        return homeTeamLeagueText;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public String getVisitingTeamName() {
        return visitingTeamName;
    }

    public String getVisitingTeamCity() {
        return visitingTeamCity;
    }

    public char getVisitingTeamLeague() {
        return visitingTeamLeague;
    }

    public String getVisitingTeamLeagueText() {
        return visitingTeamLeagueText;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public char getPlayerBats() {
        return playerBats;
    }

    public String getPlayerBatsText() {
        return playerBatsText;
    }

    public char getPlayerThrows() {
        return playerThrows;
    }

    public String getPlayerThrowsText() {
        return playerThrowsText;
    }

    public int getPlayerStartSub() {
        return playerStartSub;
    }

    public String getPlayerStartSubText() {
        return playerStartSubText;
    }

    public int getPlayerVisitHome() {
        return playerVisitHome;
    }

    public String getPlayerVisitHomeText() {
        return playerVisitHomeText;
    }

    public int getPlayerBattingOrder() {
        return playerBattingOrder;
    }

    public int getPlayerFieldPosition() {
        return playerFieldPosition;
    }

    public String getPlayerFieldPositionText() {
        return playerFieldPositionText;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGameType(char gameType) {
        this.gameType = gameType;
    }

    public void setGameTypeText(String gameTypeText) {
        this.gameTypeText = gameTypeText;
    }

    public void setDayNight(char dayNight) {
        this.dayNight = dayNight;
    }

    public void setDayNightText(String dayNightText) {
        this.dayNightText = dayNightText;
    }

    public void setGameNum(int gameNum) {
        this.gameNum = gameNum;
    }

    public void setGameNumText(String gameNumText) {
        this.gameNumText = gameNumText;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public void setHomeTeamCity(String homeTeamCity) {
        this.homeTeamCity = homeTeamCity;
    }

    public void setHomeTeamLeague(char homeTeamLeague) {
        this.homeTeamLeague = homeTeamLeague;
    }

    public void setHomeTeamLeagueText(String homeTeamLeagueText) {
        this.homeTeamLeagueText = homeTeamLeagueText;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public void setVisitingTeamName(String visitingTeamName) {
        this.visitingTeamName = visitingTeamName;
    }

    public void setVisitingTeamCity(String visitingTeamCity) {
        this.visitingTeamCity = visitingTeamCity;
    }

    public void setVisitingTeamLeague(char visitingTeamLeague) {
        this.visitingTeamLeague = visitingTeamLeague;
    }

    public void setVisitingTeamLeagueText(String visitingTeamLeagueText) {
        this.visitingTeamLeagueText = visitingTeamLeagueText;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public void setPlayerBats(char playerBats) {
        this.playerBats = playerBats;
    }

    public void setPlayerBatsText(String playerBatsText) {
        this.playerBatsText = playerBatsText;
    }

    public void setPlayerThrows(char playerThrows) {
        this.playerThrows = playerThrows;
    }

    public void setPlayerThrowsText(String playerThrowsText) {
        this.playerThrowsText = playerThrowsText;
    }

    public void setPlayerStartSub(int playerStartSub) {
        this.playerStartSub = playerStartSub;
    }

    public void setPlayerStartSubText(String playerStartSubText) {
        this.playerStartSubText = playerStartSubText;
    }

    public void setPlayerVisitHome(int playerVisitHome) {
        this.playerVisitHome = playerVisitHome;
    }

    public void setPlayerVisitHomeText(String playerVisitHomeText) {
        this.playerVisitHomeText = playerVisitHomeText;
    }

    public void setPlayerBattingOrder(int playerBattingOrder) {
        this.playerBattingOrder = playerBattingOrder;
    }

    public void setPlayerFieldPosition(int playerFieldPosition) {
        this.playerFieldPosition = playerFieldPosition;
    }

    public void setPlayerFieldPositionText(String playerFieldPositionText) {
        this.playerFieldPositionText = playerFieldPositionText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GamePlayer)) return false;
        GamePlayer that = (GamePlayer) o;
        return getGameId().equals(that.getGameId()) && getPlayerId().equals(that.getPlayerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameId(), getPlayerId());
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "gameId='" + gameId + '\'' +
                ", date='" + date + '\'' +
                ", year=" + year +
                ", gameType=" + gameType +
                ", gameTypeText='" + gameTypeText + '\'' +
                ", dayNight=" + dayNight +
                ", dayNightText='" + dayNightText + '\'' +
                ", gameNum=" + gameNum +
                ", gameNumText='" + gameNumText + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", homeTeamName='" + homeTeamName + '\'' +
                ", homeTeamCity='" + homeTeamCity + '\'' +
                ", homeTeamLeague=" + homeTeamLeague +
                ", homeTeamLeagueText='" + homeTeamLeagueText + '\'' +
                ", visitingTeam='" + visitingTeam + '\'' +
                ", visitingTeamName='" + visitingTeamName + '\'' +
                ", visitingTeamCity='" + visitingTeamCity + '\'' +
                ", visitingTeamLeague=" + visitingTeamLeague +
                ", visitingTeamLeagueText='" + visitingTeamLeagueText + '\'' +
                ", playerId='" + playerId + '\'' +
                ", playerLastName='" + playerLastName + '\'' +
                ", playerFirstName='" + playerFirstName + '\'' +
                ", playerBats=" + playerBats +
                ", playerBatsText='" + playerBatsText + '\'' +
                ", playerThrows=" + playerThrows +
                ", playerThrowsText='" + playerThrowsText + '\'' +
                ", playerStartSub=" + playerStartSub +
                ", playerStartSubText='" + playerStartSubText + '\'' +
                ", playerVisitHome=" + playerVisitHome +
                ", playerVisitHomeText='" + playerVisitHomeText + '\'' +
                ", playerBattingOrder=" + playerBattingOrder +
                ", playerFieldPosition=" + playerFieldPosition +
                ", playerFieldPositionText='" + playerFieldPositionText + '\'' +
                '}';
    }
}
