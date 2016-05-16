package bean.training.constructor;

public class ComputerBean {

  //properties
  private String manufacturer;
  private String name;
  
  //dependencies
  private HarddriveBean harddrive;
  private GraphicsCardBean graphicsCard;
  private CPUBean cpu;
  
  public ComputerBean(HarddriveBean harddrive) {
    super();
    this.harddrive = harddrive;
  }

  public ComputerBean(String manufacturer, String name, HarddriveBean harddrive,
      GraphicsCardBean graphicsCard, CPUBean cpu) {
    super();
    this.manufacturer = manufacturer;
    this.name = name;
    this.harddrive = harddrive;
    this.graphicsCard = graphicsCard;
    this.cpu = cpu;
  }
  
  public ComputerBean(HarddriveBean harddrive, GraphicsCardBean graphicsCard, CPUBean cpu) {
    super();
    this.harddrive = harddrive;
    this.graphicsCard = graphicsCard;
    this.cpu = cpu;
  }
  
  public void specs() {
    System.out.println("Computer Specs.");
    
    harddrive.specs();
    if(graphicsCard != null) {
      graphicsCard.specs();
    }
    if(cpu != null) {
      cpu.specs();
    }
  }
  
}
