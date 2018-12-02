/**
 * 
 */
package com.ajay.service;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;

import com.ajay.service.Cars;

/**
 * @author ajaya
 *
 */
@Path("/cars")
public class CarsImpl implements Cars {

	private static final String STRING = "{" + 
			"	'cars': [" + 
			"		{" + 
			"			'hatchback': [{'Maruthi':'Zen'},{'volkswagen':'polo'}]," + 
			"			'sedan': [{'Maruthi':'ciaz'},{'volkswagen':'vento'}]," + 
			"			'suv': [{'Maruthi':'scross'},{'volkswagen':'tiguan'}]" + 
			"		}" + 
			"	]" + 
			"}";
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCars() {
		System.out.println(STRING);
		return STRING.toString();
	}
	
	public String getHatchBack() {
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(STRING);
		return null;
	}

}
