
package com.example.consumingwebservice.wsdl.kps;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BilesikKutukSorgulaKimlikNoServis", targetNamespace = "http://kps.nvi.gov.tr/2021/04/01", wsdlLocation = "file:/Users/gokcetuna/git/kps-consume/kps-consume/src/main/resources/BilesikKutukSorgulaKimlikNoServisV20210401.wsdl")
public class BilesikKutukSorgulaKimlikNoServis_Service
    extends Service
{

    private final static URL BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION;
    private final static WebServiceException BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION;
    private final static QName BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME = new QName("http://kps.nvi.gov.tr/2021/04/01", "BilesikKutukSorgulaKimlikNoServis");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/gokcetuna/git/kps-consume/kps-consume/src/main/resources/BilesikKutukSorgulaKimlikNoServisV20210401.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION = url;
        BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION = e;
    }

    public BilesikKutukSorgulaKimlikNoServis_Service() {
        super(__getWsdlLocation(), BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME);
    }

    public BilesikKutukSorgulaKimlikNoServis_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME, features);
    }

    public BilesikKutukSorgulaKimlikNoServis_Service(URL wsdlLocation) {
        super(wsdlLocation, BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME);
    }

    public BilesikKutukSorgulaKimlikNoServis_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BILESIKKUTUKSORGULAKIMLIKNOSERVIS_QNAME, features);
    }

    public BilesikKutukSorgulaKimlikNoServis_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BilesikKutukSorgulaKimlikNoServis_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BilesikKutukSorgulaKimlikNoServis
     */
    @WebEndpoint(name = "CustomBinding_BilesikKutukSorgulaKimlikNoServis")
    public BilesikKutukSorgulaKimlikNoServis getCustomBindingBilesikKutukSorgulaKimlikNoServis() {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2021/04/01", "CustomBinding_BilesikKutukSorgulaKimlikNoServis"), BilesikKutukSorgulaKimlikNoServis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BilesikKutukSorgulaKimlikNoServis
     */
    @WebEndpoint(name = "CustomBinding_BilesikKutukSorgulaKimlikNoServis")
    public BilesikKutukSorgulaKimlikNoServis getCustomBindingBilesikKutukSorgulaKimlikNoServis(WebServiceFeature... features) {
        return super.getPort(new QName("http://kps.nvi.gov.tr/2021/04/01", "CustomBinding_BilesikKutukSorgulaKimlikNoServis"), BilesikKutukSorgulaKimlikNoServis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION!= null) {
            throw BILESIKKUTUKSORGULAKIMLIKNOSERVIS_EXCEPTION;
        }
        return BILESIKKUTUKSORGULAKIMLIKNOSERVIS_WSDL_LOCATION;
    }

}
