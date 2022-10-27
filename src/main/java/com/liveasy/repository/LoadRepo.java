package com.liveasy.repository;

import com.liveasy.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoadRepo extends JpaRepository<Load, Long> {

}
