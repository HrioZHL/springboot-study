package com.hrio.springboot.basis.exception.controller;

import com.hrio.springboot.basis.exception.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户接口
 *
 * @author Hrio
 * @date 2022/05/12
 */
@RestController
@RequestMapping("/api")
public class UserController {
    List<User> userList = new ArrayList<>();

    @PostMapping("/user")
    public ResponseEntity<List<User>> addUser(@RequestBody User user) {
        userList.add(user);
        return ResponseEntity.ok(userList);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") int id) {
        userList.remove(id);
        return ResponseEntity.ok(userList);
    }

    @GetMapping("/user")
    public ResponseEntity<?> getUserByName(@RequestParam("userName") String userName) {
        return ResponseEntity.ok(userList.stream().filter(user -> user.getUserName().equals(userName)).collect(Collectors.toList()));
    }

}
