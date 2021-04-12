package org.launchcode.play_ball_UI.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(name= "get-year-game-type-data", procedureName= "play_ball.GetYearGameTypes",
        parameters = {
            @StoredProcedureParameter(mode= ParameterMode.IN, name="game_year", type= Integer.class)
        })

public class YearGameType {
    @Id
    private char gameType;
    private int gameYear;
    private String gameTypeText;

    // no argument constructor, required for Hibernate to create an object.
    public YearGameType(){ }

    public int getGameYear() {
        return gameYear;
    }

    public void setGameYear(int gameYear) {
        this.gameYear = gameYear;
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

    public void setGameTypeText(String gameTypeText) {
        this.gameTypeText = gameTypeText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YearGameType)) return false;
        YearGameType that = (YearGameType) o;
        return getGameType() == that.getGameType() && gameYear == that.gameYear && Objects.equals(gameTypeText, that.gameTypeText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameType(), gameYear, gameTypeText);
    }

    @Override
    public String toString() {
        return "YearGameType{" +
                "gameType=" + gameType +
                ", gameYear=" + gameYear +
                ", gameTypeText='" + gameTypeText + '\'' +
                '}';
    }
}
