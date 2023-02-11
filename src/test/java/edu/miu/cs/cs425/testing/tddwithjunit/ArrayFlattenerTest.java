package edu.miu.cs.cs425.testing.tddwithjunit;

import java.util.List;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @org.junit.Before
    public void setUp() throws Exception {
        this.arrayFlattener= new ArrayFlattener();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @org.junit.Test
    public void testFlattenArrayWithValues() {
        Integer[][] array = {{1, 3}, {0}, {4, 5, 9}};
        List<Integer> actual= arrayFlattener.flattenArray(array);
        Integer[] expected = {1, 3, 0, 4, 5, 9};
        assertEquals(actual,expected);
    }

    @org.junit.Test
    public void testFlattenArrayWithNullValues() {
        Integer[][] array = {};
        List<Integer> actual= arrayFlattener.flattenArray(array);
        Integer[] expected = {};
        assertEquals(actual, expected);
    }
}