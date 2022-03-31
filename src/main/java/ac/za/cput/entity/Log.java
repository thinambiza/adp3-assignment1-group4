/*
 Log.java
 Entity for the Log
 Author: Zuko Fukula (217299911)
 Date: 31 March 2022
 */

package ac.za.cput.entity;

public class Log {

    private String groupID;
    private String logID;
    private String teamID;
    private int points;
    private int gamesPlayed;
    private int goalsFor;
    private int goalsAgainst;
    private int goalDifference;
    private int position;

    public Log(Builder builder) {
        this.groupID = builder.groupID;
        this.logID = builder.logID;
        this.teamID = builder.teamID;
        this.points = builder.points;
        this.gamesPlayed = builder.gamesPlayed;
        this.goalsFor = builder.goalsFor;
        this.goalsAgainst = builder.goalsAgainst;
        this.goalDifference = builder.goalDifference;
        this.position = builder.position;

    }

    public String getGroupID() {
        return groupID;
    }

    public String getLogID() {
        return logID;
    }

    public String getTeamID() {
        return teamID;
    }

    public int getPoints() {
        return points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public int getPosition() {
        return position;
    }

    public static class Builder {

        private String groupID;
        private String logID;
        private String teamID;
        private int points;
        private int gamesPlayed;
        private int goalsFor;
        private int goalsAgainst;
        private int goalDifference;
        private int position;


        public Log.Builder setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }

        public Log.Builder setLogID(String logID) {
            this.logID = logID;
            return this;
        }

        public Log.Builder setTeamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public Log.Builder setPoints(int points) {
            this.points = points;
            return this;
        }

        public Log.Builder setGamesPlayed(int gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
            return this;
        }

        public Log.Builder setGoalsFor(int goalsFor) {
            this.goalsFor = goalsFor;
            return this;
        }

        public Log.Builder setGoalsAgainst(int goalsAgainst) {
            this.goalsAgainst = goalsAgainst;
            return this;
        }

        public Log.Builder setGoalDifference(int goalDifference) {
            this.goalDifference = goalDifference;
            return this;
        }

        public Log.Builder setPosition(int position) {
            this.position = position;
            return this;
        }

        public Log build() {
            return new Log(this);
        }

        @Override
        public String toString() {
            return "Log{" +
                    "TeamID='" + teamID + '\'' +
                    ", GroupID='" + groupID + '\'' +
                    ", LogID=" + logID +
                    ", position=" + position +
                    ", gamesPlayed=" + gamesPlayed +
                    ", goalsFor='" + goalsFor  +
                    ", goalsAgainst=" + goalsAgainst +
                    ", goalDifference=" + goalDifference +
                    '}';
        }
    }
}
