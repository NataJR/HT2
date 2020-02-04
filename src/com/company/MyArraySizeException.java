package com.company;

   public class MyArraySizeException extends java.lang.Exception {
       private String number;

       public MyArraySizeException(String number) {
           this.number = number;

       }

       public int getNumber() {
           int number = 0;
           return number;

       }
   }