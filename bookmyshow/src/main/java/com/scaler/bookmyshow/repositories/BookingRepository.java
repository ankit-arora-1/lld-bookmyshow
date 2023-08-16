package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository
        extends JpaRepository<Booking, Long> {

    @Override
    Optional<Booking> findById(Long aLong);
}
