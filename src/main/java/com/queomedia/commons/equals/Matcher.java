package com.queomedia.commons.equals;

/**
 * A matcher indicates if an item matches an specific restriction.
 * @author Ralph Engelmann
 *
 * @param <T>
 */
public interface Matcher<T> {

    public boolean matches(T item);
}
