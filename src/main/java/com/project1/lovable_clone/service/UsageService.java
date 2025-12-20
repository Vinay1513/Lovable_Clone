package com.project1.lovable_clone.service;

import com.project1.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.project1.lovable_clone.dto.subscription.UsageTodayResponse;
import org.springframework.stereotype.Service;

@Service
public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
