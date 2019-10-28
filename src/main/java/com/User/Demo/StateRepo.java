package com.User.Demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StateRepo extends CrudRepository<State, String>{

public	List<State> findByStatename(String name);
	
}
