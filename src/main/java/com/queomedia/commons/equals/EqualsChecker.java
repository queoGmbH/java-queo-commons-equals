/**
 * 
 */
package com.queomedia.commons.equals;

/**
 * Compare objects by an different equals functionality then there own.
 * 
 * This interface makes it possible to compare for example apples and oranges by equal weight.
 * 
 * @param <T> type of the first objects
 * @param <K> type of the second objects
 *
 *
 */
public interface EqualsChecker<T, K> {

    /**
     * Calculate equality by specific attributes.
     * @param objectT the first object, of type T
     * @param objectK the other object, of type K
     * @return true if the objects are equals by some specific attributes
     */
    boolean equals(T objectT, K objectK);
}
