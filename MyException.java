package ro.uaicinfo.lab11;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Inexistent")
public class MyException extends RuntimeException{

    MyException(String could_not_find_player_with_the_given_id) {
        throw new UnsupportedOperationException(could_not_find_player_with_the_given_id);
    }
    
}

