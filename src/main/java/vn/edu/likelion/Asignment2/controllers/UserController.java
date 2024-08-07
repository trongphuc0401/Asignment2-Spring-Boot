package vn.edu.likelion.Asignment2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.edu.likelion.Asignment2.entities.UserEntity;
import vn.edu.likelion.Asignment2.services.User.UserService;


/**
 * UserController -
 *
 * @param
 * @return
 * @throws
 */

@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserEntity create(@RequestBody UserEntity userEntity) {
        UserEntity user = userService.create(userEntity);
        return user;
    }

}
