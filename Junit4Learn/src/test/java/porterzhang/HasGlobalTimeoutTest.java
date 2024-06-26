package porterzhang;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class HasGlobalTimeoutTest {
    public static String log;
    private final CountDownLatch latch = new CountDownLatch(1);

    // 10 seconds max per method tested
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testSleepForTooLong() throws Exception {
        log += "ran1";
        TimeUnit.SECONDS.sleep(100); // sleep for 100 seconds
    }

    @Test
    public void testBlockForever() throws Exception {
        log += "ran2";
        latch.await(); // will block
    }
}
