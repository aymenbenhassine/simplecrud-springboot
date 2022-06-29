package com.elyadata.simplecrud.controller;

import com.elyadata.simplecrud.model.Room;
import com.elyadata.simplecrud.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    RoomService roomService ;

    @GetMapping("/")
    public List<Room> findAll(){
        return roomService.findAll();
    }
    @GetMapping("/{id}")
    public Room findById(@PathVariable(name = "id") Long id){
        return roomService.findById(id);
    }
    @PostMapping("/")
    public Room addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }
    @PutMapping("/")
    public Room updateRoom(@RequestBody Room room){
        return roomService.updateRoom(room);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable(name = "id") Long id){
        roomService.deleteRoom(id);
    }

}
