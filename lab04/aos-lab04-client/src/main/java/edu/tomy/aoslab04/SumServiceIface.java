package edu.tomy.aoslab04;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Thu Oct 11 10:49:12 CEST 2012
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://aoslab04.tomy.edu/", name = "SumServiceIface")
@XmlSeeAlso({ObjectFactory.class})
public interface SumServiceIface {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getSum", targetNamespace = "http://aoslab04.tomy.edu/", className = "edu.tomy.aoslab04.GetSum")
    @WebMethod
    @ResponseWrapper(localName = "getSumResponse", targetNamespace = "http://aoslab04.tomy.edu/", className = "edu.tomy.aoslab04.GetSumResponse")
    public int getSum(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}
