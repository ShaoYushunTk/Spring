import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //ctx.close(); 直接在虚拟机关闭之前暴力关闭容器，调用destroy方法
        ctx.registerShutdownHook(); //注册关闭钩子，虚拟机关闭之前先让IoC容器优雅的关闭再退出虚拟机，并调用singleton的bean相应destroy回调方法
    }
}
