package com.smartplanner.service;

import com.smartplanner.model.dto.SmartPlannerInputDto;
import com.smartplanner.model.entity.Lesson;
import com.smartplanner.model.entity.Plan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanService {

    boolean findPlanById(int id);

    Plan getPlanById(int id);

    List<Lesson> generateOptimalPlan(SmartPlannerInputDto smartPlannerInputDto);
}
