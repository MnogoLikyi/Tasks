package am.samS;

import org.springframework.aop.config.AspectEntry;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class ExamplesAOP {
    public static void main(String[] args) throws Exception {
        nnn n = new nnn();
        n.nnnMethod();

        NothingClass cn = new NothingClass();
        cn.nothing();
    }
}
