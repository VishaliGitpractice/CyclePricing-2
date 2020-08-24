package helper;

import model.Seat;

import java.time.LocalDate;

public class SeatHelper {

    public Seat getSeat(LocalDate date) {
        Seat seat = new Seat();
        if (date.isBefore(LocalDate.parse("2016-12-01"))) {
            seat.setCoverPrice(100d);
        } else {
            seat.setCoverPrice(150d);
        }
        return seat;
    }
}
