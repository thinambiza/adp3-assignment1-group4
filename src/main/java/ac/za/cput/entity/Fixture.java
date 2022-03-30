/**
Fixture.java
Entity for the Fixture
Author: Legiste Ndabashinze (217046207)
Date: 30 March 2022
*/

package ac.za.cput.entity;

public class Fixture {

    private String fixtureId;
    private String groupId;
    private Team homeTeam;
    private Team awayTeam;
    private Referee referee;
    private String stageType;
    private int homeScore;
    private int awayScore;

    public Fixture(FixtureBuilder fixtureBuilder) {
        this.fixtureId = fixtureBuilder.fixtureId;
        this.groupId = fixtureBuilder.groupId;
        this.homeTeam = fixtureBuilder.homeTeam;
        this.awayTeam = fixtureBuilder.awayTeam;
        this.referee = fixtureBuilder.referee;
        this.stageType = fixtureBuilder.stageType;
        this.homeScore = fixtureBuilder.homeScore;
        this.awayScore = fixtureBuilder.awayScore;
    }

    public String getFixtureId() {
        return fixtureId;
    }

    public String getGroupId() {
        return groupId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Referee getReferee() {
        return referee;
    }

    public String getStageType() {
        return stageType;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    @Override
    public String toString() {
        return "Fixture{" +
                "fixtureId='" + fixtureId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", referee=" + referee +
                ", stageType='" + stageType + '\'' +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                '}';
    }

    public static class FixtureBuilder{

        private String fixtureId;
        private String groupId;
        private Team homeTeam;
        private Team awayTeam;
        private Referee referee;
        private String stageType;
        private int homeScore;
        private int awayScore;

        public FixtureBuilder setFixtureId(String fixtureId) {
            this.fixtureId = fixtureId;
            return this;
        }

        public FixtureBuilder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public FixtureBuilder setHomeTeam(Team homeTeam) {
            this.homeTeam = homeTeam;
            return this;
        }

        public FixtureBuilder setAwayTeam(Team awayTeam) {
            this.awayTeam = awayTeam;
            return this;
        }

        public FixtureBuilder setReferee(Referee referee) {
            this.referee = referee;
            return this;
        }

        public FixtureBuilder setStageType(String stageType) {
            this.stageType = stageType;
            return this;
        }

        public FixtureBuilder setHomeScore(int homeScore) {
            this.homeScore = homeScore;
            return this;
        }

        public FixtureBuilder setAwayScore(int awayScore) {
            this.awayScore = awayScore;
            return this;
        }

        public Fixture build(){
            return new Fixture(this);
        }

    }

}
