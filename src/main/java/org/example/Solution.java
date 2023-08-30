package org.example;

import java.util.*;

class Solution {
    static Map<Integer,Long> table = new HashMap<>();
    static {
        table.put(1, 1L);
        table.put(2, 2L);
    }

    public long solution(int n) {
        if(!table.containsKey(n)) {
            long val = solution(n-1) + solution(n-2);
            table.put(n, val % 1234567);
        }
        return table.get(n);
    }
}