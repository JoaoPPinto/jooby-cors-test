package app;

import io.jooby.CorsHandler;
import io.jooby.Jooby;

public class App extends Jooby {

  {
    decorator(new CorsHandler());
    mvc(new Controller());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
