package com.User.Demo;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Parameter;
//import org.springframework.data.repository.query.Param
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepo extends CrudRepository<Useremp, String> {
	
	//@Query(value="SELECT new com.User.Demo.State( s.State) "+"FROM State s LEFT JOIN com.User.Demo.Useremp on s.id=:id")
	//@Query(value="select statename from State")
	//@Query(value="SELECT s.statename,u.id  FROM State s,Useremp u  where u.id=:id")
	//public List<Dto> getNameById(String id);//findby<Classname>Id
	//public List<Useremp> findStateNameByStateId(String id)
	
	//public Optional<Useremp> findByStateId(@Param("id") String id);
	@Query(value="select name from Useremp",nativeQuery = true)
	public List<Useremp> findALLName();
    
	@Query(value="select userstate.statename FROM userstate LEFT JOIN useremp ON useremp.state_id=userstate.id WHERE useremp.state_id=:id",nativeQuery = true)
	public List<State> findByState_Id(@Param("id") String id);
	
	@Query(value="select * from Useremp",nativeQuery = true)
	public List<Useremp> findAllUsers();

	public List<Useremp> findByState(String id);

	public List<Useremp> findByName(String name);

	public List<Useremp> findByStateId(String id);

		
	//public List<Useremp> findByName(String name);
}
