package com.facade;

import java.text.SimpleDateFormat;
import java.util.List;

import com.clientews.Service1;
import com.clientews.Service1Soap;
import com.dao.object.ConsecutivoUbicacionDAO;
import com.dao.object.DispositivoDAO;
import com.dao.object.ETLBykomDAO;
import com.dao.object.MaquinaDAO;
import com.dao.object.MaquinaDispositivoDAO;
import com.dao.vo.DispositivoVO;
import com.dao.vo.EtlBykomVO;
import com.dao.vo.MaquinaDispositivoVO;
import com.dao.vo.MaquinaVO;
import com.util.DatosConstantes;

public class FacadeServiciosPolicia {

	private static FacadeServiciosPolicia singleton = null;

	private FacadeServiciosPolicia() {
	}

	public static FacadeServiciosPolicia getInstance() {
		if (singleton == null) {
			singleton = new FacadeServiciosPolicia();
		}
		return singleton;
	}

	public Object autenticarPolicia() {
		String usuariows = DatosConstantes.USUARIO_WS_POLICIA;
		String clavews = DatosConstantes.CLAVE_WS_POLICIA;

		MaquinaDispositivoDAO maquinaDispositivoDAO = new MaquinaDispositivoDAO();
		List<MaquinaDispositivoVO> listaMaquinaDispositivosDAO = maquinaDispositivoDAO
				.consultarRegistros();

		if (listaMaquinaDispositivosDAO != null) {
			for (MaquinaDispositivoVO maquinaDispositivoVO : listaMaquinaDispositivosDAO) {

				String numeroValido = maquinaDispositivoVO.getNumeroValido() != null ? maquinaDispositivoVO
						.getNumeroValido().toString() : null;
				String id = maquinaDispositivoVO.getId() != null ? maquinaDispositivoVO
						.getId().toString() : null;
				String maquinaIdRunt = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
						.getMaquinaIdRunt().getId().toString()
						: null;
				String unidRastIdUnidad = maquinaDispositivoVO
						.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
						.getUnidRastIdUnidad().getIdUnidad() : null;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

				String fechaInstalacion = sdf.format(maquinaDispositivoVO
						.getFechaInstalacion());
				String documentoInstalacion = maquinaDispositivoVO
						.getDocumentoInstalacion() != null ? maquinaDispositivoVO
						.getDocumentoInstalacion().toString() : null;

				Service1Soap servicio = new Service1().getService1Soap();
				String token = servicio.valIngreso(usuariows, clavews,
						numeroValido);
				token = token.split(";")[0];
				if (maquinaDispositivoVO.getMaquinaIdRunt().getEstado() != null
						&& maquinaDispositivoVO
								.getMaquinaIdRunt()
								.getEstado()
								.equals(DatosConstantes.ESTADO_MAQUINA_NO_REGISTRADO)) {
					String idMaquina = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getId().toString()
							: null;
					String idRunt = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getIdRunt().toString()
							: null;
					String serie = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getSerie().toString()
							: null;
					String codMarca = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getCodMarca().getCodigo()
							.toString()
							: null;
					String codLinea = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getCodLinea().getCodigo()
							.toString()
							: null;
					String modelo = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getModelo().toString()
							: null;
					String tipoMaquina = maquinaDispositivoVO
							.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getTipoMaquina().getCodigo()
							.toString() : null;
					String idUnidadVigente = maquinaDispositivoVO
							.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getIdUnidadVigente().toString()
							: null;
					String motor = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getMotor() : null;
					String chasis = maquinaDispositivoVO.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getChasis().toString()
							: null;
					String tipoUnidadMaquina = maquinaDispositivoVO
							.getMaquinaIdRunt() != null ? maquinaDispositivoVO
							.getMaquinaIdRunt().getTipoUnidadMaquina() : null;

					String respuestaInsertarMaquinas = servicio
							.insertarMaquinas(
									DatosConstantes.USUARIO_WS_POLICIA, token,
									idRunt, serie, codMarca, codLinea, modelo,
									tipoMaquina, idUnidadVigente, motor,
									chasis, tipoUnidadMaquina);

					System.out.println(" DATOS DE ENVIO  DE INSERTAR MAQUINA");
					System.out.println(" token: " + token + " idRunt: "
							+ idRunt + " serie: " + serie + " codMarca: "
							+ codMarca + " codLinea: " + codLinea + " modelo: "
							+ modelo + " tipoMaquina: " + tipoMaquina
							+ " idUnidadVigente: " + idUnidadVigente
							+ " motor: " + motor + " chasis: " + chasis
							+ " tipoUnidadMaquina: " + tipoUnidadMaquina);
					System.out.println("respuestaInsertarMaquinas: "
							+ respuestaInsertarMaquinas);

					if (respuestaInsertarMaquinas
							.equals(DatosConstantes.RESPUESTA_INSERTAR_MAQUINA_EXITO)) {
						MaquinaVO maquinaVO = new MaquinaVO();
						maquinaVO.setId(new Long(idMaquina));
						MaquinaDAO maquinaDAO = new MaquinaDAO();
						maquinaDAO.actualizarRegistro(
								DatosConstantes.ID_ACTUALIZAR_ESTADO_MAMAQUINA,
								maquinaVO);
					}
				}

				if (maquinaDispositivoVO.getUnidRastIdUnidad().getEstado() != null
						&& maquinaDispositivoVO
								.getUnidRastIdUnidad()
								.getEstado()
								.equals(DatosConstantes.ESTADO_DISPOSITIVO_NO_REGISTRADO)) {
					String idDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getId().toString()
							: null;
					String idUnidadDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getIdUnidad() : null;
					String codMarcaDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getCodMarca().toString()
							: null;
					String codLineaDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getCodLinea().toString()
							: null;
					String imeiTablaDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getImei() : null;
					String tarjetaSimDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getTarjetaSim().toString()
							: null;
					String nroMovilDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getNroMovil().toString()
							: null;
					String operadorMovilDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getOperadorMovil()
							.toString()
							: null;
					String operadorSatelitalDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getOperadorSatelital()
							: null;
					String observacionDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getObservacion() : null;
					String serieDispositivo = maquinaDispositivoVO
							.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
							.getUnidRastIdUnidad().getSerieDispositivo()
							.toString()
							: null;
					String respuestainsertarUnidadesdeRastreo = servicio
							.insertarUnidadesdeRastreo(usuariows, token,
									idUnidadDispositivo, codMarcaDispositivo,
									codLineaDispositivo, imeiTablaDispositivo,
									tarjetaSimDispositivo, nroMovilDispositivo,
									operadorMovilDispositivo,
									operadorSatelitalDispositivo,
									observacionDispositivo, serieDispositivo);

					System.out
							.println(" DATOS DE ENVIO  DE INSERTAR UNIDADES DE RASTREO");
					System.out.println(" usuariows: " + usuariows + " token: "
							+ token + " idUnidadDispositivo: "
							+ idUnidadDispositivo + " codMarcaDispositivo: "
							+ codMarcaDispositivo + " codLineaDispositivo: "
							+ codLineaDispositivo + " imeiTablaDispositivo: "
							+ imeiTablaDispositivo + " tarjetaSimDispositivo: "
							+ tarjetaSimDispositivo + " nroMovilDispositivo: "
							+ nroMovilDispositivo
							+ " operadorMovilDispositivo: "
							+ operadorMovilDispositivo
							+ " operadorSatelitalDispositivo: "
							+ operadorSatelitalDispositivo
							+ "observacionDispositivo: "
							+ observacionDispositivo + " serieDispositivo: "
							+ serieDispositivo);
					System.out.println("respuestainsertarUnidadesdeRastreo: "
							+ respuestainsertarUnidadesdeRastreo);

					if (respuestainsertarUnidadesdeRastreo
							.equals(DatosConstantes.RESPUESTA_INSERTAR_DISPOSITIVO_EXITO)) {
						DispositivoVO dispositivoVO = new DispositivoVO();
						String idDispositivoide = maquinaDispositivoVO
								.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
								.getUnidRastIdUnidad().getId().toString()
								: null;
						dispositivoVO.setId(new Long(idDispositivoide));
						DispositivoDAO dispositivoDAO = new DispositivoDAO();
						dispositivoDAO
								.actualizarRegistro(
										DatosConstantes.ID_ACTUALIZAR_ESTADO_MADISPOSITIVO,
										dispositivoVO);
					}

				}

				if (maquinaDispositivoVO.getEstado() != null
						&& maquinaDispositivoVO
								.getEstado()
								.equals(DatosConstantes.ESTADO_MAQUINA_DISPOSITIVO_NO_REGISTRADO)) {
					String respuestaRelacionMaquinaUnidad = servicio
							.relacionMaquinaUnidad(usuariows, token,
									maquinaIdRunt, unidRastIdUnidad,
									documentoInstalacion);

					System.out.println("respuestaRelacionMaquinaUnidad: "
							+ respuestaRelacionMaquinaUnidad);
					System.out.println(" DATOS DE ENVIO  DE INSERTAR MAQUINA");
					System.out.println(" usuariows: " + usuariows + " token: "
							+ token + " maquinaIdRunt: " + maquinaIdRunt
							+ " unidRastIdUnidad: " + unidRastIdUnidad
							+ " documentoInstalacion: " + documentoInstalacion);
					System.out.println("respuestaRelacionMaquinaUnidad: "
							+ respuestaRelacionMaquinaUnidad);

					if (respuestaRelacionMaquinaUnidad
							.equals(DatosConstantes.RESPUESTA_INSERTAR_MAQUINA_DISPOSITIVO_EXITO)) {
						maquinaDispositivoDAO = new MaquinaDispositivoDAO();
						maquinaDispositivoVO
								.setEstado(DatosConstantes.ESTADO_MAQUINA_DISPOSITIVO_SI_REGISTRADO);
						maquinaDispositivoDAO
								.actualizarRegistro(
										DatosConstantes.ID_ACTUALIZAR_REGISTROS_MAMAQUINADISPOSITIVO,
										maquinaDispositivoVO);
					}
				}
				String ppuerto = "8030";
				String pip = "181.49.231.134";

				ETLBykomDAO etlByKomDAO = new ETLBykomDAO();
				String imeiDispositivo = maquinaDispositivoVO
						.getUnidRastIdUnidad() != null ? maquinaDispositivoVO
						.getUnidRastIdUnidad().getImei() : null;
				List<EtlBykomVO> etlBykomVO = etlByKomDAO
						.onBuscaUbicacionFromImei(imeiDispositivo);
				if (etlBykomVO != null) {
					String status = etlBykomVO.get(0)
							.getNumeroSateliteToStatus();
					Long estado = new Long("0");
					if (status != null
							&& !new Long(status).equals(new Long("0"))) {
						estado = new Long("9");

					}

					String consecutivoUbicacionTrama = maquinaDispositivoVO
							.getConsecutivoUbicacion() != null ? maquinaDispositivoVO
							.getConsecutivoUbicacion().toString() : null;
					String respuestaInsertarUbicacion = null;
					String consecutivoTrama = null;
					if (consecutivoUbicacionTrama != null) {
						consecutivoTrama = this.transformarTramaConsecutivo(consecutivoUbicacionTrama);
						respuestaInsertarUbicacion = servicio
								.insertarUbicacion(usuariows.trim(), token.trim(),
										consecutivoTrama.trim(), 
										etlBykomVO.get(0).getPidunidad().trim(), 
										etlBykomVO.get(0).getPtiptransm().trim(),
										etlBykomVO.get(0).getPlongitud().trim(),
										etlBykomVO.get(0).getPlatitud().trim(),
										etlBykomVO.get(0).getPvelocidad().trim(),
										"N",
										etlBykomVO.get(0).getPfechagps().trim(),
										etlBykomVO.get(0).getPevento().trim(),
										etlBykomVO.get(0).getPignicion().trim(), 
										pip.trim(),
										ppuerto.trim(), 
										estado.toString().trim(), 
										etlBykomVO.get(0).getPodometroParcial().trim());
						ConsecutivoUbicacionDAO consecutivoUbicacionDAO = new ConsecutivoUbicacionDAO();
						consecutivoUbicacionDAO.insertarRegistro(
								"idConsecutivoUbicacion", null);
					}

					System.out
							.println(" DATOS DE ENVIO  DE INSERTAR UBICACION");
					System.out.println(" pusuario: " + usuariows + " ptoken: "
							+ token + " pidtrama: " + consecutivoTrama
							+ " pidunidad " + etlBykomVO.get(0).getPidunidad()
							+ " ptiptransm: "
							+ etlBykomVO.get(0).getPtiptransm() + " plongitud "
							+ etlBykomVO.get(0).getPlongitud() + " platitud "
							+ etlBykomVO.get(0).getPlatitud() + " pvelocidad "
							+ etlBykomVO.get(0).getPvelocidad()
							+ " pdireccion "
							+ etlBykomVO.get(0).getPvelocidad() + " pfechagps "
							+ etlBykomVO.get(0).getPfechagps() + " pevento "
							+ etlBykomVO.get(0).getPevento() + " pignicion "
							+ etlBykomVO.get(0).getPignicion() + " pip " + pip
							+ " ppuerto " + ppuerto + " pstatus "
							+ estado.toString() + " podometro "
							+ etlBykomVO.get(0).getPodometroParcial());
					System.out.println("respuestaInsertarUbicacion: "
							+ respuestaInsertarUbicacion);

				}
			}
		}
		return true;
	}

	public String transformarTramaConsecutivo(String idConsecutivo) {
		String resultado = null;
		if (idConsecutivo != null) {
			String valor = new String(idConsecutivo);

			int numeroCerosAColocar = 20 - valor.length();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < numeroCerosAColocar; i++) {
				sb.append("0");
			}
			sb.append(valor);
			resultado = sb.toString();
			System.out.println("resultado : " + resultado);

		}
		return resultado;
	}
}
