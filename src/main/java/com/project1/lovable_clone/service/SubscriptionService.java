package com.project1.lovable_clone.service;

import com.project1.lovable_clone.dto.subscription.CheckoutRequest;
import com.project1.lovable_clone.dto.subscription.CheckoutResponse;
import com.project1.lovable_clone.dto.subscription.PortalResponse;
import com.project1.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);
}