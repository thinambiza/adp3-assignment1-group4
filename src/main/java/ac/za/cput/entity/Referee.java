/**
 Referee.java
 Entity for the Referee
 Author: Legiste Ndabashinze (217046207)
 Date: 30 March 2022
 */

package ac.za.cput.entity;

public class Referee {

    private String fixtureId;
    private String refereeId;
    private String name;
    private String middleName;
    private String lastName;
    private int yearsOfExperience;

    public Referee(RefereeBuilder refereeBuilder){
        this.fixtureId = refereeBuilder.fixtureId;
        this.refereeId = refereeBuilder.refereeId;
        this.name = refereeBuilder.name;
        this.middleName = refereeBuilder.middleName;
        this.lastName = refereeBuilder.lastName;
        this.yearsOfExperience = refereeBuilder.yearsOfExperience;
    }

    public String getFixtureId() {
        return fixtureId;
    }

    public String getRefereeId() {
        return refereeId;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Referee{" +
                "fixtureId='" + fixtureId + '\'' +
                ", refereeId='" + refereeId + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public static class RefereeBuilder{

        private String fixtureId;
        private String refereeId;
        private String name;
        private String middleName;
        private String lastName;
        private int yearsOfExperience;

        public RefereeBuilder setFixtureId(String fixtureId) {
            this.fixtureId = fixtureId;
            return this;
        }

        public RefereeBuilder setRefereeId(String refereeId) {
            this.refereeId = refereeId;
            return this;
        }

        public RefereeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RefereeBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public RefereeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RefereeBuilder setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public RefereeBuilder copy(Referee referee){
            this.fixtureId = referee.fixtureId;
            this.refereeId = referee.refereeId;
            this.name = referee.name;
            this.middleName = referee.middleName;
            this.lastName = referee.lastName;
            this.yearsOfExperience = referee.yearsOfExperience;
            return this;
        }

        public Referee build(){
            return new Referee(this);
        }

    }

}
