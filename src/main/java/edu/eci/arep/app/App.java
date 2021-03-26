package edu.eci.arep.app;
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;


public class App {

	private static Calculator calculate = new Calculator(); 


	public static void main( String[] args ){

		port(getPort());
        get("/parcial", (req, res) ->("parcial"));

    }


	static int getPort() {
	       if (System.getenv("PORT") != null) {
	           return Integer.parseInt(System.getenv("PORT"));
	       }
	       return 4567;
	   }
}