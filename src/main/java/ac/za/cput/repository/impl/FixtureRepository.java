package ac.za.cput.repository.impl;

import ac.za.cput.entity.Fixture;

import java.util.HashSet;
import java.util.Set;

public class FixtureRepository implements IFixtureRepository{

    private static FixtureRepository repository = null;
    private Set<Fixture> fixturesDataBase = null;

    private FixtureRepository(){
        fixturesDataBase = new HashSet<Fixture>();
    }

    public static FixtureRepository getRepository(){
        if (repository == null){
            repository = new FixtureRepository();
        }
        return repository;
    }

    @Override
    public Fixture create(Fixture fixture) {
        boolean success = fixturesDataBase.add(fixture);
        if (!success){
            return null;
        }
        return fixture;
    }

    @Override
    public Fixture read(String fixtureId) {
        for (Fixture fixture : fixturesDataBase)
            if (fixture.getFixtureId().equalsIgnoreCase(fixtureId)){
                return fixture;
            }
        return null;
    }

    @Override
    public Fixture update(Fixture fixture) {
        Fixture oldFixture = read(fixture.getFixtureId());
        if (oldFixture != null){
            fixturesDataBase.remove(oldFixture);
            fixturesDataBase.add(fixture);
            return fixture;
        }
        return null;
    }

    @Override
    public boolean delete(String fixtureId) {
        Fixture fixtureToDelete = read(fixtureId);
        if (fixtureToDelete == null)
            return false;
        fixturesDataBase.remove(fixtureToDelete);
        return false;
    }

    @Override
    public Set<Fixture> getAll() {
        return null;
    }
}
