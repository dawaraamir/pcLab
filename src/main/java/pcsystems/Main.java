package pcsystems;

public class Main {

    public static void main(String[] args) {


        Resolution resolution = new Resolution(1080, 300);
        Monitor monitor = new Monitor(resolution, "Mac", "Apple");
        Dimension dimensions = new Dimension(4, 5, 2);
        Case theCase = new Case("Apple", "battery", dimensions);
        Motherboard motherBoard = new Motherboard("Apple", 2, 2, "Bios");

        PC pc = new PC(theCase, motherBoard, monitor);

        pc.description();
        pc.powerUp();

    }
}
