package listener;

import org.testng.*;

import java.util.Arrays;
import java.util.logging.Logger;

public class TestListener implements IClassListener, ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        if (Arrays.asList(result.getMethod().getGroups()).contains("SkipMe"))
            throw new SkipException("Test was skipped");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Logger.getAnonymousLogger().info(result.getThrowable().getMessage());
    }
}
