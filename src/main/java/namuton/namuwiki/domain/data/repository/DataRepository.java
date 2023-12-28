package namuton.namuwiki.domain.data.repository;

import namuton.namuwiki.domain.data.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DataRepository extends JpaRepository<Data, Long> {

    @Query("SELECT d FROM Data d WHERE LOWER(d.title) LIKE %:keyword% OR LOWER(d.content) LIKE %:keyword%")
    List<Data> findByKeyword(String keyword);
}
