package bean.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldBeanDriver {

  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    HelloWorld obj = (HelloWorld) context.getBean("helloWorldBean");
    obj.sayHelloWorld();
  }

}
