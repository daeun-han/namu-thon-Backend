package namuton.namuwiki.domain.user.controller;

import namuton.namuwiki.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/total")
    public ResponseEntity<Integer> getTotalDeletedEmail() {
        return userService.getTotalDarkDataCount();
    }
}
