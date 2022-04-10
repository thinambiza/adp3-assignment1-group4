package ac.za.cput.entity;

/**
 Manager.java
 Manager Entity
 Author: Panashe Muinzani (218186568)
 Date: 31 March 2022
 */

public class Manager {
    private String managerId;
    private String teamId;
    private String firstName;
    private int age;
    private int yearsOfExperience;
    private String middleName;
    private String lastName;

    public Manager(Builder Builder) {
        this.managerId = Builder.managerId;
        this.teamId = Builder.teamId;
        this.firstName = Builder.firstName;
        this.age = Builder.age;
        this.yearsOfExperience = Builder.yearsOfExperience;
        this.middleName = Builder.middleName;
        this.lastName = Builder.lastName;
    }

    public String getManagerId() {
        return managerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", yearsOfExperience=" + yearsOfExperience +
                ", middleName=" + middleName +
                ", lastName=" + lastName +
                '}';
    }

    public static class Builder {
        private String managerId;
        private String teamId;
        private String firstName;
        private int age;
        private int yearsOfExperience;
        private String middleName;
        private String lastName;

        public Builder setManagerId(String managerId) {
            this.managerId = managerId;
            return this;
        }

        public Builder setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }

        public Builder copy(Manager manager) {
            return this;
        }
    }
}



