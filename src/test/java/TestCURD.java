import com.mchange.v2.c3p0.ComboPooledDataSource;
import dao.AccountDao;
import dao.impl.AccountDaoImpl;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Account;
import service.AccountService;

import javax.sql.DataSource;
import java.util.List;

public class TestCURD {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao bean = applicationContext.getBean(AccountDao.class);
        QueryRunner bean1 = applicationContext.getBean(QueryRunner.class);
        System.out.println("ioc" + bean1);
//        System.out.println(bean1.getJdbcUrl());
//        AccountService bean1 = applicationContext.getBean(AccountService.class);
//        Object queryRunner = applicationContext.getBean("queryRunner");
//        System.out.println(bean);
//        System.out.println(bean1);
//        System.out.println(queryRunner);
//        bean.findAll();
        System.out.println("ioc:" + bean1);
    }
}
