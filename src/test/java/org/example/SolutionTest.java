package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(int s, long answer) {
        // when
        long result = solution.solution(s);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test
    void testcase1() {
        // given
        int s = 4;
        long answer = 5L;

        // when & then
        assertAnswer(s, answer);
    }

    @Test
    void testcase2() {
        // given
        int s = 3;
        long answer = 3L;

        // when & then
        assertAnswer(s, answer);
    }
}