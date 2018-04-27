// require 'soap/rpc/standaloneServer'
// 
// class BasicSoapServer < SOAP::RPC::StandaloneServer
//  def initialize(*args)
//   super
//   add_method(self, 'sayhelloto', 'username')
//  end
// end
// 
// class BasicSoapServer
//  def sayhelloto(username)
//   "Hello, #{username}"
//  end
// end
// 
// server = BasicSoapServer.new('RubySoapServer','urn:basicSoapServer','localhost',8888)
// trap('INT') { server.shutdown }
// server.start

package wsserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class Hello {
	@WebMethod public String sayHello(String username) {
		return "Hello " + username;
	}
}

// Requires SOAP client to test package wsserver
