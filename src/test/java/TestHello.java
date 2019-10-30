import com.lhy.spring.Hello;
import com.lhy.spring.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liuhaiyan
 * @date 2019-09-29 18:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class TestHello {
    @Autowired
    private Hello hello;
    @Test
    public void test1() {
        hello.sayHello();

    }
}
