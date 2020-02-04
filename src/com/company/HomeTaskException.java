package com.company;

public class HomeTaskException {
        public static void main(String[] args) throws MyArrayDataException {
                Object[][] arr;
                int sum = 0;
                try {
                        arr = initArray(4, 4);
                } catch (MyArraySizeException e) {
                        e.printStackTrace();
                        return;
                }
                for (int i = 0; i < arr.length; i++)
                        for (int j = 0; j < arr[i].length; j++) {
                                try {
                                        sum += (int) arr[i][j];
                                } catch (RuntimeException e) {
                                        throw new MyArrayDataException("there is the unauthorized type in the cell  [" + i + "],[" + j + "] ");
                                }
                        }
                System.out.println("The aray sum  = " + sum);
        }

        public static Object[][] initArray(int row, int col) throws MyArraySizeException {
                if (row != 4 || col != 4) {
                        throw new MyArraySizeException("The array shoudn't be bigger than 4x4");
                }
                return new Object[][]{{1, 2 , 4, 3}, {1, 2, 3, 4}};
        }
}

