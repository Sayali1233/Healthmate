package com.healthmate.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.healthmate.entities.Notification;
import com.healthmate.entities.User;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserOrderByCreatedAtDesc(User user);
    List<Notification> findByUserAndStatus(User user, String status);
}
