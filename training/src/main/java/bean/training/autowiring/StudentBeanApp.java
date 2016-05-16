package bean.training.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentBeanApp {

  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    StudentBean student = (StudentBean) context.getBean("studentBean");
    System.out.println(student);
  }

}
