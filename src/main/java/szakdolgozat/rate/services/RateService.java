package szakdolgozat.rate.services;

import szakdolgozat.rate.dto.RateDTO;

public interface RateService {

    public RateDTO rateBook(Long id, Float rate);

    public RateDTO getOneRate(Long id);

    public RateDTO createRate(RateDTO rate);
}