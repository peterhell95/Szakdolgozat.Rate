package szakdolgozat.rate.services;

import szakdolgozat.rate.dto.BookDTO;

public interface RateService {

    public BookDTO rateBook(Long id, Float rate);

    public BookDTO getOneBook(Long id);

}