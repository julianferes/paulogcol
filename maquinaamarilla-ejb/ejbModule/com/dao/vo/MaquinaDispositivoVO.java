package com.dao.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("MaquinaDispositivoVO")
public class MaquinaDispositivoVO {

	private Long id;
	private Long consecutivoUbicacion;
	private MaquinaVO maquinaIdRunt;
	private DispositivoVO unidRastIdUnidad;
	private Date fechaInstalacion;
	private String estado;
	private Long documentoInstalacion;
	private String numeroValido;

	public MaquinaDispositivoVO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConsecutivoUbicacion() {
		return consecutivoUbicacion;
	}

	public void setConsecutivoUbicacion(Long consecutivoUbicacion) {
		this.consecutivoUbicacion = consecutivoUbicacion;
	}

	public MaquinaVO getMaquinaIdRunt() {
		return maquinaIdRunt;
	}

	public void setMaquinaIdRunt(MaquinaVO maquinaIdRunt) {
		this.maquinaIdRunt = maquinaIdRunt;
	}

	public DispositivoVO getUnidRastIdUnidad() {
		return unidRastIdUnidad;
	}

	public void setUnidRastIdUnidad(DispositivoVO unidRastIdUnidad) {
		this.unidRastIdUnidad = unidRastIdUnidad;
	}

	public Date getFechaInstalacion() {
		return fechaInstalacion;
	}

	public void setFechaInstalacion(Date fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getDocumentoInstalacion() {
		return documentoInstalacion;
	}

	public void setDocumentoInstalacion(Long documentoInstalacion) {
		this.documentoInstalacion = documentoInstalacion;
	}

	public String getNumeroValido() {
		return numeroValido;
	}

	public void setNumeroValido(String numeroValido) {
		this.numeroValido = numeroValido;
	}

}