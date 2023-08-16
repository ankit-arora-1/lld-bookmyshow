package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.Booking;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class BookingService {

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId,
                             List<Long> seatIds,
                             Long showId) {

        // 1. Get the user with the user id
        // 2. Get the show with that show id
        // ----------- Start Transaction -------
        // 3. Get the seats with that seat ids
        // 4. Check if the seats are available
        // 5. If no, return error
        // 6. If yes, mark the status of the seats as locked
        // 7. Save the updated seat status in the DB
        // --------------- END Transaction -------
        // 8. return success
        return null;
    }
}
