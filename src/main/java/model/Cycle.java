package model;

public class Cycle {

    private Chain chain;
    private Frame frame;
    private HandleBar handleBar;
    private Seat seat;
    private Wheel wheel;

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public HandleBar getHandleBar() {
        return handleBar;
    }

    public void setHandleBar(HandleBar handleBar) {
        this.handleBar = handleBar;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Double totalPrice() {
        System.out.println(" chain price : "+this.getChain().getTotalPrice());
        System.out.println(" FramePrice : "+this.getFrame().getTotalPrice());
        System.out.println(" HandleBarPrice : "+this.handleBar.getTotalPrice());
        System.out.println(" SeatingPrice : "+this.getSeat().getTotalPrice());
        System.out.println(" WheelPrice : "+this.wheel.getTotalPrice());
        return this.getChain().getTotalPrice()+this.getFrame().getTotalPrice()+this.handleBar.getTotalPrice()+this.getSeat().getTotalPrice()+this.wheel.getTotalPrice();
    }
}
