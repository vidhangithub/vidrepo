package com.vidhan.myrestfulclient;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class VidhanRestFulClient {

	
	public static void main(String[] args) {
	
		Client client = Client.create();
		WebResource webres = client.resource("http://localhost:8080/HelloWorldRestful/vidhan/vidhanrest");
		//ClientResponse cilres = webres.accept("aaplication/text").get(ClientResponse.class);
		ClientResponse cilrestxt = webres.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		ClientResponse cilresHTML = webres.accept(MediaType.TEXT_HTML).get(ClientResponse.class);
		ClientResponse cilresXML = webres.accept(MediaType.TEXT_XML).get(ClientResponse.class);
		System.out.println(cilrestxt);
		System.out.println(cilresHTML);
		System.out.println(cilresXML);
		String stringOutput = cilrestxt.getEntity(String.class);
		String xmltOutput = cilresXML.getEntity(String.class);
		String htmlOutput = cilresHTML.getEntity(String.class);
		System.out.println(stringOutput);
		System.out.println(xmltOutput);
		System.out.println(htmlOutput);
	}

}
