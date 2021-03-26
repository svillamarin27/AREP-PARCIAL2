package edu.eci.arep.app;
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;


public class App {
    
	private static Calculator calculate = new Calculator(); 
	
	
	public static void main( String[] args ){
		port(getPort());
		get("/sqrt", (req, res) -> inputDataPage(req, res,"sqrt"));//8
        get("/sin", (req, res) -> inputDataPage(req, res,"sin"));//2
        
    }

	//http://localhost:4567/sin?valor=4
	private static JSONObject inputDataPage(Request req, Response res,String operation) {
        double num = Double.parseDouble(req.queryParams("valor"));
        JSONObject obj = new JSONObject();
        obj.put("output",(operation.equals("sqrt"))? calculate.sqrtFunction(num) : calculate.sinFunction(num));        
        obj.put("input",num);
        obj.put("operation",operation); 
        return obj;
    }
	
	
	static int getPort() {
	       if (System.getenv("PORT") != null) {
	           return Integer.parseInt(System.getenv("PORT"));
	       }
	       return 4567;
	   }
	
	
}