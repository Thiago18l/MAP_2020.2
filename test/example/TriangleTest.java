package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }

    @Test
    public void isoscelesTriangleHaveTwoSidesEqual() throws Exception {
        Triangle triangle = new Triangle(10, 10, 12);
        
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    public void scaleneTriangleHaveDifferentSides() throws Exception {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }
}