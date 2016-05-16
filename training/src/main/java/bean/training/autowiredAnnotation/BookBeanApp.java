package bean.training.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookBeanApp {

  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    BookBeanAutowiredAnnotationMethodSet book1 = (BookBeanAutowiredAnnotationMethodSet) context.getBean("bookBeanAutowiredAnnotationMethodSet");
    System.out.println(book1.getPublisherInfo() + "\n");
    
    BookBeanAutowiredAnnotationInReference book2 = (BookBeanAutowiredAnnotationInReference) context.getBean("bookBeanAutowiredAnnotationInReference");
    System.out.println(book2.getPublisherInfo() + "\n");
    
    BookBeanAutowiredAnnotationConstructor book3 = (BookBeanAutowiredAnnotationConstructor) context.getBean("bookBeanAutowiredAnnotationConstructor");
    System.out.println(book3.getPublisherInfo() + "\n");
  }

}
