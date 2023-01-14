import org.example.config.SpringConfig;
import org.example.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 需求: 对百度网盘分享链接输入密码时尾部多输入的空格做兼容处理
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = ctx.getBean(ResourcesService.class);
        boolean flag = resourcesService.openURL("https://pan.baidu.com/haha", "root ");
        System.out.println(flag);
    }
}
