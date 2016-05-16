package bean.training.injectingCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionExample {

  private List exampleList;
  private Set exampleSet;
  private Map exampleMap;
  private Properties exampleProp;
  
  public List getExampleList() {
    System.out.println("List Element: " + exampleList);
    return exampleList;
  }
  public void setExampleList(List exampleList) {
    this.exampleList = exampleList;
  }
  public Set getExampleSet() {
    System.out.println("Set Element: " + exampleSet);
    return exampleSet;
  }
  public void setExampleSet(Set exampleSet) {
    this.exampleSet = exampleSet;
  }
  public Map getExampleMap() {
    System.out.println("Map Element: " + exampleMap);
    return exampleMap;
  }
  public void setExampleMap(Map exampleMap) {
    this.exampleMap = exampleMap;
  }
  public Properties getExampleProp() {
    System.out.println("Property Element: " + exampleProp);
    return exampleProp;
  }
  public void setExampleProp(Properties exampleProp) {
    this.exampleProp = exampleProp;
  }  
  
}
