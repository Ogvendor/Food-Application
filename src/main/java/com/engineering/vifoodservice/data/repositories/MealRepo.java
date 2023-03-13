package com.engineering.vifoodservice.data.repositories;

import com.engineering.vifoodservice.data.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface MealRepo extends JpaRepository<Meal, UUID> {

//   Optional<Meal> findMealsByDescriptionIgnoreCase(String description);
}
