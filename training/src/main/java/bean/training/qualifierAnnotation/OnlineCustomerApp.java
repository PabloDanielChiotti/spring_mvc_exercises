package bean.training.qualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class OnlineCustomerApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    OnlineCustomer onlineCustomer = (OnlineCustomer) context.getBean("onlineCustomer");
    
    System.out.println("OnlineCustomer: " + onlineCustomer);
  }

}
