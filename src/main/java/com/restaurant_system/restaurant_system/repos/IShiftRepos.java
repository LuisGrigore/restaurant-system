package com.restaurant_system.restaurant_system.repos;

import com.restaurant_system.restaurant_system.model.ShiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShiftRepos extends JpaRepository<ShiftEntity, Long> {
}
