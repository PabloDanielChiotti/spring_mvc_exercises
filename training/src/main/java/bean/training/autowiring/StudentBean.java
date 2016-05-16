package bean.training.autowiring;

public class StudentBean {

  private String name;
  
  private AddressBean addressBean;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressBean getAddressBean() {
    return addressBean;
  }

  public void setAddressBean(AddressBean addressBean) {
    this.addressBean = addressBean;
  }

  @Override
  public String toString() {
    return "StudentBean [name=" + name + ", addressBean=" + addressBean + "]";
  }
  
}
