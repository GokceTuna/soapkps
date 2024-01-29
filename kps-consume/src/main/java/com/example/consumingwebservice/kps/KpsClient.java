
package com.example.consumingwebservice.kps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.consumingwebservice.wsdl.kps.BilesikKutukBilgileriSonucu;
import com.example.consumingwebservice.wsdl.kps.BilesikKutukSorgulaKimlikNoSorguKriteri;
import com.example.consumingwebservice.wsdl.kps.ObjectFactory;

import jakarta.xml.bind.JAXBElement;

public class KpsClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(KpsClient.class);

	public BilesikKutukBilgileriSonucu getCountry(String country) {

		ObjectFactory factory = new ObjectFactory();
		BilesikKutukSorgulaKimlikNoSorguKriteri bilesikKutukSorgulaKimlikNoSorguKriteri = factory
				.createBilesikKutukSorgulaKimlikNoSorguKriteri();

		JAXBElement<Long> lOBKimlikNo = factory.createBilesikKutukSorgulaKimlikNoSorguKriteriKimlikNo(20723342058l);
		JAXBElement<Integer> lOBDogumGun = factory.createBilesikKutukSorgulaKimlikNoSorguKriteriDogumGun(2);
		JAXBElement<Integer> lOBDogumAy = factory.createBilesikKutukSorgulaKimlikNoSorguKriteriDogumAy(23);
		JAXBElement<Integer> lOBDogumYil = factory.createBilesikKutukSorgulaKimlikNoSorguKriteriDogumYil(1974);

		bilesikKutukSorgulaKimlikNoSorguKriteri.setKimlikNo(lOBKimlikNo);
		bilesikKutukSorgulaKimlikNoSorguKriteri.setDogumGun(lOBDogumGun);
		bilesikKutukSorgulaKimlikNoSorguKriteri.setDogumAy(lOBDogumAy);
		bilesikKutukSorgulaKimlikNoSorguKriteri.setDogumYil(lOBDogumYil);

		BilesikKutukBilgileriSonucu bilesikKutukBilgileriSonucu = (BilesikKutukBilgileriSonucu) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws/countries", bilesikKutukSorgulaKimlikNoSorguKriteri);

//		GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
//				.marshalSendAndReceive("http://localhost:8080/ws/countries", request,
//						new SoapActionCallback(
//								"http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));

		return bilesikKutukBilgileriSonucu;
	}

}
