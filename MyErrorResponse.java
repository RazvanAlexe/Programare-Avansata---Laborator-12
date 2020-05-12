package ro.uaicinfo.lab11;

import java.time.LocalDateTime;

class MyErrorResponse {

    MyErrorResponse(String message) {
        throw new UnsupportedOperationException(message);
    }

    void setTimestamp(LocalDateTime now) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
