package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogTriggerRepo extends JpaRepository<LogTrigger,Integer> {

}





