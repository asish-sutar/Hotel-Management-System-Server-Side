package com.crud.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.hotel.model.BookedRoom;

import java.util.List;
import java.util.Optional;

/**
 * @author Asish Sutar
 */

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    List<BookedRoom> findByRoomId(Long roomId);

 Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> findByGuestEmail(String email);
}
