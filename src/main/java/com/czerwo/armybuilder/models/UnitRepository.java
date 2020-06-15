package com.czerwo.armybuilder.models;

import com.czerwo.armybuilder.models.data.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitRepository extends JpaRepository<Unit, Integer> {
    Optional<Unit> findByName(String name);
}
