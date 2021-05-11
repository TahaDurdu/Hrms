package kodlamaio.hrms.hrms.DataAccess.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.hrms.Entities.Concretes.User;


public interface UserDao extends JpaRepository<User, Integer> {

}
