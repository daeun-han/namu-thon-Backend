package namuton.namuwiki.domain.user.controller;

import namuton.namuwiki.domain.user.domain.User;
import namuton.namuwiki.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/myScore")
    public ResponseEntity<Integer> getDeletedEmail(@RequestParam Long userId) {
        return userService.getDeletedEmail(userId);
    }

    @GetMapping("/rankBoard")
    public ResponseEntity<List<User>> getRankBoard() {
        return userService.getRankBoard();
    }

    @GetMapping("/myRank")
    public ResponseEntity<Integer> getUserRank(@RequestParam Long userId) {
        return userService.getUserRank(userId);
    }

    @GetMapping("/percent")
    public ResponseEntity<Double> getUserPercent(@RequestParam Long userId) {
        return userService.getUserPercent(userId);
    }
}
