package namuton.namuwiki.domain.user.service;

import namuton.namuwiki.domain.user.domain.User;
import namuton.namuwiki.domain.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Integer> getTotalDarkDataCount() {
        Integer totalDarkDataCount = userRepository.findTotalDarkDataCnt();
        return ResponseEntity.ok(totalDarkDataCount);
    }

    public ResponseEntity<Integer> getDeletedEmail(Long userId) {
        return ResponseEntity.ok(userRepository.findDarkDataCntByUserId(userId));
    }

    public ResponseEntity<Double> getUserPercent(Long userId) {
        int totalUser = userRepository.findAllOrderByDarkDataCntDesc().size();
        int myRank = getMyRank(userId);

        double retPercent = (double) myRank /totalUser;

        return ResponseEntity.ok(retPercent);
    }

    public ResponseEntity<List<User>> getRankBoard() {
        List<User> temp = userRepository.findAllOrderByDarkDataCntDesc();
        List<User> ret = new ArrayList<>();

        int chk = 0;
        for(User user : temp) {
            ret.add(user);

            chk++;
            if(chk == 7) break;
        }

        return ResponseEntity.ok(ret);
    }

    public ResponseEntity<Integer> getUserRank(Long userId) {
        return ResponseEntity.ok(getMyRank(userId));
    }

    private Integer getMyRank(Long userId) {
        return userRepository.findRankByUserId(userId);
    }
}
