package com.mycompany.app;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static boolean test(int[] arr, int k) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(k - i)) {
                return true;
            }
            map.put(i, true);
        }
        return false;
    }
}
