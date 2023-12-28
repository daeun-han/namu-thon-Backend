package namuton.namuwiki.domain.darkData.repository;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DarkDataRepository extends JpaRepository<DarkData, Long> {
}
