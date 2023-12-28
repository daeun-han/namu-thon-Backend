package namuton.namuwiki.domain.data.controller;

import namuton.namuwiki.domain.data.domain.Data;
import namuton.namuwiki.domain.data.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/info")
    public Data getDataById(@RequestParam Long id) {
        return dataService.getDataById(id);
    }
}
