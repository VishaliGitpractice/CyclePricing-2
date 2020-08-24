package helper;

import model.Wheel;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class WheelHelper {

    public Wheel getWheel(LocalDate date, String type) {
        Wheel wheel = new Wheel();



        if ( (type.equalsIgnoreCase("tubeless"))&&date.isBefore(LocalDate.parse("2016-12-01"))) {
            wheel.setRimPrice(100d);
            wheel.setSpokesPrice(150d);
            wheel.setTubePrice(0d);
            wheel.setTyrePrice(200d);
        } else if(date.isBefore(LocalDate.parse("2016-12-01"))) {
            wheel.setRimPrice(100d);
            wheel.setSpokesPrice(150d);
            wheel.setTubePrice(200d);
            wheel.setTyrePrice(200d);
        }
        else {
            wheel.setRimPrice(120d);
            wheel.setSpokesPrice(175d);
            wheel.setTubePrice(200d);
            wheel.setTyrePrice(230d);
        }
        return wheel;
    }
}
