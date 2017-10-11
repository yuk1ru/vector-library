package vector;

public class Vector3d extends Vector{
    private double[] coordinates;
    public Vector3d(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public Vector3d(double x, double y, double z) {
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
    }
}
