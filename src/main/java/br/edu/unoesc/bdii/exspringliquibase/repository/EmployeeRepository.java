package br.edu.unoesc.bdii.exspringliquibase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.bdii.exspringliquibase.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
