import cn.dao.impl.AccountDaoImpl;
import cn.service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCURD {
    @Autowired
    AccountDaoImpl accountDaoImpl;
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService bean = applicationContext.getBean(AccountService.class);
        bean.findAll();
//        AccountDaoImpl bean = applicationContext.getBean(AccountDaoImpl.class);
//        bean.update(1);
//        System.out.println(accountDao);
//        accountDaoImpl.update(1);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AccountDao bean = applicationContext.getBean(AccountDao.class);
//        QueryRunner bean1 = applicationContext.getBean(QueryRunner.class);
//        System.out.println("ioc" + bean1);
//        System.out.println(bean1.getJdbcUrl());
//        AccountService bean1 = applicationContext.getBean(AccountService.class);
//        Object queryRunner = applicationContext.getBean("queryRunner");
//        System.out.println(bean);
//        System.out.println(bean1);
//        System.out.println(queryRunner);
//        bean.findAll();
//        System.out.println("ioc:" + bean1);
    }
}
