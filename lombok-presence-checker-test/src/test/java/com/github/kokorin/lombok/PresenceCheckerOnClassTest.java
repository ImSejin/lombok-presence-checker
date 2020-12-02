package com.github.kokorin.lombok;

import org.junit.Assert;
import org.junit.Test;

@PresenceChecker
public class PresenceCheckerOnClassTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Test
    public void test() {
        PresenceCheckerOnClassTest pc = new PresenceCheckerOnClassTest();
        Assert.assertFalse(pc.hasName());
        pc.setName("any");
        Assert.assertTrue(pc.hasName());
    }
}
