package vector;

public class Vector
{
    private int[] coordinates;
    private int dimension;

    public Vector(int ... c)
    {
        this.coordinates = c.clone();
        this.dimension = this.coordinates.length;
    }

    public int GetDimension()
    {
        return this.dimension;
    }

    public int[] GetCoordinates()
    {
        return this.coordinates;
    }

    public double GetLength()
    {
        int sum = 0;
        for (int i : this.coordinates)
            sum += i * i;
        return Math.sqrt(sum);
    }

    public Vector MultByScalar(int a)
    {
        return new Vector(CoordinatesByScalar(a));
    }

    private int[] CoordinatesByScalar(int a)
    {
        int[] newCoordinates = new int[this.dimension];
        for (int i = 0; i < this.dimension - 1; i++)
            newCoordinates[i] = a * this.coordinates[i];
        return newCoordinates;
    }

    public Vector Add(Vector vector)
    {
        int[] newCoordinates = SumOfCoordinates(vector.coordinates);
        if (newCoordinates.length == 0)
            return new Vector(0);
        return new Vector(newCoordinates);
    }

    private int[] SumOfCoordinates(int[] coordinates)
    {
        if (this.dimension != coordinates.length)
            return new int[] {};

        int[] sumCoordinates = new int[this.dimension];
        for (int i = 0; i < this.dimension - 1; i++)
            sumCoordinates[i] = this.coordinates[i] + coordinates[i];
        return sumCoordinates;
    }
}
