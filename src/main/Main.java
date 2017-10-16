package main;

import vector.Vector2D;
import vector.Vector3D;
import vector.VectorND;

public class Main {

    public static void main(String[] args) {
        Vector2D a = new Vector2D(1, 1);
        Vector3D b = new Vector3D(1, 1,  1);
        a.add2D(b);
    }
}
