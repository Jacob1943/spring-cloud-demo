package me.ye.streamsender.repository;

import me.ye.streamsender.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Jacob
 * @date 23/03/2018
 */

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
