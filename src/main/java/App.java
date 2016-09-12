import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    
    get("/", (request, response) -> {
      return new ModelAndView(new HashMap(), "templates/hello.vtl");
    }, new VelocityTemplateEngine());

    get("/favs", (request, response) -> {
      return new ModelAndView(new HashMap(), "templates/favs.vtl");
    }, new VelocityTemplateEngine());

  }
}