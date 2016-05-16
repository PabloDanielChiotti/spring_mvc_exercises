package bean.training.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ComputerApp {

  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    ComputerBean computer1 = (ComputerBean) context.getBean("computerBean");
    computer1.specs();
    
    System.out.println("\n[Calling 2nd Computer Instance]\n");
    
    ComputerBean computer2 = (ComputerBean) context.getBean("computerBean2");
    computer2.specs();
  }

}
