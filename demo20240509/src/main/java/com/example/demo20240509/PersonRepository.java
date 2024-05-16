package com.example.demo20240509;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	@Modifying
	@Transactional
	@Query("update Person p set p.name= ?1 where p.name= ?2")
	int updateName(String string1, String string2);

	@Modifying
	@Transactional
	@Query("update Person p set p.address= :a_add where p.address = :b_add")
	int updateAddress(@Param("b_add") String before_address, @Param("a_add") String after_address);

	List<Person> findByAge(int age);

	List<Person> findByAgeLessThan(int age);

	List<Person> findByAgeGreaterThan(int age);

	List<Person> findByName(String name);

	List<Person> findByAddress(String Address);
	
	List<Person> findByNameOrAddress(String name,String Address);

	
	@Query("SELECT p FROM Person p WHERE (:name IS NULL OR p.name = :name) AND "
			+ "(:address IS NULL OR p.address = :address) AND "
			+ "(:age = 0 OR p.age = :age) AND "
			+ "(:id = 0 OR p.id = :id)")
	List<Person> findByAny(@Param("name") String name, @Param("address") String address,@Param("age") int age,@Param("id") int id);

}
