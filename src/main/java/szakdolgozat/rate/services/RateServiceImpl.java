package szakdolgozat.rate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import szakdolgozat.rate.dto.BookDTO;
import szakdolgozat.rate.dto.RateDTO;
import szakdolgozat.rate.mapper.BookMapper;
import szakdolgozat.rate.mapper.RateMapper;
import szakdolgozat.rate.model.Rate;
import szakdolgozat.rate.repository.BookRepository;
import szakdolgozat.rate.repository.RateRepository;

@Service
@Slf4j
@Transactional
public class RateServiceImpl implements RateService {
    @Autowired
    @Getter
    @Setter
    private RateRepository repository;

    @Autowired
    @Getter
    @Setter
    private BookRepository repository2;

    @Autowired
    private RateMapper rateMapper;
    @Autowired
    private BookMapper bookMapper;

    public RateDTO rateBook(Long id, Float rate) {
        RateDTO book = getOneRate(id);
        /* book.setRatecount(book.getRatecount() + 1);
        book.setRate(rate + book.getRate());
        Rate entity = bookMapper.bookDTOToBookUpdate(book);
        return bookMapper.bookToBookDTO(repository.save(entity));*/
        return book;
    }

    public RateDTO getOneRate(Long id) {
        log.debug("reteId:" + id);
        return rateMapper.rateToRateDTO(repository.findById(id).get());
    }

    public RateDTO createRate(RateDTO rate) {
        Rate entity = rateMapper.rateDTOToRate(rate);
        return rateMapper.rateToRateDTO(repository.save(entity));
    }

    @Override
    public List<RateDTO> getRateListById(Long id) {
        return rateMapper.rateListToRateDTOList(repository.findAllByOrderid(id));
    }

    public BookDTO getOneBook(Long id) {
        return bookMapper.bookToBookDTO(repository2.findById(id).get());
    }
}