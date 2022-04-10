/**
 * Player Entity
 * Player.java
 * Thina Mbiza 217217095
 * 31 March 2022
 */
package ac.za.cput.entity;

public class Player {

    private String playerId;
    private String teamId;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int position;
    private String team;
    private int goals;
    private int assists;

    public Player(Player.Builder Builder) {
        this.playerId = Builder.playerId;
        this.teamId = Builder.teamId;
        this.firstName = Builder.firstName;
        this.middleName = Builder.middleName;
        this.lastName = Builder.lastName;
        this.age = Builder.age;
        this.position = Builder.position;
        this.team = Builder.team;
        this.goals = Builder.goals;
        this.assists = Builder.assists;
    }



    public String getPlayerId() {
        return playerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position=" + position +
                ", team='" + team + '\'' +
                ", goals=" + goals +
                ", assists=" + assists +
                '}';
    }

    public static class Builder{

        private String playerId;
        private String teamId;
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private int position;
        private String team;
        private int goals;
        private int assists;

        public Player.Builder setPlayerId(String playerId) {
            this.playerId = playerId;
            return this;
        }

        public Player.Builder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Player.Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Player.Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Player.Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

       public Player.Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Player.Builder setPosition(int position) {
            this.position = position;
            return this;
        }

        public Player.Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        public Player.Builder setGoals(int goals) {
            this.goals = goals;
            return this;
        }

        public Player.Builder setAssists(int assists) {
            this.assists = assists;
            return this;
        }

        public Builder copy(Player player){
            this.playerId = player.playerId;
            this.teamId = player.teamId;
            this.firstName = player.firstName;
            this.middleName = player.middleName;
            this.lastName = player.lastName;
            this.age = player.age;
            this.position = player.position;
            this.team = player.team;
            this.goals = player.goals;
            this.assists = player.assists;
            return this;
        }

        public Player build(){
            return new Player(this);
        }

    }

}


