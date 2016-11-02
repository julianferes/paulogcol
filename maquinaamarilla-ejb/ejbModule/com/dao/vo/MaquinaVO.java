package com.dao.vo;

import org.apache.ibatis.type.Alias;

//3108149916
//3013107299


@Alias("MaquinaVO")
public class MaquinaVO {
	
	private Long id;
	private String idRunt;
	private String serie;
	private Marca codMarca;
	private Linea codLinea;
	private String modelo;
	private TipoMaquina tipoMaquina;
	private String idUnidadVigente;
	private String motor;
	private String chasis;
	private String tipoUnidadMaquina;
	private String estado;
	public MaquinaVO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdRunt() {
		return idRunt;
	}
	public void setIdRunt(String idRunt) {
		this.idRunt = idRunt;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Marca getCodMarca() {
		return codMarca;
	}
	public void setCodMarca(Marca codMarca) {
		this.codMarca = codMarca;
	}
	public Linea getCodLinea() {
		return codLinea;
	}
	public void setCodLinea(Linea codLinea) {
		this.codLinea = codLinea;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public TipoMaquina getTipoMaquina() {
		return tipoMaquina;
	}
	public void setTipoMaquina(TipoMaquina tipoMaquina) {
		this.tipoMaquina = tipoMaquina;
	}
	public String getIdUnidadVigente() {
		return idUnidadVigente;
	}
	public void setIdUnidadVigente(String idUnidadVigente) {
		this.idUnidadVigente = idUnidadVigente;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public String getTipoUnidadMaquina() {
		return tipoUnidadMaquina;
	}
	public void setTipoUnidadMaquina(String tipoUnidadMaquina) {
		this.tipoUnidadMaquina = tipoUnidadMaquina;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}