package test;

import listener.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class TestFile {

    @Test(groups = "SkipMe")
    public void testSkip() {
        Assert.fail("This test should not execute, it should be skipped");
    }
}
