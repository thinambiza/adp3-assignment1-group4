/**
 * Group Entity
 * Group.java
 * Thina Mbiza 217217095
 * 31 March 2022
 */

package ac.za.cput.entity;

public class Group {

    private String groupId;
    private int numOfTeams;
    private char groupLetter;
    private int numOfFixtures;
    private Team winner;
    private String teamLogs;

    public Group(Builder Builder) {
        this.groupId = Builder.groupId;
        this.numOfTeams = Builder.numOfTeams;
        this.groupLetter = Builder.groupLetter;
        this.numOfFixtures = Builder.numOfFixtures;
        this.winner = Builder.winner;
        this.teamLogs = Builder.teamLogs;
    }

    public String getGroupId() {
        return groupId;
    }

    public int getNumOfTeams() {
        return numOfTeams;
    }

    public char getGroupLetter() {
        return groupLetter;
    }

    public int getNumOfFixtures() {
        return numOfFixtures;
    }

    public Team getWinner() {
        return winner;
    }

    public String getTeamLogs() {
        return teamLogs;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId='" + groupId + '\'' +
                ", numOfTeams=" + numOfTeams +
                ", groupLetter=" + groupLetter +
                ", numOfFixtures=" + numOfFixtures +
                ", winner=" + winner +
                ", teamLogs='" + teamLogs + '\'' +
                '}';
    }

    public static class Builder {

        private String groupId;
        private int numOfTeams;
        private char groupLetter;
        private int numOfFixtures;
        private Team winner;
        private String teamLogs;


        public Group.Builder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Group.Builder setNumOfTeams(int numOfTeams) {
            this.numOfTeams = numOfTeams;
            return this;
        }

        public Group.Builder setGroupLetter(char groupLetter) {
            this.groupLetter = groupLetter;
            return this;
        }

        public Group.Builder setNumOfFixtures(int numOfFixtures) {
            this.numOfFixtures = numOfFixtures;
            return this;
        }

        public Group.Builder setWinner(Team winner) {
            this.winner = winner;
            return this;
        }

        public Group.Builder setTeamLogs(String teamLogs) {
            this.teamLogs = teamLogs;
            return this;
        }

        public Builder copy(Group group){
            this.groupId = group.groupId;
            this.numOfTeams = group.numOfTeams;
            this.groupLetter = group.groupLetter;
            this.numOfFixtures = group.numOfFixtures;
            this.winner = group.winner;
            this.teamLogs = group.teamLogs;
            return this;
        }

        public Group build(){
            return new Group(this);
        }
    }
}
