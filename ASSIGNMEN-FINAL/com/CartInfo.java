
/*carts providing customer based on registration and mentioning time*/
package com;
import prod.*;

import java.util.Date;

class CartsInfo implements Runnable {

 // Available carts are
 int available = 2;
 String need="yes";

@Override
 public void run() {
      synchronized (this) {
          System.out.println("Available carts= " + available);
  
          if(available!=0){
               String name = Thread.currentThread().getName();
               System.out.println("if you want cart:"+need);
               System.out.println( " Cart reserved for " + name);
               available--; 
          }else{
        	  
            	   System.out.println("no carts available please wait for sometime");
               }
            
               }
          } 
       
    
 }


