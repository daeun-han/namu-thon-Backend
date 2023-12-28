package namuton.namuwiki.domain.data.repository;

import namuton.namuwiki.domain.data.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
