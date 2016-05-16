package bean.training.innerBeans;

public class AirplaneBean {

  private String manufacturer;
  private String wingSpan;
  private String fuelCapacity;
  
  private EngineBean engine;

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getWingSpan() {
    return wingSpan;
  }

  public void setWingSpan(String wingSpan) {
    this.wingSpan = wingSpan;
  }

  public String getFuelCapacity() {
    return fuelCapacity;
  }

  public void setFuelCapacity(String fuelCapacity) {
    this.fuelCapacity = fuelCapacity;
  }

  public EngineBean getEngine() {
    return engine;
  }

  public void setEngine(EngineBean engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "AirplaneBean [manufacturer=" + manufacturer + ", wingSpan=" + wingSpan
        + ", fuelCapacity=" + fuelCapacity + ", engine=" + engine + "]";
  }  
  
}
