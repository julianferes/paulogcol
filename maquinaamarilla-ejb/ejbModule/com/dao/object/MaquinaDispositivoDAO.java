package com.dao.object;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import GeneralMysqlFSMonitoreoDAO.DaoGeneral;

import com.dao.vo.MaquinaDispositivoVO;
import com.util.DatosConstantes;

public class MaquinaDispositivoDAO  extends DaoGeneral{

	public MaquinaDispositivoDAO() {
		super();
	}

	@Override
	public Object consultarRegistroPorLlavePrimaria(String idMapper,
			Object filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MaquinaDispositivoVO> consultarRegistros() {
		SqlSession session =  null;
		List<MaquinaDispositivoVO> listaRegistros = null;
		try {
			session =  super.getSession();
			listaRegistros = (List)session.selectList(DatosConstantes.ID_CONSULTAR_REGISTROS_MAMAQUINADISPOSITIVO);
		} catch (Exception e) {

			e.printStackTrace();
		}finally{
			session.close();
		}
		return listaRegistros;
	}
	
	@Override
	public Object insertarRegistro(String idMapper, Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object actualizarRegistro(String idMapper, Object objeto) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		SqlSession session =  null;
		try {
			session =  super.getSession();
			int resultado = session.update(idMapper, objeto);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			session.close();
			
		}
		return true;

	}

	@Override
	public Object eliminarRegistro(String idMapper, Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object consultarRegistros(String idMapper, Object filtro) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}