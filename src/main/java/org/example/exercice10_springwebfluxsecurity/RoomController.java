package org.example.exercice10_springwebfluxsecurity;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    private final List<Room> rooms = new ArrayList<>();

    @GetMapping
    public List<Room> getRooms() {
        rooms.add(new Room(1, "Room 1"));
        rooms.add(new Room(2, "Room 2"));
        rooms.add(new Room(3, "Room 3"));
        return rooms;
    }

    @PostMapping("/admin")
    public Room addRoom(@RequestBody Room room) {
        rooms.add(room);
        return room;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable int id) {
        rooms.remove(id);
    }
}
