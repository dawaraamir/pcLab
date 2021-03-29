package pcsystems;

public class Case {
    public Case(String manufacturer, String powerSupply, Dimension dimensions) {
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    private String powerSupply;

    public String getPowerSupply() {
        return powerSupply;
    }
    private Dimension dimensions;

    public Dimension getDimensions() {
        return dimensions;
    }

    public void pressPowerButton() {
        System.out.println("PowerButton Pressed");
    }
}
