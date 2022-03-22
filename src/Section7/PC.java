package Section7;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public void powerUp() {
        theCase.getPowerSupply();
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200,50,"yellow");
    }


    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}
