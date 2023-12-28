package namuton.namuwiki.domain.data.service;

import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.data.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public List<Data> getFilteredData() {
        String keyword = "광고";
        return dataRepository.findByKeyword(keyword.toLowerCase());
    }

    public List<Data> getDataFromSixMonthsAgo() {
        LocalDateTime sixMonthsAgo = LocalDateTime.now().minus(6, ChronoUnit.MONTHS);
        return dataRepository.findByDateBefore(sixMonthsAgo);
    }
}