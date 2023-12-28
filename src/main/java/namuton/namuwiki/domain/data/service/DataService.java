package namuton.namuwiki.domain.data.service;

import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.data.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public Data getDataById(Long id) {
        return dataRepository.findById(id).orElse(null);
    }
}