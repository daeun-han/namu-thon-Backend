package namuton.namuwiki.domain.user.repository;

import namuton.namuwiki.domain.data.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Data, Long> {

    @Query("SELECT SUM(d.darkDataCnt) FROM User d")
    Integer findTotalDarkDataCnt();
}
