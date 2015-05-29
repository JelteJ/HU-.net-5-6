package testing;

import java.net.MalformedURLException;
import java.net.URL;

import javax.security.auth.x500.X500Principal;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.tempuri.AddProduct;
import org.tempuri.IProductService;
import org.tempuri.Login;
import org.tempuri.LoginService;
import org.tempuri.LogisticsService;
import org.tempuri.ProductService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL wsdlURL = null;
		try {
			wsdlURL = new URL(
					"http://localhost:8733/Design_Time_Addresses/WinkelService/ProductService/?wsdl ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		QName serviceName = new QName("http://tempuri.org/",
				"ProductService");
		Service service = Service.create(wsdlURL, serviceName);
		// Dit is de SEI
		IProductService wsInterface = service.getPort(IProductService.class);
		
		AddProduct product = new AddProduct();
		
		boolean b = wsInterface.addProduct("testje", 100, 69);
		
		
		System.out.println(b);
	}

}
