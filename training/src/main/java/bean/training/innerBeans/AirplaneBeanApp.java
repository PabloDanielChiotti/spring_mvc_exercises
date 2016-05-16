package bean.training.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AirplaneBeanApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    AirplaneBean airplane = (AirplaneBean) context.getBean("airplaneBean");
    System.out.println(airplane);
    
    AirplaneBean airplane2 = (AirplaneBean) context.getBean("airplaneBean2");
    System.out.println(airplane2);
  }

}
