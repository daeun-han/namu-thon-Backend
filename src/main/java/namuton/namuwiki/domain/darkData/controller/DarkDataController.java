package namuton.namuwiki.domain.darkData.controller;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.darkData.service.DarkDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DarkDataController {

    @Autowired
    private DarkDataService darkDataService;

    @GetMapping("/darkdata/all")
    public List<DarkData> getAllDarkData() {
        return darkDataService.getAllDarkData();
    }
}