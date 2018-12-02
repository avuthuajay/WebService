/**
 * 
 */
package com.ajay.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author ajaya
 *
 */
@Path("/book")
public class Book {

	private static final String STRING = "{\r\n" + 
			"	'cars': [\r\n" + 
			"		{\r\n" + 
			"			'hatchback': [{'Maruthi':'Zen'},{'volkswagen':'polo'}],\r\n" + 
			"			'sedan': [{'Maruthi':'ciaz'},{'volkswagen':'vento'}],\r\n" + 
			"			'suv': [{'Maruthi':'scross'},{'volkswagen':'tiguan'}]\r\n" + 
			"		}\r\n" + 
			"	]\r\n" + 
			"}\r\n";

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCars() {
		System.out.println(STRING);
		return STRING.toString();
	}

}
