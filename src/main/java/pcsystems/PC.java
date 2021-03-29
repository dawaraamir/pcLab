package pcsystems;

public class PC {
    private Case theCase;
    private Motherboard motherBoard;
    private Monitor monitor;

    public PC() {

    }

    public PC(Case theCase, Motherboard motherBoard, Monitor monitor) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixel(4, 6, "blue");
    }

    public void description() {
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(theCase.toString());
        System.out.println(motherBoard.toString());
        System.out.println(monitor.toString());
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();

        motherBoard.loadProgram("This shit");

    }
}
