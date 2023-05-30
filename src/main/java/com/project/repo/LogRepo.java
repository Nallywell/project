package com.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface LogRepo extends JpaRepository<Log,Integer> {

    Log findByMainInputAndServiceName(int mainInput, String serviceName);
    }






