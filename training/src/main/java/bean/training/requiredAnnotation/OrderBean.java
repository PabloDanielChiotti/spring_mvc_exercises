package bean.training.requiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

public class OrderBean {

  private Long id;
  private String description;
  private String name;
  
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getName() {
    return name;
  }
  
  @Required
  public void setName(String name) {
    this.name = name;
  }
    
}
