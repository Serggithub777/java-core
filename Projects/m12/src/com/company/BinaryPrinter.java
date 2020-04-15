package com.company;

 class BinaryPrinter {
     private int size;

     void printBinary(long value) {
         for (int i = size - 1; i >= 0; i--) {
             long mask = 1L << i;
             long result = (value & mask)>>i;
             System.out.print(result);
         }
     }
     public BinaryPrinter(int size) {
         this.size = size;
     }

     public int getSize() {
         return size;
     }

     public void setSize(int size) {
         this.size = size;
     }
}
