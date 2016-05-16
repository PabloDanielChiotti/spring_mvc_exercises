package bean.training.setter;

public class UserBean {

  private String user;

  public UserBean() {
    super();
  }

  public String getUser() {
    return user;
  }
  
  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "UserBean [user=" + user + "]";
  }  
  
}
