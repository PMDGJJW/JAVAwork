package Text4;

public class APPLE {
    private double size;
    private String Color;

    public APPLE() {
    }

    public APPLE(double size, String color) {
        this.size = size;
        Color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
