package com.gzmtu.backend.repository;

import com.gzmtu.backend.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
 
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByOrderId(Integer orderId);
    List<OrderItem> findByBookId(Integer bookId);
} 