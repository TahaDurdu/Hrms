package kodlamaio.hrms.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.hrms.Entities.Concretes.Employees;


public interface EmployeesDao extends JpaRepository<Employees, Integer> {

}
