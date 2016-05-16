package bean.training.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmployeeBeanAutowiredAndRequiredApp {

  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    EmployeeBeanAutowiredAndRequired employee = (EmployeeBeanAutowiredAndRequired) context.getBean("employeeBeanAutorwiredAndRequired");
    System.out.println(employee + "\n");
    
    EmployeeBeanAutowiredAndRequired employee2 = (EmployeeBeanAutowiredAndRequired) context.getBean("employeeBeanAutorwiredAndRequiredWithoutPhoneNumber");
    System.out.println(employee2);
  }

}
