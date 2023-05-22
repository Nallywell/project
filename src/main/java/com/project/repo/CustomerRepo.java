package com.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {


    Integer findCustomerId(int identityValue);
}

