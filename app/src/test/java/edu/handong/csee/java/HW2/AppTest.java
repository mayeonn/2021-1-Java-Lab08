/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.handong.csee.java.HW2;

import org.junit.Test;

import edu.handong.csee.java.App;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
