package com.raz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerimeterTest {

    @Test
    void testUndefinedDimensions() {
        Exception exception = assertThrows(Exception.class, () -> {
            Perimeter.perimeter(null, 5);
        });
        assertEquals("Undefined", exception.getMessage());

        exception = assertThrows(Exception.class, () -> {
            Perimeter.perimeter(5, null);
        });
        assertEquals("Undefined", exception.getMessage());
    }

    @Test
    void testInvalidDimensions() {
        Exception exception = assertThrows(Exception.class, () -> {
            Perimeter.perimeter("length", 5);
        });
        assertEquals("Not a number", exception.getMessage());

        exception = assertThrows(Exception.class, () -> {
            Perimeter.perimeter(5, "breadth");
        });
        assertEquals("Not a number", exception.getMessage());
    }

    @Test
    void testNegativeDimensions() {
        Exception exception = assertThrows(Exception.class, () -> {
            Perimeter.perimeter(-5, 10);
        });
        assertEquals("Dimension cannot be negative", exception.getMessage());

        exception = assertThrows(Exception.class, () -> {
            Perimeter.perimeter(10, -5);
        });
        assertEquals("Dimension cannot be negative", exception.getMessage());
    }

    @Test
    void testValidPerimeter() throws Exception {
        assertEquals(30, Perimeter.perimeter(5, 10));
        assertEquals(40, Perimeter.perimeter(10, 10));
    }
}
