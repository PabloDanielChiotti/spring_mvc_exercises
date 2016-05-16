package bean.training.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ShoppingCartApp {

  public static void main(String[] args) {
    ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/Spring.xml");
    
    ShoppingCartBean shoppingCart = (ShoppingCartBean) context.getBean("shoppingCartBean");
    shoppingCart.displayCart();
    
    System.out.println("\n[Calling 2nd Shopping Cart Instance]\n");
    
    ShoppingCartBean shoppingCart2 = (ShoppingCartBean) context.getBean("shoppingCartBean2");
    shoppingCart2.displayCart();
  }

}
