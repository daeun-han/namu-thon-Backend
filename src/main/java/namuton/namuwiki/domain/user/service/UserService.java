package namuton.namuwiki.domain.user.service;

import namuton.namuwiki.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Integer> getTotalDarkDataCount() {
        Integer totalDarkDataCount = userRepository.findTotalDarkDataCnt();
        // gram 단위라서 *4 해서 1통당 4g
        return ResponseEntity.ok(totalDarkDataCount * 4);
    }
}
