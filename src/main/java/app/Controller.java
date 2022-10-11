package app;

import io.jooby.MediaType;
import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @POST
  @Consumes(MediaType.JSON)
  public String sayHi() {
    return "Hello World!";
  }
}
