package com.company.Calculators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * bumerang calculator
 * @author Samvel Ghazaryan
 * */
public class BumerangCalculator {


    public List<int[]> getBumerangsFromArray(int[] arr) {
        if (arr.length < 3 || arr == null) return null;

        List<int[]> bumerangs = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 2;
        int[] tempArr = new int[3];

        while (endIndex != arr.length-1) // maybe length-1
        {
            int middlevalue = arr[startIndex +1];
            if (arr[startIndex] == arr[endIndex] && arr[startIndex] != middlevalue && arr[endIndex]!= middlevalue) {
                tempArr = Arrays.copyOfRange(arr, startIndex, endIndex+1);
                bumerangs.add(tempArr);
            }
        startIndex++;
        endIndex++;
        }
        return bumerangs;
    }
}
