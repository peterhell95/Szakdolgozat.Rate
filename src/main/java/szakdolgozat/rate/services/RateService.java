package szakdolgozat.rate.services;

import java.util.List;

import szakdolgozat.rate.dto.BookDTO;
import szakdolgozat.rate.dto.RateDTO;

public interface RateService {

    public BookDTO rateBook(Long id, Float rate);

    public RateDTO updateRate(Long id);

    public RateDTO getOneRate(Long id);

    public BookDTO getOneBook(Long id);

    public List<RateDTO> getRateListById(Long id);

    public RateDTO createRate(RateDTO rate);
}