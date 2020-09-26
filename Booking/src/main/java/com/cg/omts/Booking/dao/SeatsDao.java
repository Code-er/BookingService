package com.cg.omts.Booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.omts.Booking.entity.Seats;

public interface SeatsDao  extends JpaRepository<Seats, Integer> {

}
