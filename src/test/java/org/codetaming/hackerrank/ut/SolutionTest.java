package org.codetaming.hackerrank.ut;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void given_starting_height_of_1_and_0_cycles_return_1() throws Exception {
        assertThat(solution.calculateHeight(1, 0), is(1));
    }

    @Test
    public void given_starting_height_of_1_and_1_cycles_return_2() throws Exception {
        assertThat(solution.calculateHeight(1, 1), is(2));
    }

    @Test
    public void given_starting_height_of_1_and_4_cycles_return_7() throws Exception {
        assertThat(solution.calculateHeight(1, 4), is(7));
    }

    @Test
    public void given_test_input_output_correct_output() throws Exception {
        String data = "3\n0\n1\n4";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Solution.main(new String[]{});
        assertThat(out.toString(), is("1\n2\n7\n"));
    }
}
