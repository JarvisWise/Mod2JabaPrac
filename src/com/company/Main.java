package com.company;

import java.io.*;

public class Main {

    private static final int SIZE = 10;
    public static void main(String[] args) throws IOException {


        /// for write data in file
        /*FileOutputStream fileOutputStream;
        DataOutputStream dataInputStream ;
        try {
            fileOutputStream = new FileOutputStream("myFile");
            dataInputStream = new DataOutputStream(fileOutputStream);

            int[] arr = new int[]{10,21, 33, 124,-74,43,10,10,124,-2};

            for (int elem: arr) {
                dataInputStream.writeInt(elem);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        fileOutputStream.close();
        dataInputStream.close();
        }*/


        int[] array = new int[SIZE];
        FileInputStream inputFile = null;
        DataInputStream input = null;
        try {
            inputFile = new FileInputStream("myFile");
            input = new DataInputStream(inputFile);


            for(int i=0;i!=SIZE;i++) {
                array[i] = input.readInt();
            }

            Menu menu = new Menu();
            menu.menu(array);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputFile!=null)
                inputFile.close();
            if(input!=null)
                input.close();
        }
    }
}
