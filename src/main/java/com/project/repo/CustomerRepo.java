package com.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

    @Query("SELECT c.customerId FROM Customer c WHERE c.identityValue = ?1")
    Integer findCustomerIdByIdentityValue(int identityValue);
}

