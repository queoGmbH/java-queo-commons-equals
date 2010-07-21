package com.queomedia.commons.equals;


/**
 * Compare two objects by there native equals method.
 * @author Ralph Engelmann
 *
 * @param <T> the concrete type
 */
public final class NativeEqualsChecker<T> implements EqualsChecker<T, T> {

    /** The only one instance. */
    @SuppressWarnings("unchecked")
    private static final NativeEqualsChecker INSTANCE = new NativeEqualsChecker();
    
    /**
     * Return an instance for the correct type.
     * @param <T> the concrete type
     * @return the native equals checker
     */
    @SuppressWarnings("unchecked")
    public static <T> NativeEqualsChecker<T> getInstance() {
        return INSTANCE;
    }
    
    /** Use {@link #getInstance()} instead. */    
    private NativeEqualsChecker() {
        super();
    }
    
    @Override
    public boolean equals(T objectT, T objectK) {
        if (objectT == null) {
            return objectK == null;
        } else {
            return objectT.equals(objectK);
        }
    }

}
