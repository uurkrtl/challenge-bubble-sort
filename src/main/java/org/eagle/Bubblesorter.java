package org.eagle;

public class Bubblesorter {
    int[] sort(int[] array){
        boolean sorted = false;
        String sortedNumbers="";
        int secondNumber;
        while (sorted==false){
            sorted = true;
            for (int i = 0; i<array.length-1; i++){
                if (!(array[i]<array[i+1])){
                    secondNumber = array[i+1];
                    array[i+1] = array[i];
                    array[i] = secondNumber;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
