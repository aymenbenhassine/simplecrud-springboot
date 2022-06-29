package com.elyadata.simplecrud.service;

import com.elyadata.simplecrud.model.Room;
import com.elyadata.simplecrud.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements IRoomService {

    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room addRoom(Room r) {
        return roomRepository.save(r);
    }

    @Override
    public Room updateRoom(Room r) {
        return roomRepository.save(r);
    }

    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id).get();
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
