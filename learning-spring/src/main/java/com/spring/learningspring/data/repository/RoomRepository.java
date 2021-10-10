package com.spring.learningspring.data.repository;

import com.spring.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
