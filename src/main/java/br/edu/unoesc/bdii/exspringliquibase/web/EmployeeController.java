package br.edu.unoesc.bdii.exspringliquibase.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.bdii.exspringliquibase.domain.Employee;
import br.edu.unoesc.bdii.exspringliquibase.domain.EmploymentType;
import br.edu.unoesc.bdii.exspringliquibase.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	private final EmployeeRepository employeeRepository;

	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@GetMapping(path = "/list")
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@GetMapping(path = "/create")
	public Employee createEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Reese");
		employee.setEmail("john.reese@example.com");
		employee.setPhone("903-888-9999");
		employee.setEmploymentType(EmploymentType.CONTRACTOR);
		return employeeRepository.saveAndFlush(employee);
	}
}
