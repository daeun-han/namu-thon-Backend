package namuton.namuwiki.domain.darkData.service;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.darkData.repository.DarkDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DarkDataService {

    @Autowired
    private DarkDataRepository darkDataRepository;

    public List<DarkData> getAllDarkData() {
        return darkDataRepository.findAll();
    }
}
