package com.engineering.vifoodservice.services;

import com.engineering.vifoodservice.data.models.Meal;
import com.engineering.vifoodservice.data.repositories.MealRepo;
import com.engineering.vifoodservice.payload.request.CreateMealRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MealServiceImpl implements MealService{
    MealRepo mealRepo;
    @Autowired
    public MealServiceImpl(MealRepo mealRepo) {
        this.mealRepo = mealRepo;
    }

//    @Override
//    public String meal(CreateMealRequest createMealRequest) {
//        Optional<Meal> meal = mealRepo.findMealsByDescriptionIgnoreCase(createMealRequest.getDescription());
//        if (meal.isPresent()){
//            if (meal.get().getDescription().equalsIgnoreCase(createMealRequest.getDescription())&&
//               meal.get().getImage().equalsIgnoreCase(createMealRequest.getImage()))
//                return "Order found";
//
//        }else {
//            return "No order Found";
//
//        }
//        throw new RuntimeException("Please try ordering again");
//
//    }
    @Override
    public void saveMeal(Meal meal) {
     mealRepo.save(meal);
    }

    @Override
    public Meal createMeal(CreateMealRequest createMealRequest) {
        Meal meal = Meal.builder().
                image(createMealRequest.getImage()).
                description(createMealRequest.getDescription()).
                preparationTimeInMinutes(createMealRequest.getPreparationTimeInMinutes()).
                price(createMealRequest.getPrice()).build();

        mealRepo.save(meal);

        return meal;
    }

    @Override
    public void deleteMeal(UUID id) {
        Meal meal = mealRepo.findById(id).get();
        mealRepo.deleteById(meal.getId());
    }

    @Override
    public Meal findMeal(UUID id) {
        Meal meal = mealRepo.findById(id).get();
        mealRepo.findById(meal.getId());
        return meal;
    }

    @Override
    public List<Meal> viewAllMeal() {
        return mealRepo.findAll();
    }

    @Override
    public void removeAllMeals() {
       mealRepo.deleteAll();
    }


}
