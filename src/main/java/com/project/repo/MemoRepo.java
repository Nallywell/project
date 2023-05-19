package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepo extends JpaRepository<Memo,Integer> {
}
