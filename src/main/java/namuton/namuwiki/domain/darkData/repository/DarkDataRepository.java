package namuton.namuwiki.domain.darkData.repository;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DarkDataRepository extends JpaRepository<DarkData, Long> {

    Page<DarkData> findAllByOrderByDateAsc(Pageable pageable);
}
