import com.wenxq.demo.javaconfig.AppConfig;
import com.wenxq.demo.javaconfig.LogonService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTest {

    @Test
    public void test(){
        //手动注册配置类
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //需找类型为LogonService,名字为logonService1的bean,如果没有指定名字，默认寻找匹配的类型.
        LogonService logonService = ac.getBean("logonService1",LogonService.class);
        logonService.print();
    }
}