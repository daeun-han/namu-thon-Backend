package namuton.namuwiki.domain.darkData.service;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.darkData.repository.DarkDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DarkDataService {

    @Autowired
    private DarkDataRepository darkDataRepository;

    public List<DarkData> getDarkDataByPage(int page, int pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize);
        return darkDataRepository.findAllByOrderByDateAsc(pageRequest).getContent();
    }
}
