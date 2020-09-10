package com.codecool.ctci;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiSearch {
    HashMap<String, ArrayList<Integer>> searchAll(String big, String[] smalls) {
        HashMap<String, ArrayList<Integer>> lookup = new HashMap<>();
        for (String small : smalls) {
            ArrayList<Integer> locations = search(big, small);
            lookup.put(small, locations);
        }
        return lookup;
    }

    ArrayList<Integer> search(String big, String small) {
        ArrayList<Integer> locations = new ArrayList<Integer>();
        for (int i = 0; i < big.length() - small.length() + 1; i++) {
            if (isSubstringAtLocation(big, small, i)) {
                locations.add(i);
            }
        }
        return locations;
    }

    boolean isSubstringAtLocation(String big, String small, int offset) {
        for (int i = 0; i < small.length(); i++) {
            if (big.charAt(offset + i) != small.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
