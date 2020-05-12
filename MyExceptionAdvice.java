package ro.uaicinfo.lab11;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionAdvice {

    @ExceptionHandler(value = MyException.class)
    public ResponseEntity<MyErrorResponse>handleGenericNotFoundException(MyException e){
        MyErrorResponse error = new MyErrorResponse(e.getMessage());
        error.setTimestamp(LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
