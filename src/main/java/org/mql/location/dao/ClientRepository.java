package org.mql.location.dao;

import javax.transaction.Transactional;


import org.mql.location.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, String>{
	 @Modifying
	    @Transactional
	    @Query("UPDATE client u SET   u = c2  WHERE u = c1")
	    boolean update(Client c1,Client c2);
}
