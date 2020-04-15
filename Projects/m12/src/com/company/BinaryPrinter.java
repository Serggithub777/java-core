package com.company;

 class MyFirstClass {
     private int size;

     public MyFirstClass(int size) {
         this.size = size;
     }

     public int getSize() {
         return size;
     }

     public void setSize(int size) {
         this.size = size;
     }

     void printBinary(long value) {
         for (int i = size - 1; i >= 0; i--) {
             long mask = 1L << i;
             long result = (value & mask)>>i;
             System.out.print(result);
         }

     }

}
