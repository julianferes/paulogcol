package com.dao.object;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import GeneralMysqlFSMonitoreoDAO.DaoGeneral;

import com.dao.vo.DispositivoVO;

public class DispositivoDAO extends DaoGeneral{

	public DispositivoDAO() {
		super();
	}

	@Override
	public Object consultarRegistroPorLlavePrimaria(String idMapper,
			Object filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DispositivoVO> consultarRegistrosPorImei(Long imei) {
		SqlSession session =  null;
		List<DispositivoVO> listaRegistros = null;
		try {
			session =  super.getSession();
			listaRegistros = (List)session.selectList("");
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