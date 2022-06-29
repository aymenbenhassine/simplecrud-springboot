package com.elyadata.simplecrud.service;

import com.elyadata.simplecrud.model.Room;

import java.util.List;

public interface IRoomService {
    public Room addRoom(Room r);
    public Room updateRoom(Room r);
    public Room findById(Long id);
    public List<Room> findAll();
    public void deleteRoom(Long id);

}
