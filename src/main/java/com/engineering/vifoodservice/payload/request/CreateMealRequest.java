package com.engineering.vifoodservice.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneOffset;

@Data
@AllArgsConstructor
@Builder
public class CreateMealRequest {
    private String image;
    private BigDecimal price;
    private Instant preparationTimeInMinutes;
    private String description;
}
