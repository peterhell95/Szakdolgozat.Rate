package szakdolgozat.rate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import szakdolgozat.rate.services.RateService;

@RestController
@RequestMapping("/rate")
public class RateController {

    @Autowired
    private RateService service;

    /*  @PutMapping("/{id}/rate/{rate}")
    public BookDTO rateBook(@PathVariable Long id, @PathVariable Float rate) {
        return service.rateBook(id, rate);
    } */

}