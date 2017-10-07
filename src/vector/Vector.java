package vector;

public class Vector
{
    private int[] coordinates;

    public Vector(int ... params)
    {
        coordinates = params;
    }

    private boolean dimensionCheck(Vector vector)
    {
        return coordinates.length == vector.coordinates.length;
    }

    private double length()
    {
        int temp = 0;

        for (int element : coordinates)
            temp += element * element;
        return Math.sqrt(temp);
    }

    public Vector add(Vector vector)
    {
        if (!dimensionCheck(vector))
            return new Vector(); //exception

        int[] newCoordinates = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = coordinates[i] + vector.coordinates[i];
        return new Vector(newCoordinates);
    }

    public Vector multByScalar(int scalar)
    {
        int[] newCoordinates = new int[coordinates.length];
        for (int i = 0; i < coordinates.length; i++)
            newCoordinates[i] = coordinates[i] * scalar;
        return new Vector(newCoordinates);
    }

    public int scalarProduct(Vector vector)
    {
        if (!dimensionCheck(vector))
            return Integer.MIN_VALUE; //exception

        int temp = 0;
        for (int i = 0; i < coordinates.length; i++)
            temp += coordinates[i] * vector.coordinates[i];
        return temp;
    }

    public boolean equals(Vector vector)
    {
        //if (!dimensionCheck(vector)) exception
        //    return ;
        for (int i = 0; i < coordinates.length; i++)
            if (coordinates[i] != vector.coordinates[i])
                return false;
        return true;
    }
}
