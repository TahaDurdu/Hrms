package kodlamaio.hrms.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.hrms.Entities.Concretes.JobTitles;

public interface JobTitleDao extends JpaRepository<JobTitles, Integer> {

}
