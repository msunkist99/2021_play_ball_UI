package org.launchcode.play_ball_UI.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(name= "get-year-game-type-game-data", procedureName= "play_ball.GetYearGameTypesGames",
        parameters = {
                @StoredProcedureParameter(mode= ParameterMode.IN, name="gameYear", type= Integer.class),
                @StoredProcedureParameter(mode= ParameterMode.IN, name="gameType", type= Character.class)
        })

public class YearGameTypeGame {
        @Id
        private String gameId;
        private String gameSite;
        private String homeTeam;
        private String visitingTeam;
        private String date;
        private char dayNight;
        private String dayNightText;
        private int gameNum;
        private String gameNumText;
        private int year;
        private char gameType;
        private String gameTypeText;
        private String homeTeamName;
        private String homeTeamCity;
        private String visitingTeamName;
        private String visitingTeamCity;

        // no-arg constructor
        public YearGameTypeGame(){}

        public String getGameId() {
                return gameId;
        }

        public void setGameId(String gameId) {
                this.gameId = gameId;
        }

        public String getGameSite() {
                return gameSite;
        }

        public void setGameSite(String gameSite) {
                this.gameSite = gameSite;
        }

        public String getHomeTeam() {
                return homeTeam;
        }

        public void setHomeTeam(String homeTeam) {
                this.homeTeam = homeTeam;
        }

        public String getVisitingTeam() {
                return visitingTeam;
        }

        public void setVisitingTeam(String visitingTeam) {
                this.visitingTeam = visitingTeam;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
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

        public void setGameTypeText(String gameTypeText) {
                this.gameTypeText = gameTypeText;
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

        public String getVisitingTeamName() {
                return visitingTeamName;
        }

        public void setVisitingTeamName(String visitingTeamName) {
                this.visitingTeamName = visitingTeamName;
        }

        public String getVisitingTeamCity() {
                return visitingTeamCity;
        }

        public void setVisitingTeamCity(String visitingTeamCity) {
                this.visitingTeamCity = visitingTeamCity;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof YearGameTypeGame)) return false;
                YearGameTypeGame that = (YearGameTypeGame) o;
                return getDayNight() == that.getDayNight() && getGameNum() == that.getGameNum() && getYear() == that.getYear() && getGameType() == that.getGameType() && Objects.equals(getGameId(), that.getGameId()) && Objects.equals(getGameSite(), that.getGameSite()) && Objects.equals(getHomeTeam(), that.getHomeTeam()) && Objects.equals(getVisitingTeam(), that.getVisitingTeam()) && Objects.equals(getDate(), that.getDate()) && Objects.equals(getDayNightText(), that.getDayNightText()) && Objects.equals(getGameNumText(), that.getGameNumText()) && Objects.equals(getGameTypeText(), that.getGameTypeText()) && Objects.equals(getHomeTeamName(), that.getHomeTeamName()) && Objects.equals(getHomeTeamCity(), that.getHomeTeamCity()) && Objects.equals(getVisitingTeamName(), that.getVisitingTeamName()) && Objects.equals(getVisitingTeamCity(), that.getVisitingTeamCity());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getGameId(), getGameSite(), getHomeTeam(), getVisitingTeam(), getDate(), getDayNight(), getDayNightText(), getGameNum(), getGameNumText(), getYear(), getGameType(), getGameTypeText(), getHomeTeamName(), getHomeTeamCity(), getVisitingTeamName(), getVisitingTeamCity());
        }

        @Override
        public String toString() {
                return "YearGameTypeGame{" +
                        "gameId='" + gameId + '\'' +
                        ", gameSite='" + gameSite + '\'' +
                        ", homeTeam='" + homeTeam + '\'' +
                        ", visitingTeam='" + visitingTeam + '\'' +
                        ", date='" + date + '\'' +
                        ", dayNight=" + dayNight +
                        ", dayNightText='" + dayNightText + '\'' +
                        ", gameNum=" + gameNum +
                        ", gameNumText='" + gameNumText + '\'' +
                        ", year=" + year +
                        ", gameType=" + gameType +
                        ", gameTypeText='" + gameTypeText + '\'' +
                        ", homeTeamName='" + homeTeamName + '\'' +
                        ", homeTeamCity='" + homeTeamCity + '\'' +
                        ", visitingTeamName='" + visitingTeamName + '\'' +
                        ", visitingTeamCity='" + visitingTeamCity + '\'' +
                        '}';
        }
}
