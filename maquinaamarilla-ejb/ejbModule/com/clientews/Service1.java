
package com.clientews;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Service1", targetNamespace = "http://policia.gov.co/webservice", wsdlLocation = "https://logmqa.policia.gov.co/?wsdl")
public class Service1
    extends Service
{

    private final static URL SERVICE1_WSDL_LOCATION;
    private final static WebServiceException SERVICE1_EXCEPTION;
    private final static QName SERVICE1_QNAME = new QName("http://policia.gov.co/webservice", "Service1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://logmqa.policia.gov.co/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE1_WSDL_LOCATION = url;
        SERVICE1_EXCEPTION = e;
    }

    public Service1() {
        super(__getWsdlLocation(), SERVICE1_QNAME);
    }

    public Service1(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE1_QNAME, features);
    }

    public Service1(URL wsdlLocation) {
        super(wsdlLocation, SERVICE1_QNAME);
    }

    public Service1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE1_QNAME, features);
    }

    public Service1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Service1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Service1Soap
     */
    @WebEndpoint(name = "Service1Soap")
    public Service1Soap getService1Soap() {
        return super.getPort(new QName("http://policia.gov.co/webservice", "Service1Soap"), Service1Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Service1Soap
     */
    @WebEndpoint(name = "Service1Soap")
    public Service1Soap getService1Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://policia.gov.co/webservice", "Service1Soap"), Service1Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE1_EXCEPTION!= null) {
            throw SERVICE1_EXCEPTION;
        }
        return SERVICE1_WSDL_LOCATION;
    }

}
