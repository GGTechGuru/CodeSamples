package wsserver;

import javax.xml.ws.Endpoint;

public class StartService {

	public static void main(String[] args) {
		
		String url = "http://localhost:1212/hello";

		Endpoint.publish(url, new Hello());

		System.out.println("Starting SOAP service @ " + url);

	}
}

// Requires SOAP client to test package wsserver
