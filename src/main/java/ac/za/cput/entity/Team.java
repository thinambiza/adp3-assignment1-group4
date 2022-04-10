package ac.za.cput.entity;

/**
 Team.java
 Team Entity
 Author: Panashe Muinzani (218186568)
 Date: 31 March 2022
 */

public class Team {
    private String teamId;
    private String teamName;
    private String venueId;
    private int numberOfTrophies;
    private int yearEstablished;
    private String manager;
    private String captain;
    private String players;

    public Team(Builder Builder) {
        this.teamId = Builder.teamId;
        this.teamName = Builder.teamName;
        this.venueId = Builder.venueId;
        this.numberOfTrophies = Builder.numberOfTrophies;
        this.yearEstablished = Builder.yearEstablished;
        this.manager = Builder.manager;
        this.captain = Builder.captain;
        this.players = Builder.players;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getVenueId() {
        return venueId;
    }

    public int getNumberOfTrophies() {
        return numberOfTrophies;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public String getManager() {
        return manager;
    }

    public String getCaptain() {
        return captain;
    }

    public String getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId='" + teamId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", venueId='" + venueId + '\'' +
                ", numberOfTrophies=" + numberOfTrophies +
                ", yearEstablished=" + yearEstablished +
                ", manager=" + manager +
                ", captain=" + captain +
                ", players=" + players +
                '}';
    }

    public static class Builder {
        private String teamId;
        private String teamName;
        private String venueId;
        private int numberOfTrophies;
        private int yearEstablished;
        private String manager;
        private String captain;
        private String players;

        public Builder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder setTeamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        public Builder setVenueId(String venueId) {
            this.venueId = venueId;
            return this;
        }

        public Builder setNumberOfTrophies(int numberOfTrophies) {
            this.numberOfTrophies = numberOfTrophies;
            return this;
        }

        public Builder setYearEstablished(int yearEstablished) {
            this.yearEstablished = yearEstablished;
            return this;
        }

        public Builder setManager(String manager) {
            this.manager = manager;
            return this;
        }

        public Builder setCaptain(String captain) {
            this.captain = captain;
            return this;
        }

        public Builder setPlayers(String players) {
            this.players = players;
            return this;
        }
        public Team build() {
            return new Team (this);
        }

        public Builder copy(Team team) {
            return this;
        }
    }
}





