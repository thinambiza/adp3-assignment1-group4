/*
 playerStats.java
 Entity for the PlayerStats
 Author: Zuko Fukula (217299911)
 Date: 31 March 2022
 */

package ac.za.cput.entity;

public class playerStats {

    private String fixtureID;
    private String playerID;
    private int numberOfGoals;
    private int numberOfAssists;
    private int numberOfPassesCompleted;
    private int numberOfAppearances;
    private int numberOfHeadersWon;
    private int numberOfTacklesWon;
    private int numberOfSavesMade;


    public playerStats(Builder builder) {
        this.fixtureID = builder.fixtureID;
        this.playerID = builder.playerID;
        this.numberOfGoals = builder.numberOfGoals;
        this.numberOfAssists = builder.numberOfAssists;
        this.numberOfPassesCompleted = builder.numberOfPassesCompleted;
        this.numberOfAppearances = builder.numberOfAppearances;
        this.numberOfHeadersWon = builder.numberOfHeadersWon;
        this.numberOfTacklesWon = builder.numberOfTacklesWon;
        this.numberOfSavesMade = builder.numberOfSavesMade;

    }

    public String getFixtureID() {
        return fixtureID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public int getNumberOfAssists() {
        return numberOfAssists;
    }

    public int getNumberOfPassesCompleted() {
        return numberOfPassesCompleted;
    }

    public int getNumberOfAppearances() {
        return numberOfAppearances;
    }

    public int getNumberOfHeadersWon() {
        return numberOfHeadersWon;
    }

    public int getNumberOfTacklesWon() {
        return numberOfTacklesWon;
    }

    public int getNumberOfSavesMade() {
        return numberOfSavesMade;
    }

    public static class Builder {
        private String fixtureID;
        private String playerID;
        private int numberOfGoals;
        private int numberOfAssists;
        private int numberOfPassesCompleted;
        private int numberOfAppearances;
        private int numberOfHeadersWon;
        private int numberOfTacklesWon;
        private int numberOfSavesMade;


        public Builder setFixtureID(String fixtureID) {
            this.fixtureID = fixtureID;
            return this;
        }

        public Builder setPlayerID(String playerID) {
            this.playerID = playerID;
            return this;
        }

        public Builder setNumberOfGoals(int numberOfGoals) {
            this.numberOfGoals = numberOfGoals;
            return this;
        }

        public Builder setNumberOfAssists(int numberOfAssists) {
            this.numberOfAssists = numberOfAssists;
            return this;
        }

        public Builder setNumberOfPassesCompleted(int numberOfPassesCompleted) {
            this.numberOfPassesCompleted = numberOfPassesCompleted;
            return this;
        }

        public Builder setNumberOfAppearances(int numberOfAppearances) {
            this.numberOfAppearances = numberOfAppearances;
            return this;
        }

        public Builder setNumberOfHeadersWon(int numberOfHeadersWon) {
            this.numberOfHeadersWon = numberOfHeadersWon;
            return this;
        }

        public Builder setNumberOfTacklesWon(int numberOfTacklesWon) {
            this.numberOfTacklesWon = numberOfTacklesWon;
            return this;
        }

        public Builder setNumberOfSavesMade(int numberOfSavesMade) {
            this.numberOfSavesMade = numberOfSavesMade;
            return this;
        }

        public playerStats build() {
            return new playerStats(this);
        }

    }


    @Override
    public String toString() {
        return "PlayerStats{" +
                "fixtureID='" + fixtureID + '\'' +
                ", playerID='" + playerID + '\'' +
                ", numberOfGoals=" + numberOfGoals +
                ", numberOfAssists=" + numberOfAssists +
                ", numberOfHeadersWon=" + numberOfHeadersWon +
                ", numberOfSavesMade='" + numberOfSavesMade  +
                ", numberOfTacklesWon=" + numberOfTacklesWon +
                ", numberOfAppearances=" + numberOfAppearances +
                ", numberOfPassesCompleted=" + numberOfPassesCompleted +
                '}';
    }
}
