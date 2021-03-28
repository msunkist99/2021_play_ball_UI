package org.launchcode.play_ball_UI.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(name= "get-year-game-type-player-data", procedureName= "play_ball.GetYearGameTypesPlayers",
        parameters = {
                @StoredProcedureParameter(mode= ParameterMode.IN, name="gameYear", type= Integer.class),
                @StoredProcedureParameter(mode= ParameterMode.IN, name="gameType", type= Character.class)
        })

public class YearGameTypePlayer {
    @Id
    private String playerId;
    private String playerLastName;
    private String playerFirstName;
    private String playerTeamId;
    private String playerTeamName;
    private String playerTeamCity;
    private int playerYear;

    // no-arg constructor
    public YearGameTypePlayer() {
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerTeamId() {
        return playerTeamId;
    }

    public void setPlayerTeamId(String playerTeamId) {
        this.playerTeamId = playerTeamId;
    }

    public String getPlayerTeamName() {
        return playerTeamName;
    }

    public void setPlayerTeamName(String playerTeamName) {
        this.playerTeamName = playerTeamName;
    }

    public String getPlayerTeamCity() {
        return playerTeamCity;
    }

    public void setPlayerTeamCity(String playerTeamCity) {
        this.playerTeamCity = playerTeamCity;
    }

    public int getPlayerYear() {
        return playerYear;
    }

    public void setPlayerYear(int year) {
        this.playerYear = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YearGameTypePlayer)) return false;
        YearGameTypePlayer that = (YearGameTypePlayer) o;
        return getPlayerYear() == that.getPlayerYear() && Objects.equals(getPlayerId(), that.getPlayerId()) && Objects.equals(getPlayerTeamId(), that.getPlayerTeamId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerId(), getPlayerLastName(), getPlayerFirstName(), getPlayerTeamId(), getPlayerTeamName(), getPlayerTeamCity(), getPlayerYear());
    }

    @Override
    public String toString() {
        return "YearGameTypePlayer{" +
                "playerId='" + playerId + '\'' +
                ", playerLastName='" + playerLastName + '\'' +
                ", playerFirstName='" + playerFirstName + '\'' +
                ", playerTeamId='" + playerTeamId + '\'' +
                ", playerTeamName='" + playerTeamName + '\'' +
                ", playerTeamCity='" + playerTeamCity + '\'' +
                ", year=" + playerYear +
                '}';
    }
}
