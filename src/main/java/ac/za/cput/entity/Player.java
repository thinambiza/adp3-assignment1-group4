/**
 * Player Entity
 * player.java
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

    public Player(Player.PlayerBuilder playerBuilder) {
        this.playerId = playerBuilder.playerId;
        this.teamId = playerBuilder.teamId;
        this.firstName = playerBuilder.firstName;
        this.middleName = playerBuilder.middleName;
        this.lastName = playerBuilder.lastName;
        this.age = playerBuilder.age;
        this.position = playerBuilder.position;
        this.team = playerBuilder.team;
        this.goals = playerBuilder.goals;
        this.assists = playerBuilder.assists;
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

    public static class PlayerBuilder{

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

        public Player.PlayerBuilder setPlayerId(String playerId) {
            this.playerId = playerId;
            return this;
        }

        public Player.PlayerBuilder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Player.PlayerBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Player.PlayerBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Player.PlayerBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

       public Player.PlayerBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Player.PlayerBuilder setPosition(int position) {
            this.position = position;
            return this;
        }

        public Player.PlayerBuilder setTeam(String team) {
            this.team = team;
            return this;
        }

        public Player.PlayerBuilder setGoals(int goals) {
            this.goals = goals;
            return this;
        }

        public Player.PlayerBuilder setAssists(int assists) {
            this.assists = assists;
            return this;
        }

        public Player build(){
            return new Player(this);
        }

    }

}


