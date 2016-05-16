package bean.training.constructor;

public class CPUBean {

  private String manufacturer;
  private String name;
  private String processorSpeed;
  private String busSpeed;
  private String processorType;
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
  public String getProcessorSpeed() {
    return processorSpeed;
  }
  public void setProcessorSpeed(String processorSpeed) {
    this.processorSpeed = processorSpeed;
  }
  public String getBusSpeed() {
    return busSpeed;
  }
  public void setBusSpeed(String busSpeed) {
    this.busSpeed = busSpeed;
  }
  public String getProcessorType() {
    return processorType;
  }
  public void setProcessorType(String processorType) {
    this.processorType = processorType;
  }
  
  public void specs() {
    System.out.println("CPU Specs.");
  }
  
}
