package com.engineering.vifoodservice.services;

import com.engineering.vifoodservice.data.models.Meal;
import com.engineering.vifoodservice.data.repositories.MealRepo;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MealServiceImplTest {

    @Autowired
    private MealRepo mealRepo;
    MealService mealService;

    @BeforeEach
    void setUp() {
        mealService = new MealServiceImpl(mealRepo);
    }
    @AfterEach
    void tearDown() {
        mealRepo.deleteAll();
    }

    @Test
    void createMeal() {
        Meal meal = new Meal(UUID.randomUUID(),"",BigDecimal.valueOf(12.8), Instant.now(),"KE WAY");
        Meal meal1 = new Meal(UUID.randomUUID(),"",BigDecimal.valueOf(14.3),Instant.now(),"ZAzu");



        mealRepo.saveAll(Arrays.asList(meal,meal1));
        assertEquals(2,Arrays.asList(meal,meal1).size());
    }

    @Test
    void deleteMeal() {
       Meal meal = new Meal(
               UUID.randomUUID(),
               "",
               BigDecimal.valueOf(12.8),
               Instant.now(),
               "Ke way"
       );

       mealRepo.delete(meal);
       assertNotNull(meal);
    }

    @Test
    void findMeal() {
    }

    @Test
    void viewAllMeal() {

    }
}