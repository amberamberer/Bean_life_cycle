import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.JuiceMaker2;

public class Main {


    @Test
    void test1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        JuiceMaker2 juiceMaker2 = (JuiceMaker2) ctx.getBean("Juicemaker2");
        System.out.println(juiceMaker2.makejuice());
        ctx.close();
    }

}
