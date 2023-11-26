package br.edu.unoesc.bdii.exspringliquibase.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoesc.bdii.exspringliquibase.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> 
	findByfirstNameLike(String firstName);
	
	@Query("select e from Employee e")
	List<Employee> listEmployees();
	
}
