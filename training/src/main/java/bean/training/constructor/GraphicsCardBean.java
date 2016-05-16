package bean.training.constructor;

public class GraphicsCardBean {

  private String manufacturer;
  private String name;
  private String coreSpeed;
  private String boostSpeed;
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCoreSpeed() {
    return coreSpeed;
  }
  public void setCoreSpeed(String coreSpeed) {
    this.coreSpeed = coreSpeed;
  }
  public String getBoostSpeed() {
    return boostSpeed;
  }
  public void setBoostSpeed(String boostSpeed) {
    this.boostSpeed = boostSpeed;
  }
  
  public void specs() {
    System.out.println("GraphicsCard Specs.");
  }
  
}
