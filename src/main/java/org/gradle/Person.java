package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    // Exists just to trigger a FindBugs warning.
    @Override
    public int hashCode() {
    	return 42;
    }
}
