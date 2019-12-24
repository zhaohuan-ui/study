package cn.logs;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FactoryLog {

    @Pointcut("execution(* cn.service.*.*(..))")
    public void test(){

    }

    @Before("test()")
    public void before(JoinPoint joinPoint){
        System.out.println("类before:" + joinPoint.getTarget());
        System.out.println("方法:" + joinPoint.getSignature());
        System.out.println("before");
    }

    @AfterReturning("test()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    @AfterThrowing("test()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @After("test()")
    public void after(JoinPoint joinPoint){
        System.out.println("类:" + joinPoint.getTarget());
        System.out.println("方法:" + joinPoint.getSignature());
        System.out.println("after");
    }

    @Around("test()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println(1);
            proceedingJoinPoint.proceed();
            System.out.println(2);
        }catch (Throwable throwable) {
            System.out.println(3);
            throwable.printStackTrace();
        }finally {
            System.out.println(4);
        }
    }

}
