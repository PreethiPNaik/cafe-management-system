package com.cafe.management.repository;

import com.cafe.management.model.CafeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeItemRepository extends JpaRepository<CafeItem, Long> {
}
