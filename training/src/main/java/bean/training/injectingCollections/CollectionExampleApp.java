package bean.training.injectingCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CollectionExampleApp {

  public static void main(String[] args) {
    ApplicationContext context =
        new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    CollectionExample collectionBean = (CollectionExample) context.getBean("collectionExample");

    collectionBean.getExampleList();
    collectionBean.getExampleSet();
    collectionBean.getExampleMap();
    collectionBean.getExampleProp();
  }

}
