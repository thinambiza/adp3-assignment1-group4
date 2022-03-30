/**
 Venue.java
 Entity for the Venue
 Author: Legiste Ndabashinze (217046207)
 Date: 30 March 2022
 */

package ac.za.cput.entity;

public class Venue {

    private String venueId;
    private String fixtureId;
    private String teamId;
    private String stadiumName;
    private int capacity;
    private String weather;

    public Venue(VenueBuilder venueBuilder){
        this.venueId = venueBuilder.venueId;
        this.fixtureId = venueBuilder.fixtureId;
        this.teamId = venueBuilder.teamId;
        this.stadiumName = venueBuilder.stadiumName;
        this.capacity = venueBuilder.capacity;
        this.weather = venueBuilder.weather;
    }

    public String getVenueId() {
        return venueId;
    }

    public String getFixtureId() {
        return fixtureId;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public String getTeamId() {
        return teamId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getWeather() {
        return weather;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId='" + venueId + '\'' +
                ", fixtureId='" + fixtureId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", stadiumName='" + stadiumName + '\'' +
                ", capacity=" + capacity +
                ", weather='" + weather + '\'' +
                '}';
    }

    public static class VenueBuilder{

        private String venueId;
        private String fixtureId;
        private String teamId;
        private String stadiumName;
        private int capacity;
        private String weather;

        public VenueBuilder setVenueId(String venueId) {
            this.venueId = venueId;
            return this;
        }

        public VenueBuilder setFixtureId(String fixtureId) {
            this.fixtureId = fixtureId;
            return this;
        }

        public VenueBuilder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public VenueBuilder setStadiumName(String stadiumName) {
            this.stadiumName = stadiumName;
            return this;
        }

        public VenueBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public VenueBuilder setWeather(String weather) {
            this.weather = weather;
            return this;
        }

        public Venue build(){
            return new Venue(this);
        }
    }
}
