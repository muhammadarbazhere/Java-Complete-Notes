package com.codewithharry.shape;


public class Square extends Shape{
    // constructor                           
    Square(int dim1){
        super(dim1);
    }
    public int area(){                    //   area = a * a 
        return this.dim1 * this.dim1;
    }

}