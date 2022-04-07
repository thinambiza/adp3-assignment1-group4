package ac.za.cput.repository.impl;

import ac.za.cput.entity.Referee;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface IRefereeRepository extends IRepository<Referee, String> {
    Set<Referee> getAll();
}
