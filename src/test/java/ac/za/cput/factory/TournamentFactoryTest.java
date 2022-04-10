/**
 * Tournament.java
 * Tournament Factory Test
 * Author: Melisa Bhixa 217131085
 * Date:10 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.Tournament;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TournamentFactoryTest {

    private Tournament tournament = null;

    @BeforeEach
    public void createInGameStats(){
        Faker data = new Faker();

        tournament = TournamentFactory
                .createTournament(data.code().asin(),
                        data.esports().event(),
                        data.esports().league(),
                        data.random().nextInt(4, 32));

        System.out.println("TournamentFactory: " + tournament);
    }

    @Timeout(5)
    @Test
    public void testTournamentId(){

        assertNotNull(tournament.getTournamentId());
    }

    @Timeout(5)
    @Test
    public void testTournamentName(){

        assertNotNull(tournament.getTournamentName());
    }

    @Timeout(5)
    @Test
    public void testTournamentType(){

        assertNotNull(tournament.getTournamentType());
    }

    @Timeout(5)
    @Test
    public void testNumberOfTeams(){

        assertNotNull(tournament.getNumberOfTeams());
    }
}
