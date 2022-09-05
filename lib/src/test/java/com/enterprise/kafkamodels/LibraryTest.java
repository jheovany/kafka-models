/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.enterprise.kafkamodels;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private static final Logger logger = LoggerFactory.getLogger(LibraryTest.class);

    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void createHobbitQuote() {
        HobbitQuotes hobbitQuotes = new HobbitQuotes(1, "A hobbit quote");
        logger.info(hobbitQuotes::toString);
        logger.info(() -> String.valueOf(hobbitQuotes.getId()));
        logger.info(hobbitQuotes::getQuote);
        assertNotNull(hobbitQuotes);
    }
}
