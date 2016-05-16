package bean.training.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBeanAutowiredAndRequired {

  private String name;
  private String lastName;
  private String phoneNumber;
    
  public String getName() {
    return name;
  }

  @Autowired
  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  @Autowired
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Autowired(required=false)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "EmployeeBean [name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
        + "]";
  }
  
}
