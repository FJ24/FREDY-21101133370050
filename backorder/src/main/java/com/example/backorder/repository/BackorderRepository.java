package com.example.backorder.repository;

import com.example.backorder.entity.BackorderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackorderRepository extends JpaRepository<BackorderEntity, Long>{
}
