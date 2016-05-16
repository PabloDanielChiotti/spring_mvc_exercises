package bean.training.injectingCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionExample2App {

  public static void main(String[] args) {
    ApplicationContext context =
        new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    CollectionExample2 collectionBean2 = (CollectionExample2) context.getBean("collectionExample2");
    collectionBean2.getUsersList();
  }

}
