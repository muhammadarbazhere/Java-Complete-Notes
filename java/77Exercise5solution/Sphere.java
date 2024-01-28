package com.codewithharry.shape;

public class Sphere extends Shape{
    // constructor
    Sphere(int dim1){
        super(dim1);
    }
    public double area(){                   // 4 pi r(square)
        return 4 * MATH.pi * this.dim1 * this.dim1;
    }

}