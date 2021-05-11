package kodlamaio.hrms.hrms.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.hrms.Business.Abstracts.JobTitleService;
import kodlamaio.hrms.hrms.DataAccess.Abstracts.JobTitleDao;
import kodlamaio.hrms.hrms.Entities.Concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
		
	}
	
	

	@Override
	public List<JobTitles> getAll() {
		
	   return this.jobTitleDao.findAll();
	}

}
