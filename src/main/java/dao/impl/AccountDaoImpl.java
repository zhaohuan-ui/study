package dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import dao.AccountDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import pojo.Account;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {
//    private static Connection con = JDBCUtilsConfig.getConnection();
    @Autowired
    QueryRunner queryRunner;
    @Autowired
    ComboPooledDataSource c3p0;
//    public AccountDaoImpl(){
//        try{
//            c3p0 = new ComboPooledDataSource();
//            c3p0.setDriverClass("com.jdbc.mysql.Driver");
//            c3p0.setJdbcUrl("jdbc:mysql://localhost:3306/study");
//            c3p0.setUser("root");
//            c3p0.setPassword("root");
//            queryRunner = new QueryRunner(c3p0);
//        }catch (Exception e){
//            System.out.println("构造:"+ e);
//        }finally {
//
//        }
//    }
    @Override
    public List<Account> findAll() {
//        System.out.println(c3p0.getJdbcUrl());
        String sql = "Select * from account";
        queryRunner = new QueryRunner(c3p0);
        System.out.println("method:" + queryRunner);
        List<Account> query = null;
        try{
            query = queryRunner.query(sql, new BeanListHandler<Account>(Account.class));
            for(Account account : query){
                System.out.println(account.toString());
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return query;
    }

    public void setQueryRunner(QueryRunner queryRunner){this.queryRunner=queryRunner;}
    public void setC3p0(ComboPooledDataSource c3p0){this.c3p0=c3p0;}
}
