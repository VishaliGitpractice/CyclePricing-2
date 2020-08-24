package helper;

import model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class CycleHelper {

    private ChainHelper chainHelper = new ChainHelper();
    private FrameHelper frameHelper = new FrameHelper();
    private HandleBarHelper handleBarHelper = new HandleBarHelper();
    private SeatHelper seatHelper = new SeatHelper();
    private WheelHelper wheelHelper = new WheelHelper();

    public Cycle getCycle(Map<String,String> components, LocalDate date) {
        Cycle cycle = new Cycle();
        if (components.containsKey("chain")) {
            cycle.setChain(chainHelper.getChain(date));
        } else {
            Chain chain = new Chain();
            chain.setNutsPrice(0d);
            cycle.setChain(chain);
        }

        if (components.containsKey("frame") ){
            cycle.setFrame(frameHelper.getFrame(date,components.get("frame")));
        }
        else {
            Frame frame = new Frame();
            frame.setRodPrice(0d);
            cycle.setFrame(frame);
        }

        if (components.containsKey("handle")) {
            cycle.setHandleBar(handleBarHelper.getHandleBar(date,components.get("handle")));
        } else {
            HandleBar handleBar = new HandleBar();
            handleBar.setBrakesPrice(0d);
            cycle.setHandleBar(handleBar);
        }

        if (components.containsKey("seat")) {
            cycle.setSeat(seatHelper.getSeat(date));
        } else {
            Seat seat = new Seat();
            seat.setCoverPrice(0d);
            cycle.setSeat(seat);
        }

        if (components.containsKey("wheel")) {
            cycle.setWheel(wheelHelper.getWheel(date,components.get("wheel")));
        } else {
            Wheel wheel = new Wheel();
            wheel.setRimPrice(0d);
            wheel.setSpokesPrice(0d);
            wheel.setTubePrice(0d);
            wheel.setTyrePrice(0d);
            cycle.setWheel(wheel);
        }
        return cycle;
    }
}
