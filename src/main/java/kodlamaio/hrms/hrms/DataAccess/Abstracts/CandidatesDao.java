package kodlamaio.hrms.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.hrms.Entities.Concretes.Candidates;


public interface CandidatesDao extends JpaRepository<Candidates, Integer> {

}
