package vector;

public class Vector2D extends Vector {
    public Vector2D(double x, double y) {
        super(x, y);
    }

    private Vector2D(double ... coordinates) {
        super(coordinates);
    }

    @Override
    protected Vector newVector(double[] coordinates) {
        return new Vector2D(coordinates);
    }

    public Vector2D add(Vector2D vector) {
        return (Vector2D)super.add(vector);
    }

    public Vector2D sub(Vector2D vector) {
        return (Vector2D)super.sub(vector);
    }

    public Vector2D multiplyBy(double scalar) {
        return (Vector2D)super.multiplyBy(scalar);
    }

    public double scalarProduct(Vector2D vector) {
        return super.scalarProduct(vector);
    }
}
