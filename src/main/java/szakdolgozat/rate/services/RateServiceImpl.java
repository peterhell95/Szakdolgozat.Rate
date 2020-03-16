package szakdolgozat.rate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.Setter;
import szakdolgozat.rate.dto.BookDTO;
import szakdolgozat.rate.mapper.BookMapper;
import szakdolgozat.rate.model.Book;
import szakdolgozat.rate.repository.RateRepository;

@Service
@Transactional
public class RateServiceImpl implements RateService {
    @Autowired
    @Getter
    @Setter
    private RateRepository repository;

    @Autowired
    private BookMapper bookMapper;

    public BookDTO rateBook(Long id, Float rate) {
        BookDTO book = getOneBook(id);
        book.setRatecount(book.getRatecount() + 1);
        book.setRate(rate + book.getRate());
        Book entity = bookMapper.bookDTOToBookUpdate(book);
        return bookMapper.bookToBookDTO(repository.save(entity));
    }

    public BookDTO getOneBook(Long id) {
        return bookMapper.bookToBookDTO(repository.findById(id).get());
    }

}