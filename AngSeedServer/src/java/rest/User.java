package rest;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("footballclubs")
@RolesAllowed("User")
public class User {
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String getSomething(){
    return "[{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"},{\"name\":\"Manchester United\",\"url\" : \"http://www.manutd.com/\"}]"; 
  }
 
}