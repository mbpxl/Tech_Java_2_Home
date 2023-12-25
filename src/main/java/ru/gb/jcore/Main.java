package ru.gb.jcore;

public class Main {
    public static int getEvenElements(int[] arr) { // Количество чётных элементов массива
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int getDifference(int[] arr) {
        // Ищем наименьший элемент
        int distMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < distMin) {
                distMin = arr[i];
            }
        }

        int distMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > distMax) {
                distMax = arr[i];
            }
        }

        return distMax - distMin;

        // Ищем наибольший элемент
    }

    public static boolean getNeighboringElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == 0) && (arr[i+1] == 0)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 4, 5, 6, 7, -11, 8};
        System.out.println(getEvenElements(arr));
        System.out.println(getDifference(arr));
        System.out.println(getNeighboringElements(arr));
    }
}