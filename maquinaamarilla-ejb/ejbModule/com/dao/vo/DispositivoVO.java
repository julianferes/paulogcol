package com.dao.vo;

import org.apache.ibatis.type.Alias;


@Alias("DispositivoVO")
public class DispositivoVO {

	private Long id;
	private String idUnidad;
	private Long codMarca;
	private Long codLinea;
	private String imei;
	private Long tarjetaSim;
	private Long nroMovil;
	private String operadorMovil;
	private String operadorSatelital;
	private String observacion;
	private String serieDispositivo;
	private String estado;
	
	
	public DispositivoVO() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIdUnidad() {
		return idUnidad;
	}


	public void setIdUnidad(String idUnidad) {
		this.idUnidad = idUnidad;
	}


	public Long getCodMarca() {
		return codMarca;
	}


	public void setCodMarca(Long codMarca) {
		this.codMarca = codMarca;
	}


	public Long getCodLinea() {
		return codLinea;
	}


	public void setCodLinea(Long codLinea) {
		this.codLinea = codLinea;
	}


	public String getImei() {
		return imei;
	}


	public void setImei(String imei) {
		this.imei = imei;
	}


	public Long getTarjetaSim() {
		return tarjetaSim;
	}


	public void setTarjetaSim(Long tarjetaSim) {
		this.tarjetaSim = tarjetaSim;
	}


	public Long getNroMovil() {
		return nroMovil;
	}


	public void setNroMovil(Long nroMovil) {
		this.nroMovil = nroMovil;
	}


	public String getOperadorMovil() {
		return operadorMovil;
	}


	public void setOperadorMovil(String operadorMovil) {
		this.operadorMovil = operadorMovil;
	}


	public String getOperadorSatelital() {
		return operadorSatelital;
	}


	public void setOperadorSatelital(String operadorSatelital) {
		this.operadorSatelital = operadorSatelital;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public String getSerieDispositivo() {
		return serieDispositivo;
	}


	public void setSerieDispositivo(String serieDispositivo) {
		this.serieDispositivo = serieDispositivo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	
	
}