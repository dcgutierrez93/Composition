// Master object and using composition to create objects within objects.
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Consturctor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Function
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphics.
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
