package szakdolgozat.rate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import szakdolgozat.rate.dto.BookDTO;
import szakdolgozat.rate.dto.RateDTO;
import szakdolgozat.rate.services.RateService;

@RestController
@RequestMapping("/rate")
public class RateController {

    @Autowired
    private RateService service;

    @PutMapping("/{id}/rate/{rate}")
    public RateDTO rateBook(@PathVariable Long id, @PathVariable Float rate) {
        return service.rateBook(id, rate);
    }

    /*  @PutMapping("/update/{id}")
    public RateDTO updateRate(@PathVariable Long id) {
        return service.updateRate(id);
    }*/

    @PostMapping("/add")
    public RateDTO createRate(@RequestBody RateDTO rate) {
        return service.createRate(rate);
    }

    @GetMapping("/list/rate/{id}")
    public List<RateDTO> getRateListById(@PathVariable Long id) {
        return service.getRateListById(id);
    }

    @GetMapping("/list/book/{id}")
    public BookDTO getBookById(@PathVariable Long id) {
        return service.getOneBook(id);
    }
}