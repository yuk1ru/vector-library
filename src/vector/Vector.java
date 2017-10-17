package vector;

import java.util.Arrays;

abstract class Vector {
    double[] coordinates;

    protected abstract Vector newVector(double[] coordinates);

    Vector(double ... coordinates) {
        this.coordinates = coordinates;
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
        if (!this.getClass().isAssignableFrom(obj.getClass()))
            return false;
        final Vector other = (Vector) obj;
        for (int i = 0; i < coordinates.length; i++)
            if (other.coordinates[i] != coordinates[i])
                return false;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(coordinates);
    }

    Vector add(Vector vector) {
        double[] newCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = coordinates[i] + vector.coordinates[i];
        return newVector(newCoordinates);
    }

    Vector sub(Vector vector) {
        return add(vector.multiplyBy(-1));
    }

    protected Vector multiplyBy(double scalar) {
        double[] newCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = scalar * coordinates[i];
        return newVector(newCoordinates);
    }

    double scalarProduct(Vector vector) {
        double product = 0;
        for (int i = 0; i < coordinates.length; i++)
            product += coordinates[i] * vector.coordinates[i];
        return product;
    }
}
