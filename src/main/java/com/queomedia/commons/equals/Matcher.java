package com.queomedia.commons.equals;

/**
 * A matcher indicates if an item matches an specific restriction.
 *
 *
 * @param <T>
 */
public interface Matcher<T> {

    public boolean matches(T item);
}
