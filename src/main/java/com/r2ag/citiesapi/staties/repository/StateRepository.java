package com.r2ag.citiesapi.staties.repository;

import com.r2ag.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
