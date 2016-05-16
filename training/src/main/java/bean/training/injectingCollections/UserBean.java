package bean.training.injectingCollections;

public class UserBean {

  private String name;
  private BillingsDetailsBean userBilling;
  
  
  public UserBean() {
    super();
    this.userBilling = new BillingsDetailsBean();
  }


  public UserBean(BillingsDetailsBean userBilling) {
    super();
    this.userBilling = userBilling;
  }


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BillingsDetailsBean getUserBilling() {
    return userBilling;
  }


  public void setUserBilling(BillingsDetailsBean userBilling) {
    this.userBilling = userBilling;
  }


  @Override
  public String toString() {
    return "UserBean [name=" + name + ", userBilling=" + userBilling + "]";
  }
  
}
