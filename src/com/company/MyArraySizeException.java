package com.company;

   public class MyArraySizeException extends java.lang.Exception {
       private int number;

       public MyArraySizeException(int number) {
           this.number = number;

       }

       public int getNumber() {
           int number = number;
           return number;

       }
   }