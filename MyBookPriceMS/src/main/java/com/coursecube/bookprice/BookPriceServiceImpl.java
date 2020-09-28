package com.coursecube.bookprice;

import com.coursecube.exception.BookIDNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class BookPriceServiceImpl implements BookPriceService{
    static Logger log = LoggerFactory.getLogger(BookPriceServiceImpl.class);

    @Autowired
    BookPriceDAO bookPriceDAO;

    @Override
    public BookPrice getBookPriceById(Integer bookId) {
        log.info("--BookPriceServiceImpl--getBooPriceById()--");
        Optional<BookPrice> opt = bookPriceDAO.findById(bookId);
        if(opt.isPresent()){
            return opt.get();
        }else{
            throw new BookIDNotFoundException();
        }
    }

    @Override
    public double getOfferedPriceById(Integer bookId) {
        log.info("--BookPriceServiceImpl--getOfferedPriceById()--");
        double offeredPrice=0.0;
        Optional<BookPrice> opt = bookPriceDAO.findById(bookId);
        if(opt.isPresent()){
            BookPrice bookPrice = opt.get();
            double price = bookPrice.getPrice();
            double offer = bookPrice.getOffer();
            if(offer <= 0){
                return price;
            }
            offeredPrice = price - price * offer/100;

        }
        return offeredPrice;
    }
}
