package vector;

public class VectorND extends Vector {
    public VectorND(double ... coordinates) {
        if (coordinates.length <= 1)
            throw new IllegalArgumentException("Vector can't have 0 or 1 coordinates");
        this.coordinates = coordinates;
    }

    @Override
    protected Vector newVector(double[] coordinates) {
        return new VectorND(coordinates);
    }

    private void dimensionCheck(VectorND vector) {
        if (coordinates.length != vector.coordinates.length)
            throw new RuntimeException("Vectors have different dimensions");
    }

    public VectorND add(VectorND vector) {
        dimensionCheck(vector);
        return (VectorND)super.add(vector);
    }

    public VectorND sub(VectorND vector) {
        dimensionCheck(vector);
        return (VectorND)super.sub(vector);
    }

    public VectorND multiplyBy(double scalar) {
        return (VectorND)super.multiplyBy(scalar);
    }

        protected double scalarProduct(VectorND vector) {
        dimensionCheck(vector);
        return super.scalarProduct(vector);
    }
}
