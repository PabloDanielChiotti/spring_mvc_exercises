package bean.training.qualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OnlineCustomer {

  private String id;
  private String userName;
  private String password;
  
  @Autowired
  @Qualifier("travelTicketAir")
  private TravelTicket travelTicket;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public TravelTicket getTravelTicket() {
    return travelTicket;
  }

  public void setTravelTicket(TravelTicket travelTicket) {
    this.travelTicket = travelTicket;
  }

  @Override
  public String toString() {
    return "OnlineCustomer [id=" + id + ", userName=" + userName + ", password=" + password
        + ", travelTicket=" + travelTicket + "]";
  }
  
}
