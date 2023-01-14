import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         * Spring 创建bean 调用无参构造
         * 无参构造方法如果不存在，抛出异常BeanCreationException
         */
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        bookDao.save();
    }
}
