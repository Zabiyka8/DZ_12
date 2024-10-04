package org.klozevitz.phat_store_mvc_java_311.repositories;

import org.klozevitz.phat_store_mvc_java_311.model.entities.stock.entities.StockPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockPositionRepository extends JpaRepository<StockPosition, Integer> {
}
