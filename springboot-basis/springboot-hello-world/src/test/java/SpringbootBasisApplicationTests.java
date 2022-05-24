import com.hrio.springboot.hello.controller.TestController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试类
 * 这个类是通过官方脚手架新建项目时生成
 *
 * @author hrio
 * @date 2022/5/12
 */
@SpringBootTest
class SpringbootBasisApplicationTests {

    @Autowired
    private TestController testController;

    /**
     * 空测试方法，用于验证应用程序是否能够成功加载Spring上下文
     */
    @Test
    void contextLoads() {
    }

    /**
     * 使用上面的contextLoads方法时，SonarQube会有警告
     * 如果想取消告警，可以在内部写方法来验证控制器或者服务Bean的上下文
     * 参考stackoverflow: https://stackoverflow.com/questions/49887939/what-is-the-use-of-contextloads-method-in-spring-boot-junit-testcases
     */
    @Test
    public void contextLoadsForSonarQube() {
        Assertions.assertNotNull(testController);
    }
}
