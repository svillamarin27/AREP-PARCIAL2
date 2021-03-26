package edu.eci.arep.app;

public class Lambda {
	
	public String seno(String param) {
		 
		String data = "{ \"operation \":"+"sin, \"input \":"+param+",\"output \":"+Math.sin(Double.parseDouble(param))+"}";
		return  data;
	}
	public String raiz(String param) {
		 
		String data = "{ \"operation \":"+"sqrt, \"input \":"+param+",\"output \":"+Math.sqrt(Double.parseDouble(param))+"}";
		return  data;
	}

}
