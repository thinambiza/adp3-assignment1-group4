/**
 * Group Entity
 * group.java
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

    public Group(GroupBuilder groupBuilder) {
        this.groupId = groupBuilder.groupId;
        this.numOfTeams = groupBuilder.numOfTeams;
        this.groupLetter = groupBuilder.groupLetter;
        this.numOfFixtures = groupBuilder.numOfFixtures;
        this.winner = groupBuilder.winner;
        this.teamLogs = groupBuilder.teamLogs;
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

    public static class GroupBuilder {

        private String groupId;
        private int numOfTeams;
        private char groupLetter;
        private int numOfFixtures;
        private Team winner;
        private String teamLogs;


        public Group.GroupBuilder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Group.GroupBuilder setNumOfTeams(int numOfTeams) {
            this.numOfTeams = numOfTeams;
            return this;
        }

        public Group.GroupBuilder setGroupLetter(char groupLetter) {
            this.groupLetter = groupLetter;
            return this;
        }

        public Group.GroupBuilder setNumOfFixtures(int numOfFixtures) {
            this.numOfFixtures = numOfFixtures;
            return this;
        }

        public Group.GroupBuilder setWinner(Team winner) {
            this.winner = winner;
            return this;
        }

        public Group.GroupBuilder setTeamLogs(String teamLogs) {
            this.teamLogs = teamLogs;
            return this;
        }

        public Group build(){
            return new Group(this);
        }
    }
}
