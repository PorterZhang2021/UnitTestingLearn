package porterzhang;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        // 此处的配置顺序会影响执行顺序
        JunitTest1.class,
        JunitTest2.class
})
public class JunitSuiteTest {

}
