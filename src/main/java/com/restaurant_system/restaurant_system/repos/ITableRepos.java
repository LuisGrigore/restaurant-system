package com.restaurant_system.restaurant_system.repos;
import com.restaurant_system.restaurant_system.model.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITableRepos extends JpaRepository<TableEntity, Long> {
}
