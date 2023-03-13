package com.engineering.vifoodservice.services;

import com.engineering.vifoodservice.data.models.Meal;
import com.engineering.vifoodservice.payload.request.CreateMealRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public interface MealService {
//    String meal(CreateMealRequest createMealRequest);

    void saveMeal(Meal meal);

    Meal createMeal(CreateMealRequest createMealRequest);

    void deleteMeal(UUID id);

    Meal findMeal(UUID id);

    List<Meal> viewAllMeal();

    void removeAllMeals();

}