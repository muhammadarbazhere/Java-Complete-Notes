package com.codewithharry.shape;


public class Rectangle extends Shape{
    // constructor
    Rectangle(int dim1, int dim2){
        super(dim1, dim2);
      
    }
    public int area(){               // area = length(dim1) * width(dim2)   
        return this.dim1 * this.dim2;
    }


}