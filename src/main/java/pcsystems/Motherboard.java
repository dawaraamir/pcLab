package pcsystems;

public class Motherboard {
    public Motherboard(String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    void loadProgram(String programName) {
        System.out.println(programName);
    }
}
