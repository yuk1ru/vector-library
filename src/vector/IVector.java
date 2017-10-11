package vector;

interface IVector {
    Vector add(Vector vector);
    Vector sub(Vector vector);
    Vector multiplyBy(double scalar);
    double length();
    double scalarProduct(Vector vector);
}
