import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

/**
 * IoC Inversion of Control 控制反转
 * 使用对象时，由主动new产生对象转换为由外部提供对象，此过程中对象创建控制权由程序转移到外部，此思想称为控制反转
 * Spring技术对IOC思想进行了实现
 * Spring提供了一个容器，称为IOC容器，用来充当IOC思想中的"外部"
 * DI（Dependency Injection）依赖注入
 * 在容器中建立bean与bean之间的依赖关系的整个过程，称为依赖注入
 * 业务层要用数据层的类对象，以前是自己new 的
 * 现在自己不new了，靠别人[外部其实指的就是IOC容器] 来给注入进来
 * 这种思想就是依赖注入
 */
public class App2 {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取bean
        /*BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();*/

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
