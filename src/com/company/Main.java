package com.company;

import com.company.Calculators.BumerangCalculator;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.util.List;
/**
 * Main class
 * @author Samvel Ghazaryan
 * */
public class Main {

    public static void main(String[] args) {
        
        // write your code here
        int[] arr = new int[]{1, 2, 1, 2, 5, 6, 5, 8, 6,8,7,7,7,5,7,9,8,2,3,2};
        BumerangCalculator bmc = new BumerangCalculator();
        List<int[]> bumerangs = bmc.getBumerangsFromArray(arr);

        for (int[] items : bumerangs)
        {
            System.out.print("[");
            for (int item : items)
            {
                System.out.print( item + ",");
            }
            System.out.print("]");
            System.out.println();
        }

    }
}
