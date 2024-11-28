package cz.cuni.mff.java.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import cz.cuni.mff.sopteles.util.Arrays;

public class MainParaMergeSort {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = input.readLine()) != null) {
                try {
                    int n = Integer.parseInt(line);
                    numbers.add(n);
                }
                catch (NumberFormatException ex) {
                    // do nothing
                }
            }
        }
        catch (IOException ex) {
            // do nothing
        }

        int[] newArr = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            newArr[i] = numbers.get(i);
        }

        Arrays.paraMergeSort(newArr);

        for (var num : newArr) {
            System.out.println(num);
        }
    }
}
