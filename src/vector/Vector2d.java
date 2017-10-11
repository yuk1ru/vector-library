package vector;

public class Vector2d extends Vector {
    private double[] coordinates;
    public Vector2d(double x, double y) {
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public Vector2d(double[] coordinates) {
        this.coordinates = coordinates;
    }

}
