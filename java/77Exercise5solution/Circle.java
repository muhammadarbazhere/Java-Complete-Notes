package com.codewithharry.shape;

public class Circle extends Shape{
   // constructor
    Circle(int dim1){                         
        super(dim1);
    }

    
    public double area(){                       // pi  r * r
        return MATH.pi * this.dim1 * this.dim1;
    }

}