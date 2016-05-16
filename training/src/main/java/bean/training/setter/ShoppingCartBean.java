package bean.training.setter;

public class ShoppingCartBean {

  // properties
  private String date;
  
  // dependencies
  private UserBean user;
  private ProductBean product;
   
  public ShoppingCartBean() {
    super();
  }

  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }
  public UserBean getUser() {
    return user;
  }
  public void setUser(UserBean user) {
    this.user = user;
  }
  public ProductBean getProduct() {
    return product;
  }
  public void setProduct(ProductBean product) {
    this.product = product;
  }
  
  public void displayCart() {
    if(product!=null) {
      System.out.println("Cart date: "+date+", has: "+product);
    }
  }
  
}
