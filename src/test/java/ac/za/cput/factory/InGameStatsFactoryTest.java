/**
 * InGame Stats.java
 * InGame Stat Factory Test
 * Author: Melisa Bhixa 217131085
 * Date:10 April 2022
 */

package ac.za.cput.factory;

import ac.za.cput.entity.InGameStats;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class InGameStatsFactoryTest {

    private InGameStats inGameStatsFactory = null;

    @BeforeEach
    public void createInGameStats(){
        Faker data = new Faker();

        inGameStatsFactory = InGameStatsFactory
                .createInGameStats(data.code().asin(),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.random().nextInt(10),
                        data.code().asin());

        System.out.println("In game stats: " + inGameStatsFactory);
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testNumberOfRedCards(){

        assertNotNull(inGameStatsFactory.getNumberOfRedCards());
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testFixtureId(){

        assertNotNull(inGameStatsFactory.getFixtureIdId());
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testNumberOfCorners(){

        assertNotNull(inGameStatsFactory.getNumberOfCorners());
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testNumberOfFreeKicks(){

        assertNotNull(inGameStatsFactory.getNumberOfFreeKicks());
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testPossession(){

        assertNotNull(inGameStatsFactory.getPossession());
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testNumberOfShotsOnTarget(){

        assertNotNull(inGameStatsFactory.getNumberOfShotsOnTarget());
    }

    @Timeout(5)
    @Test
    //Valid input test-
    public void testNumberOfShots(){

        assertNotNull(inGameStatsFactory.getNumberOfShots());
    }


}
