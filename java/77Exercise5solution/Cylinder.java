
package com.codewithharry.shape;

public class Cylinder extends Shape{
    //constructor
    Cylinder(int dim1, int dim2){
        super(dim1, dim2);
    }
    public double area(){      //   2 pi r h + 2 pi r(square)
                                                              // 2 * pi * r * (h + r)

                                                   // r = dim1
                                                   // h = dim2

        return 2 * MATH.pi * this.dim1 * ( this.dim2 + this.dim1); 
    }

}