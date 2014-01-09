package com.queomedia.commons.equals;

/**
 * Check if: objectK is instance of objectT.
 * @author Ralph Engelmann
 *
 */
public final class InstanceOfEqualsChecker implements EqualsChecker<Class<?>, Object> {

    /** The only one instance. */
    public static final InstanceOfEqualsChecker INSTANCE = new InstanceOfEqualsChecker();
    
    /** Use {@link #INSTANCE} instead. */
    private InstanceOfEqualsChecker() {
        super();
    }
    
    @Override
    public boolean equals(final Class<?> objectT, final Object objectK) {
        if (objectK == null) {
            return false;
        } else {
            return objectK.getClass().isInstance(objectK);
        }
    }

}
