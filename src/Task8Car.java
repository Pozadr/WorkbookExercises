public class Task8Car {
    private String model;
    private int productionYear;
    private String color;
    private boolean used = false;

    // getters
    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    // setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public boolean isUsed() {
        return used;
    }
}
