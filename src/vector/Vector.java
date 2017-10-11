package vector;

public abstract class Vector implements IVector {
    private double[] coordinates;

    private Vector newVector(double[] coordinates) {
        switch (coordinates.length) {
            case 2:
                return new Vector2d(coordinates);
            case 3:
                return new Vector3d(coordinates);
            default:
                return new VectorNd(coordinates);
        }
    }

    /*
    public abstract void setCoordinates(double x, double y);
    public abstract void setCoordinates(double x, double y, double z);
    public abstract void setCoordinates(double ... coordinates);
    */

    public double[] getCoordinates() {
        return coordinates;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        for (int i = 0; i < coordinates.length; i++)
            hashCode += Math.pow(7, i) * coordinates[i];
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!this.getClass().isInstance(obj.getClass()))
            return false;
        final Vector other = (Vector) obj;
        for (int i = 0; i < coordinates.length; i++)
            if (other.coordinates[i] != coordinates[i])
                return false;
        return true;
    }

    @Override
    public Vector add(Vector vector) {
        double[] newCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = coordinates[i] + vector.coordinates[i];
        return newVector(newCoordinates);
    }

    @Override
    public Vector sub(Vector vector) {
        double[] newCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = coordinates[i] - vector.coordinates[i];
        return newVector(newCoordinates);
    }

    @Override
    public Vector multiplyBy(double scalar) {
        double[] newCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = scalar * coordinates[i];
        return newVector(newCoordinates);
    }

    @Override
    public double scalarProduct(Vector vector) {
        double product = 0;
        for (int i = 0; i < coordinates.length; i++)
            product += coordinates[i] * vector.coordinates[i];
        return product;
    }

    @Override
    public double length() {
        double sum = 0;
        for (double e : coordinates)
            sum += e * e;
        return Math.sqrt(sum);
    }
}
