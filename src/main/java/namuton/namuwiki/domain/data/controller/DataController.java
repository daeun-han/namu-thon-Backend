package namuton.namuwiki.domain.data.controller;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.darkData.repository.DarkDataRepository;
import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.data.repository.DataRepository;
import namuton.namuwiki.domain.data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @Autowired
    private DarkDataRepository darkDataRepository;  // Inject DarkDataRepository


    @GetMapping("/info")
    public ResponseEntity<Data> getDataById(@RequestParam Long id) {
        Data data = dataRepository.findById(id).orElse(null);

        if (data != null) {
            return new ResponseEntity<>(data, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Autowired
    private DataService dataService;

    @GetMapping("/filter")
    public List<DarkData> getFilteredData() {
        List<Data> filteredData = dataService.getFilteredData();

        // Convert Data objects to DarkData objects
        List<DarkData> darkDataList = filteredData.stream()
                .map(this::convertToDarkData)
                .collect(Collectors.toList());

        // Save filtered data to DarkData repository
        darkDataRepository.saveAll(darkDataList);

        return darkDataList;
    }

    // Convert Data to DarkData
    private DarkData convertToDarkData(Data data) {
        DarkData darkData = new DarkData();
        darkData.setId(data.getId());
        darkData.setUser(data.getUser());
        darkData.setTitle(data.getTitle());
        darkData.setContent(data.getContent());
        darkData.setFrom(data.getFrom());
        darkData.setDate(data.getDate());
        darkData.setDeleted(false); // Assuming isDeleted is equivalent to deleted in DarkData
        return darkData;
    }
}
