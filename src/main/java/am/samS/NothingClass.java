package am.samS;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NothingClass {

    @Pointcut("execution(* am.samS.nnn.nnnMethod())")
    public void nothing()  {
    }


    @Before("nothing()")
    public void beforeNothing() {
        System.out.println("Before nothing");
    }

    @Before("nothing()")
    public void beforeNothing2() {
        System.out.println("another before nothing");
    }

    @AfterReturning("nothing()")
    public void afterReturningNothing() {
        System.out.println("after success nothing");
    }

    @AfterThrowing("nothing()")
    public void afterThrowingNothing()
    {
        System.out.println("Exception was throw");
    }
}
