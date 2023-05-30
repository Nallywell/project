package com.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;


@Repository
public interface CustomerCRMRepo extends JpaRepository<CustomerCRM,Integer> {


}

