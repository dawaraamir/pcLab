package pcsystems;

public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;
    public Monitor(Resolution resolution, String model, String manufacturer) {
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    void drawPixel(int x, int y, String color) {
        System.out.println("Drawing pixel at \" + x + \",\" + y + \" \" + \" in color \"+ color.");
    }

}
