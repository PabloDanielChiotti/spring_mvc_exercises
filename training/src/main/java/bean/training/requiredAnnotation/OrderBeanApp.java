package bean.training.requiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class OrderBeanApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    
    OrderBean orderBean = (OrderBean) context.getBean("orderBean");
    String name = orderBean.getName();
    System.out.println("Order name: " + name);
  }

}
