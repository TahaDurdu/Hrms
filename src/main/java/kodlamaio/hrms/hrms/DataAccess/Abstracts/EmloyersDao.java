package kodlamaio.hrms.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.hrms.Entities.Concretes.Employers;


public interface EmloyersDao extends JpaRepository<Employers, Integer> {

}
