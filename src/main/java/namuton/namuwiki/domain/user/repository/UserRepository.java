package namuton.namuwiki.domain.user.repository;

import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Data, Long> {

    @Query("SELECT u.darkDataCnt FROM User u WHERE u.id = :userId")
    Integer findDarkDataCntByUserId(@Param("userId") Long userId);

    @Query("SELECT u FROM User u ORDER BY u.darkDataCnt DESC")
    List<User> findAllOrderByDarkDataCntDesc();

    @Query("SELECT COUNT(u) + 1 FROM User u WHERE u.darkDataCnt > (SELECT u2.darkDataCnt FROM User u2 WHERE u2.id = :userId)")
    Integer findRankByUserId(@Param("userId") Long userId);

    @Query("SELECT SUM(d.darkDataCnt) FROM User d")
    Integer findTotalDarkDataCnt();
}
