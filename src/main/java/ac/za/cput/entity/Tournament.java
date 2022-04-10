/**
 * Tournament.java
 * Tournament Entity
 * Author: Melisa Bhixa 217131085
 * Date: 31 March 2022
 */

package ac.za.cput.entity;

public class Tournament {
    private String tournamentId;
    private String tournamentName;
    private String tournamentType;
    private int numberOfTeams;

    public Tournament(TournamentBuilder tournamentBuilder) {
        this.tournamentId = tournamentBuilder.tournamentId;
        this.tournamentName = tournamentBuilder.tournamentName;
        this.tournamentType = tournamentBuilder.tournamentType;
        this.numberOfTeams = tournamentBuilder.numberOfTeams;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentId='" + tournamentId + '\'' +
                ", tournamentName='" + tournamentName + '\'' +
                ", tournamentType='" + tournamentType + '\'' +
                ", numberOfTeams='" + numberOfTeams + '\'' +
                '}';
    }

    public static class TournamentBuilder{
        private String tournamentId;
        private String tournamentName;
        private String tournamentType;
        private int numberOfTeams;

        public Tournament.TournamentBuilder setTournamentId(String tournamentId) {
            this.tournamentId = tournamentId;
            return this;
        }

        public Tournament.TournamentBuilder setTournamentName(String tournamentName) {
            this.tournamentName = tournamentName;
            return this;
        }

        public Tournament.TournamentBuilder setTournamentType(String tournamentType) {
            this.tournamentType = tournamentType;
            return this;
        }

        public Tournament.TournamentBuilder setNumberOfTeams(int numberOfTeams) {
            this.numberOfTeams = numberOfTeams;
            return this;
        }

        public Tournament.TournamentBuilder copy(Tournament tournamentBuilder){
            this.tournamentId = tournamentBuilder.tournamentId;
            this.tournamentName = tournamentBuilder.tournamentName;
            this.tournamentType = tournamentBuilder.tournamentType;
            this.numberOfTeams = tournamentBuilder.numberOfTeams;
            return this;
        }

        public Tournament build(){ return new Tournament(this);
        }
    }
}


