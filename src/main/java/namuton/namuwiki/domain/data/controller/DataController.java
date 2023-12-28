package namuton.namuwiki.domain.data.controller;

import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.data.repository.DataRepository;
import namuton.namuwiki.domain.data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/info")
    public ResponseEntity<Data> getDataById(@RequestParam Long id) {
        Data data = dataRepository.findById(id).orElse(null);

        if (data != null) {
            return new ResponseEntity<>(data, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
