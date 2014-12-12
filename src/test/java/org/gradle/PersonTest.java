package org.gradle;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
    
    // Exists just to trigger a FindBugs warning.
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
