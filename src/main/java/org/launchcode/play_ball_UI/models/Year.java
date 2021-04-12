package org.launchcode.play_ball_UI.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(name= "get-year-data", procedureName= "play_ball.GetYears")

public class Year {
    @Id
    public int gameYear;

    // no argument constructor, required for Hibernate to create an object.
    public Year() {
    }

    public int getGameYear() {
        return gameYear;
    }

    public void setGameYear(int gameYear) {
        this.gameYear = gameYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Year)) return false;
        Year year = (Year) o;
        return getGameYear() == year.getGameYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameYear());
    }

    @Override
    public String toString() {
        return "Year{" +
                "gameYear=" + gameYear +
                '}';
    }
}
