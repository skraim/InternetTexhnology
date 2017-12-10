
package ua.nure.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyService", targetNamespace = "http://service.nure.ua/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIntentoryList", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetIntentoryList")
    @ResponseWrapper(localName = "getIntentoryListResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetIntentoryListResponse")
    @Action(input = "http://service.nure.ua/MyService/getIntentoryListRequest", output = "http://service.nure.ua/MyService/getIntentoryListResponse")
    public String getIntentoryList();

    /**
     * 
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "parseXML", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.ParseXML")
    @ResponseWrapper(localName = "parseXMLResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.ParseXMLResponse")
    @Action(input = "http://service.nure.ua/MyService/parseXMLRequest", output = "http://service.nure.ua/MyService/parseXMLResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.nure.ua/MyService/parseXML/Fault/Exception")
    })
    public void parseXML()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventoryById", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetInventoryById")
    @ResponseWrapper(localName = "getInventoryByIdResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetInventoryByIdResponse")
    @Action(input = "http://service.nure.ua/MyService/getInventoryByIdRequest", output = "http://service.nure.ua/MyService/getInventoryByIdResponse")
    public String getInventoryById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "doubleEcho", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.DoubleEcho")
    @ResponseWrapper(localName = "doubleEchoResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.DoubleEchoResponse")
    @Action(input = "http://service.nure.ua/MyService/doubleEchoRequest", output = "http://service.nure.ua/MyService/doubleEchoResponse")
    public String doubleEcho(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPriceInHourById", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetPriceInHourById")
    @ResponseWrapper(localName = "getPriceInHourByIdResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetPriceInHourByIdResponse")
    @Action(input = "http://service.nure.ua/MyService/getPriceInHourByIdRequest", output = "http://service.nure.ua/MyService/getPriceInHourByIdResponse")
    public String getPriceInHourById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getYearInADayById", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetYearInADayById")
    @ResponseWrapper(localName = "getYearInADayByIdResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetYearInADayByIdResponse")
    @Action(input = "http://service.nure.ua/MyService/getYearInADayByIdRequest", output = "http://service.nure.ua/MyService/getYearInADayByIdResponse")
    public String getYearInADayById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPriceInADayById", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetPriceInADayById")
    @ResponseWrapper(localName = "getPriceInADayByIdResponse", targetNamespace = "http://service.nure.ua/", className = "ua.nure.service.GetPriceInADayByIdResponse")
    @Action(input = "http://service.nure.ua/MyService/getPriceInADayByIdRequest", output = "http://service.nure.ua/MyService/getPriceInADayByIdResponse")
    public String getPriceInADayById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}