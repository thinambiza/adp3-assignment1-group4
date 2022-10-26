/**
 PlayerStats.java
 Entity for the PlayerStats
 Author: Zuko Fukula (217299911)
 Date: 17 October 2022
 */

package ac.za.cput.domain.info;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "player_stats")
public class PlayerStats {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    private int goalsScored;
    private int assistsMade;
    private int goalsSaved;

    public PlayerStats(Builder builder) {
        this.id = builder.id;
        this.goalsScored = builder.goalsScored;
        this.assistsMade = builder.assistsMade;
        this.goalsSaved = builder.goalsSaved;
    }

    public PlayerStats() {

    }

    public String getId() {
        return id;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssistsMade() {
        return assistsMade;
    }

    public int getGoalsSaved() {
        return goalsSaved;
    }

    public static class Builder{

        private String id;
        private int goalsScored;
        private int assistsMade;
        private int goalsSaved;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setGoalsScored(int goalsScored) {
            this.goalsScored = goalsScored;
            return this;
        }

        public Builder setAssistsMade(int assistsMade) {
            this.assistsMade = assistsMade;
            return this;
        }

        public Builder setGoalsSaved(int goalsSaved) {
            this.goalsSaved = goalsSaved;
            return this;
        }

        public Builder copy(PlayerStats playerStats){
            this.id = playerStats.id;
            this.goalsScored = playerStats.goalsScored;
            this.assistsMade = playerStats.assistsMade;
            this.goalsSaved = playerStats.goalsSaved;
            return this;
        }

        public PlayerStats build(){
            return new PlayerStats(this);
        }

    }
}
