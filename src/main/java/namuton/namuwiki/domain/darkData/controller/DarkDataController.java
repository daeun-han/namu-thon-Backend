package namuton.namuwiki.domain.darkData.controller;

import namuton.namuwiki.domain.darkData.domain.DarkData;
import namuton.namuwiki.domain.darkData.service.DarkDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DarkDataController {

    @Autowired
    private DarkDataService darkDataService;

    @GetMapping("/darkdata/all")
    public List<DarkData> getAllDarkData(@RequestParam(defaultValue = "0") int page) {
        return darkDataService.getDarkDataByPage(page, 5);
    }

    @DeleteMapping("/darkdata/delete")
    public ResponseEntity<String> deleteDarkData(@RequestParam Long id) {
        darkDataService.deleteDarkDataById(id);
        return ResponseEntity.ok("DarkData deleted successfully");
    }
}