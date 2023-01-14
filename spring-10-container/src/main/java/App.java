import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.awt.print.Book;

public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.文件系统加载配置文件
        //ApplicationContext ctx2 = new FileSystemXmlApplicationContext("D:\\SSM study\\Spring\\spring-10-container\\src\\main\\resources\\applicationContext.xml");
        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //BookDao bookDao = ctx.getBean("bookDao",BookDao.class);

        /*BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();*/
    }
}
