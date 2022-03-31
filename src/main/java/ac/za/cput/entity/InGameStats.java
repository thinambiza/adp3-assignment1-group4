/**
 * Tournament.java
 * InGame Stats Entity
 * Author: Melisa Bhixa 217131085
 * Date: 31 March 2022
 */

package ac.za.cput.entity;

public class InGameStats {
    private String fixtureId;
    private int numberOfCorners;
    private int numberOfRedCards;
    private int numberOfFreeKicks;
    private int possession;
    private int numberOfShotsOnTarget;
    private int numberOfShots;
    private int numberOfPasses;
    private int numberOfGoalsConceded;
    private int numberOfGoalsScored;
    private String teamId;

    public InGameStats(InGameStats.InGameStatsBuilder inGameStatsBuilder) {
        this.fixtureId = inGameStatsBuilder.fixtureId;
        this.numberOfCorners = inGameStatsBuilder.numberOfCorners;
        this.numberOfRedCards = inGameStatsBuilder.numberOfRedCards;
        this.numberOfFreeKicks = inGameStatsBuilder.numberOfFreeKicks;
        this.possession = inGameStatsBuilder.possession;
        this.numberOfShotsOnTarget = inGameStatsBuilder.numberOfShotsOnTarget;
        this.numberOfShots = inGameStatsBuilder.numberOfShots;
        this.numberOfPasses = inGameStatsBuilder.numberOfPasses;
        this.numberOfGoalsConceded = inGameStatsBuilder.numberOfGoalsConceded;
        this.numberOfGoalsScored = inGameStatsBuilder.numberOfGoalsScored;
        this.teamId = inGameStatsBuilder.teamId;
    }

    public String getFixtureIdId() {
        return fixtureId;
    }

    public int getNumberOfCorners() {
        return numberOfCorners;
    }

    public int getNumberOfRedCards() {
        return numberOfRedCards;
    }

    public int getNumberOfFreeKicks(){
        return numberOfFreeKicks;
    }

    public int getPossession(){
        return possession;
    }

    public int getNumberOfShotsOnTarget(){
        return numberOfShotsOnTarget;
    }

    public int getNumberOfShots() {
        return numberOfShots;
    }

    public int getNumberOfPasses(){
        return numberOfPasses;
    }

    public int getNumberOfGoalsConceded(){
        return numberOfGoalsConceded;
    }

    public int getNumberOfGoalsScored(){
        return numberOfGoalsScored;
    }

    public String getTeamId(){
        return teamId;
    }


    public String toString() {
        return "InGameStats{" +
                "fixtureId='" + fixtureId + '\'' +
                ", numberOfCorners='" + numberOfCorners + '\'' +
                ", numberOfRedCards='" + numberOfRedCards + '\'' +
                ", numberOfFreeKicks='" + numberOfFreeKicks + '\'' +
                ", numberOfShotsOnTarget='" + numberOfShotsOnTarget + '\'' +
                ", numberOfShots='" + numberOfShots + '\'' +
                ", numberOfPasses='" + numberOfPasses + '\'' +
                ", numberOfGoalsConceded='" + numberOfGoalsConceded + '\'' +
                ", numberOfGoalScored='" + numberOfGoalsScored + '\'' +
                ", teamId='" + teamId + '\'' +
                '}';
    }

    public static class InGameStatsBuilder{
        private String fixtureId;
        private int numberOfCorners;
        private int numberOfRedCards;
        private int numberOfFreeKicks;
        private int possession;
        private int numberOfShotsOnTarget;
        private int numberOfShots;
        private int numberOfPasses;
        private int numberOfGoalsConceded;
        private int numberOfGoalsScored;
        private String teamId;

        public InGameStats.InGameStatsBuilder setFixtureId(String fixtureId) {
            this.fixtureId = fixtureId;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfCorners(int numberOfCorners) {
            this.numberOfCorners = numberOfCorners;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfRedCards(int numberOfRedCards){
            this.numberOfRedCards = numberOfRedCards;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfFreeKicks(int numberOfFreeKicks){
            this.numberOfFreeKicks = numberOfFreeKicks;
            return this;
        }

        public InGameStats.InGameStatsBuilder setPossession(int possession){
            this.possession = possession;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfShotsOnTarget(int numberOfShotsOnTarget){
            this.numberOfShotsOnTarget = numberOfShotsOnTarget;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfShots(int numberOfShots){
            this.numberOfShots = numberOfShots;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfPasses(int numberOfPasses){
            this.numberOfPasses = numberOfPasses;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfGoalsConceded(int numberOfGoalsConceded){
            this.numberOfGoalsConceded = numberOfGoalsConceded;
            return this;
        }

        public InGameStats.InGameStatsBuilder setNumberOfGoalsScored(int numberOfGoalsScored){
            this.numberOfGoalsScored = numberOfGoalsScored;
            return this;
        }

        public InGameStats.InGameStatsBuilder setTeamId(String teamId){
            this.teamId = teamId;
            return this;
        }

        public InGameStats build(){ return new InGameStats(this);
        }

    }
}

