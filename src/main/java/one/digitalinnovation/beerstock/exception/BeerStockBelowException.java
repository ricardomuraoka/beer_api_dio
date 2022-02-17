package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockBelowException extends Exception {
    public BeerStockBelowException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to increment informed exceeds the min stock capacity: %s", id, quantityToDecrement));
    }
}
