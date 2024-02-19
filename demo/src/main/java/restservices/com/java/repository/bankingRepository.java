package restservices.com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import restservices.com.java.model.banking;

public interface bankingRepository extends JpaRepository<banking,Integer> {

	
	
}
