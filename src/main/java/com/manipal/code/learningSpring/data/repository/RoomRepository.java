package com.manipal.code.learningSpring.data.repository;

import com.manipal.code.learningSpring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
