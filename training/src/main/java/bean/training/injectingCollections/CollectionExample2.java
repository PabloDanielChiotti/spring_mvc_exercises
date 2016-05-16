package bean.training.injectingCollections;

import java.util.List;

import bean.training.injectingCollections.UserBean;

public class CollectionExample2 {

  private List<UserBean> usersList;

  public List<UserBean> getUsersList() {
    System.out.println("List Elements: " + usersList);
    return usersList;
  }

  public void setUsersList(List<UserBean> usersList) {
    this.usersList = usersList;
  }
    
}
