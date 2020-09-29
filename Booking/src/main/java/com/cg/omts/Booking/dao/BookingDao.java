package com.cg.omts.Booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.omts.Booking.entity.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Integer> {

}
