package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;


//17.30

@Repository
public class UserDao {
	
	
	
	//hibernate comes automatically sf create it .we  are not injecting htemp object is injected by sf.@place Autowire
	
	@Autowired    
	private HibernateTemplate hibernateTemplate;
	
@Transactional
	public int saveUser(User user)
	{
		
//		to get data as int we upcast
		
		
		int id=(Integer) this.hibernateTemplate.save(user);
		return id;
	} 

}
