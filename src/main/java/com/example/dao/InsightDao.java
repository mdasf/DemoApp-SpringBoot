package com.example.dao;

import com.example.models.InsightModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsightDao extends JpaRepository<InsightModel,Integer> {
}
