
package com.clientews;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service1Soap", targetNamespace = "http://policia.gov.co/webservice")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service1Soap {


    /**
     * 
     * @param pusuarioprov
     * @param pnumerovalido
     * @param pclaveprov
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ValIngreso", action = "http://policia.gov.co/webservice/ValIngreso")
    @WebResult(name = "ValIngresoResult", targetNamespace = "http://policia.gov.co/webservice")
    @RequestWrapper(localName = "ValIngreso", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.ValIngreso")
    @ResponseWrapper(localName = "ValIngresoResponse", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.ValIngresoResponse")
    public String valIngreso(
        @WebParam(name = "PUSUARIOPROV", targetNamespace = "http://policia.gov.co/webservice")
        String pusuarioprov,
        @WebParam(name = "PCLAVEPROV", targetNamespace = "http://policia.gov.co/webservice")
        String pclaveprov,
        @WebParam(name = "PNUMEROVALIDO", targetNamespace = "http://policia.gov.co/webservice")
        String pnumerovalido);

    /**
     * 
     * @param pdisimei
     * @param pusuario
     * @param ptidprov
     * @param pmqachasis
     * @param pideprov
     * @param pmqamotor
     * @param ptoken
     * @param pmqaserie
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "MqaConsDispAVL", action = "http://policia.gov.co/webservice/MqaConsDispAVL")
    @WebResult(name = "MqaConsDispAVLResult", targetNamespace = "http://policia.gov.co/webservice")
    @RequestWrapper(localName = "MqaConsDispAVL", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.MqaConsDispAVL")
    @ResponseWrapper(localName = "MqaConsDispAVLResponse", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.MqaConsDispAVLResponse")
    public String mqaConsDispAVL(
        @WebParam(name = "PUSUARIO", targetNamespace = "http://policia.gov.co/webservice")
        String pusuario,
        @WebParam(name = "PTOKEN", targetNamespace = "http://policia.gov.co/webservice")
        String ptoken,
        @WebParam(name = "PMQASERIE", targetNamespace = "http://policia.gov.co/webservice")
        String pmqaserie,
        @WebParam(name = "PMQAMOTOR", targetNamespace = "http://policia.gov.co/webservice")
        String pmqamotor,
        @WebParam(name = "PMQACHASIS", targetNamespace = "http://policia.gov.co/webservice")
        String pmqachasis,
        @WebParam(name = "PDISIMEI", targetNamespace = "http://policia.gov.co/webservice")
        String pdisimei,
        @WebParam(name = "PTIDPROV", targetNamespace = "http://policia.gov.co/webservice")
        String ptidprov,
        @WebParam(name = "PIDEPROV", targetNamespace = "http://policia.gov.co/webservice")
        String pideprov);

    /**
     * 
     * @param pvelocidad
     * @param pidtrama
     * @param platitud
     * @param ppuerto
     * @param pusuario
     * @param pdireccion
     * @param pevento
     * @param pfechagps
     * @param plongitud
     * @param podometro
     * @param pip
     * @param pidunidad
     * @param pstatus
     * @param ptoken
     * @param pignicion
     * @param ptiptransm
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertarUbicacion", action = "http://policia.gov.co/webservice/InsertarUbicacion")
    @WebResult(name = "InsertarUbicacionResult", targetNamespace = "http://policia.gov.co/webservice")
    @RequestWrapper(localName = "InsertarUbicacion", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.InsertarUbicacion")
    @ResponseWrapper(localName = "InsertarUbicacionResponse", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.InsertarUbicacionResponse")
    public String insertarUbicacion(
        @WebParam(name = "PUSUARIO", targetNamespace = "http://policia.gov.co/webservice")
        String pusuario,
        @WebParam(name = "PTOKEN", targetNamespace = "http://policia.gov.co/webservice")
        String ptoken,
        @WebParam(name = "PIDTRAMA", targetNamespace = "http://policia.gov.co/webservice")
        String pidtrama,
        @WebParam(name = "PIDUNIDAD", targetNamespace = "http://policia.gov.co/webservice")
        String pidunidad,
        @WebParam(name = "PTIPTRANSM", targetNamespace = "http://policia.gov.co/webservice")
        String ptiptransm,
        @WebParam(name = "PLONGITUD", targetNamespace = "http://policia.gov.co/webservice")
        String plongitud,
        @WebParam(name = "PLATITUD", targetNamespace = "http://policia.gov.co/webservice")
        String platitud,
        @WebParam(name = "PVELOCIDAD", targetNamespace = "http://policia.gov.co/webservice")
        String pvelocidad,
        @WebParam(name = "PDIRECCION", targetNamespace = "http://policia.gov.co/webservice")
        String pdireccion,
        @WebParam(name = "PFECHAGPS", targetNamespace = "http://policia.gov.co/webservice")
        String pfechagps,
        @WebParam(name = "PEVENTO", targetNamespace = "http://policia.gov.co/webservice")
        String pevento,
        @WebParam(name = "PIGNICION", targetNamespace = "http://policia.gov.co/webservice")
        String pignicion,
        @WebParam(name = "PIP", targetNamespace = "http://policia.gov.co/webservice")
        String pip,
        @WebParam(name = "PPUERTO", targetNamespace = "http://policia.gov.co/webservice")
        String ppuerto,
        @WebParam(name = "PSTATUS", targetNamespace = "http://policia.gov.co/webservice")
        String pstatus,
        @WebParam(name = "PODOMETRO", targetNamespace = "http://policia.gov.co/webservice")
        String podometro);

    /**
     * 
     * @param pimei
     * @param pusuario
     * @param pobservacion
     * @param pserieDISPOSITIVO
     * @param poperadorsatelital
     * @param pcodilinea
     * @param pnroMOVIL
     * @param pidunidad
     * @param ptarjetaSIM
     * @param pcodimarca
     * @param ptoken
     * @param poperadormovil
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertarUnidadesdeRastreo", action = "http://policia.gov.co/webservice/InsertarUnidadesdeRastreo")
    @WebResult(name = "InsertarUnidadesdeRastreoResult", targetNamespace = "http://policia.gov.co/webservice")
    @RequestWrapper(localName = "InsertarUnidadesdeRastreo", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.InsertarUnidadesdeRastreo")
    @ResponseWrapper(localName = "InsertarUnidadesdeRastreoResponse", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.InsertarUnidadesdeRastreoResponse")
    public String insertarUnidadesdeRastreo(
        @WebParam(name = "PUSUARIO", targetNamespace = "http://policia.gov.co/webservice")
        String pusuario,
        @WebParam(name = "PTOKEN", targetNamespace = "http://policia.gov.co/webservice")
        String ptoken,
        @WebParam(name = "PIDUNIDAD", targetNamespace = "http://policia.gov.co/webservice")
        String pidunidad,
        @WebParam(name = "PCODIMARCA", targetNamespace = "http://policia.gov.co/webservice")
        String pcodimarca,
        @WebParam(name = "PCODILINEA", targetNamespace = "http://policia.gov.co/webservice")
        String pcodilinea,
        @WebParam(name = "PIMEI", targetNamespace = "http://policia.gov.co/webservice")
        String pimei,
        @WebParam(name = "PTARJETA_SIM", targetNamespace = "http://policia.gov.co/webservice")
        String ptarjetaSIM,
        @WebParam(name = "PNRO_MOVIL", targetNamespace = "http://policia.gov.co/webservice")
        String pnroMOVIL,
        @WebParam(name = "POPERADORMOVIL", targetNamespace = "http://policia.gov.co/webservice")
        String poperadormovil,
        @WebParam(name = "POPERADORSATELITAL", targetNamespace = "http://policia.gov.co/webservice")
        String poperadorsatelital,
        @WebParam(name = "POBSERVACION", targetNamespace = "http://policia.gov.co/webservice")
        String pobservacion,
        @WebParam(name = "PSERIE_DISPOSITIVO", targetNamespace = "http://policia.gov.co/webservice")
        String pserieDISPOSITIVO);

    /**
     * 
     * @param pusuario
     * @param pcodilinea
     * @param pidunidadvigente
     * @param pchasis
     * @param pmotor
     * @param ptipomaquina
     * @param ptipounidadmaquina
     * @param pcodimarca
     * @param pserie
     * @param ptoken
     * @param pidrunt
     * @param pmodelo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertarMaquinas", action = "http://policia.gov.co/webservice/InsertarMaquinas")
    @WebResult(name = "InsertarMaquinasResult", targetNamespace = "http://policia.gov.co/webservice")
    @RequestWrapper(localName = "InsertarMaquinas", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.InsertarMaquinas")
    @ResponseWrapper(localName = "InsertarMaquinasResponse", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.InsertarMaquinasResponse")
    public String insertarMaquinas(
        @WebParam(name = "PUSUARIO", targetNamespace = "http://policia.gov.co/webservice")
        String pusuario,
        @WebParam(name = "PTOKEN", targetNamespace = "http://policia.gov.co/webservice")
        String ptoken,
        @WebParam(name = "PIDRUNT", targetNamespace = "http://policia.gov.co/webservice")
        String pidrunt,
        @WebParam(name = "PSERIE", targetNamespace = "http://policia.gov.co/webservice")
        String pserie,
        @WebParam(name = "PCODIMARCA", targetNamespace = "http://policia.gov.co/webservice")
        String pcodimarca,
        @WebParam(name = "PCODILINEA", targetNamespace = "http://policia.gov.co/webservice")
        String pcodilinea,
        @WebParam(name = "PMODELO", targetNamespace = "http://policia.gov.co/webservice")
        String pmodelo,
        @WebParam(name = "PTIPOMAQUINA", targetNamespace = "http://policia.gov.co/webservice")
        String ptipomaquina,
        @WebParam(name = "PIDUNIDADVIGENTE", targetNamespace = "http://policia.gov.co/webservice")
        String pidunidadvigente,
        @WebParam(name = "PMOTOR", targetNamespace = "http://policia.gov.co/webservice")
        String pmotor,
        @WebParam(name = "PCHASIS", targetNamespace = "http://policia.gov.co/webservice")
        String pchasis,
        @WebParam(name = "PTIPOUNIDADMAQUINA", targetNamespace = "http://policia.gov.co/webservice")
        String ptipounidadmaquina);

    /**
     * 
     * @param pusuario
     * @param punidrastidunidad
     * @param pmaquinaidrunt
     * @param ptoken
     * @param pdocumentoinstalaciona
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RelacionMaquinaUnidad", action = "http://policia.gov.co/webservice/RelacionMaquinaUnidad")
    @WebResult(name = "RelacionMaquinaUnidadResult", targetNamespace = "http://policia.gov.co/webservice")
    @RequestWrapper(localName = "RelacionMaquinaUnidad", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.RelacionMaquinaUnidad")
    @ResponseWrapper(localName = "RelacionMaquinaUnidadResponse", targetNamespace = "http://policia.gov.co/webservice", className = "com.clientews.RelacionMaquinaUnidadResponse")
    public String relacionMaquinaUnidad(
        @WebParam(name = "PUSUARIO", targetNamespace = "http://policia.gov.co/webservice")
        String pusuario,
        @WebParam(name = "PTOKEN", targetNamespace = "http://policia.gov.co/webservice")
        String ptoken,
        @WebParam(name = "PMAQUINAIDRUNT", targetNamespace = "http://policia.gov.co/webservice")
        String pmaquinaidrunt,
        @WebParam(name = "PUNIDRASTIDUNIDAD", targetNamespace = "http://policia.gov.co/webservice")
        String punidrastidunidad,
        @WebParam(name = "PDOCUMENTOINSTALACIONA", targetNamespace = "http://policia.gov.co/webservice")
        String pdocumentoinstalaciona);

}