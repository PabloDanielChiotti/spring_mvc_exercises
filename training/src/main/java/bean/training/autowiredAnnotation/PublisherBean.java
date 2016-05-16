package bean.training.autowiredAnnotation;

import java.util.List;

public class PublisherBean {

  private String name;
  private String address;
  private String phoneNumber;
  private List genres;
  
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public List getGenres() {
    return genres;
  }
  
  public void setGenres(List genres) {
    this.genres = genres;
  }

  public String getPublisherInfo() {
    return "PublisherBean [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
        + ", genres=" + genres + "]";
  }
    
}
