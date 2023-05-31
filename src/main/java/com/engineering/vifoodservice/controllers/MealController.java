package com.engineering.vifoodservice.controllers;

import com.engineering.vifoodservice.payload.request.CreateMealRequest;
import com.engineering.vifoodservice.services.MealService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/meal")
@RestController
public class MealController {


    MealService mealService;

    @Autowired
    public MealController(MealService mealService){
        this.mealService = mealService;
    }
    @PostMapping("/meal_menu")
    public ResponseEntity<?> createMeal(@RequestBody CreateMealRequest createMealRequest){
        return new ResponseEntity<>( mealService.createMeal(createMealRequest), HttpStatus.CREATED);
    }

    @DeleteMapping("/meal_removed/{id}")
    public ResponseEntity<?> deleteMeal(@PathVariable UUID id){
        mealService.deleteMeal(id);
        return new ResponseEntity<>("Meal Deleted",HttpStatus.OK);
    }

    @GetMapping("/meals_available/")
    public ResponseEntity<?> viewMeals(){
        return new ResponseEntity<>( mealService.viewAllMeal(),HttpStatus.FOUND);
    }
    @GetMapping("/select_meal/{id}")
    public ResponseEntity<?> pickMeals(@PathVariable UUID id){
        return new ResponseEntity<>(mealService.findMeal(id),HttpStatus.OK);
    }
}
