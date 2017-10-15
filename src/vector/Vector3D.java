package vector;

public class Vector3D extends Vector{
    public Vector3D(double x ,double y, double z) {
        super(x, y, z);
    }

    private Vector3D(double ... coordinates) {
        super(coordinates);
    }

    @Override
    protected Vector newVector(double[] coordinates) {
        return new Vector3D(coordinates);
    }

    public Vector3D add(Vector3D vector) {
        return (Vector3D)super.add(vector);
    }

    public Vector3D sub(Vector3D vector) {
        return (Vector3D)super.sub(vector);
    }

    public Vector3D multiplyBy(double scalar) {
        return (Vector3D)super.multiplyBy(scalar);
    }

    public double scalarProduct(Vector3D vector) {
        return super.scalarProduct(vector);
    }
}
