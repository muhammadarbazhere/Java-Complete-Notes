/*   you have to create a package named com.codewithharry.shape this package should have
 individual classes for rectangle, square,circle,cylinder,spherethese classes should have use
inheritance to properly manage the code! include methods like volume,surface area and 
getter/setter for dimensions*/


package com.codewithharry.shape;    // shape wali class sb say pehlay khud say bnaey

public class Shape{
                         // attributes    area sphere length wgera ki jga ishr dim use kray gay
       int dim1,dim2;

                                   // constructor    idhr alt insert kaam nhi krta           
      Shape(int dim1, int dim2){ 
      this.dim1 = dim2;
        this.dim2 = dim2;
      }
                                    // getter and setter
//getter                               
       public int getDim1(){
        return this.dim1;
       }
         public int getDim2(){
        return this.dim2;
       }
// setter
       public void setDim1(int dim1){
        this.dim1 = dim1;
       }
         public void setDim2(int dim2){
        this.dim2 = dim2;
       } 
}

       
          