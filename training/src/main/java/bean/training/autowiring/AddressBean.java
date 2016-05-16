package bean.training.autowiring;

public class AddressBean {

  private String streetName;
  private String state;
  private String city;
  private String zip;
  
  
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
  
  
  @Override
  public String toString() {
    return "AddressBean [streetName=" + streetName + ", state=" + state + ", city=" + city
        + ", zip=" + zip + "]";
  }  
  
}
