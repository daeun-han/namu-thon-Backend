package namuton.namuwiki.domain.darkData.repository;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.data.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DarkDataRepository extends JpaRepository<DarkData, Long> {

    @Query("SELECT e FROM DarkData e ORDER BY e.date ASC")
    List<DarkData> findAllOrderByDateAsc();
}
