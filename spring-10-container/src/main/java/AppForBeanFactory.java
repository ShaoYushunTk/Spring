import dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {

        //Spring最开始的加载配置文件 beanFactory 顶层接口 ApplicationContext 常用接口
        /**
         * BeanFactory和ApplicationContext的区别
         * BeanFactory延迟加载bean，加载配置文件时没有调用bean的构造方法
         * ApplicationContext立即加载bean，加载配置文件时调用bean的构造方法
         * 在配置文件配置bean时 设置lazy-init=true 就能延迟加载bean
         */
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resource);

        /*BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.save();*/

    }
}
