package com.spring.learningspring.data.repository;

import com.spring.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
