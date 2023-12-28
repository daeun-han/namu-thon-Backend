package namuton.namuwiki.domain.data.service;

import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.data.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public List<Data> getFilteredData() {
        String keyword = "광고";
        return dataRepository.findByKeyword(keyword.toLowerCase());
    }
}