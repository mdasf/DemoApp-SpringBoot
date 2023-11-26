package com.example.services;

import com.example.dao.InsightDao;
import com.example.models.InsightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsightService {

    @Autowired
    private InsightDao insightDao;

    public List<InsightModel> fetchInsights(){
       List<InsightModel> insights =  insightDao.findAll();
        System.out.println(insights);
        return insights;
    }

}
