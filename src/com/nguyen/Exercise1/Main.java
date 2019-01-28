package com.nguyen.Exercise1;

public class Main {

    public static void main(String[] args) {
        int temp[] = {45, 29, 10, 22, 41, 28, 33};
        float precipitation[] = {95, 60, 25, 5, 0, 75, 90};

        for (int i=0; i<temp.length; i++){
            if (temp[i] <= 32 && precipitation[i] > 50){
                System.out.println("It's going to snow");
            }
        }

    }
}
