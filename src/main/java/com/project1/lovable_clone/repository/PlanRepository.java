package com.project1.lovable_clone.repository;

import com.project1.lovable_clone.dto.subscription.PortalResponse;
import com.project1.lovable_clone.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {

}
