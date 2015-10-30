package facades;

import entity.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFacade {
  
  private final  Map<String, User> users = new HashMap<>();

  public UserFacade() {
    //Test Users
    User user1 = new User("Peter","test");
    user1.AddRole("User");
    users.put(user1.getUserName(), user1);
    
    User user2 = new User("Anne", "test");
    user2.AddRole("Admin");
    users.put(user2.getUserName(), user2);
    
  }
  
  public User getUserByUserId(String id){
    return users.get(id);
  }
  /*
  Return the Roles if users could be authenticated, otherwise null
  */
  public List<String> authenticateUser(String userName, String password){
    User user = users.get(userName);
    return user != null && user.getPassword().equals(password) ? user.getRoles(): null;
  }
  
}
