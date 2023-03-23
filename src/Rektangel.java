import javax.swing.*;

public class Rektangel {
    public int height;
    public int width;

    public Rektangel(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return width*height;
    }

    public boolean isSquare() {
        return width == height;
    }
}
