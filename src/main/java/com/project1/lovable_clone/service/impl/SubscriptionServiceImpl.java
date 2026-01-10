package com.project1.lovable_clone.service.impl;

import com.project1.lovable_clone.dto.subscription.CheckoutRequest;
import com.project1.lovable_clone.dto.subscription.CheckoutResponse;
import com.project1.lovable_clone.dto.subscription.PortalResponse;
import com.project1.lovable_clone.dto.subscription.SubscriptionResponse;
import com.project1.lovable_clone.entity.Plan;
import com.project1.lovable_clone.error.ResourceNotFoundException;
import com.project1.lovable_clone.repository.PlanRepository;
import com.project1.lovable_clone.security.AuthUtil;
import com.project1.lovable_clone.service.SubscriptionService;
import com.stripe.exception.StripeException;
import com.stripe.param.checkout.SessionCreateParams;
import com.stripe.model.checkout.Session;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }
}
