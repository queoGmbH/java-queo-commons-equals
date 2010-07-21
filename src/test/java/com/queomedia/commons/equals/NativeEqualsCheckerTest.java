package com.queomedia.commons.equals;

import static org.junit.Assert.*;

import org.junit.Test;

public class NativeEqualsCheckerTest {

    @Test
    public void testEquals() {
        Object a = new Object();
        
        assertTrue (NativeEqualsChecker.getInstance().equals(a, a));
    }
    
    @Test
    public void testEqualsNotEquals() {
        Object a = new Object();
        Object b = new Object();
        
        assertFalse (NativeEqualsChecker.getInstance().equals(a, b));
    }

}
