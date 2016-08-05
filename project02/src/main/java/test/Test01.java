package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    
    //1) 스프링 빈 컨테이너 생성
    ApplicationContext ctx = new ClassPathXmlApplicationContext("test/app-ctx.xml");
    
    String[] beanNames = ctx.getBeanDefinitionNames();
    
    for (String beanName : beanNames) {
      System.out.println(beanName);
    }
  }

}
