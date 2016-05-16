package bean.training.innerBeans;

public class EngineBean {

  private String manufacturer;
  private String horsepower;
  
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
  public String getHorsepower() {
    return horsepower;
  }
  public void setHorsepower(String horsepower) {
    this.horsepower = horsepower;
  }
  
  @Override
  public String toString() {
    return "EngineBean [manufacturer= " + manufacturer + ", horsepower= " + horsepower + "]";
  }
  
  
  
}
