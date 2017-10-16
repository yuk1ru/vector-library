package vector;

public interface IVector {
    Vector add(Vector vector);
    Vector sub(Vector vector);
    Vector multiplyBy(double scalar);
    double scalarProduct(Vector vector);
}
