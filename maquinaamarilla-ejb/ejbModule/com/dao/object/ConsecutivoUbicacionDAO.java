package com.dao.object;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import GeneralMysqlFSMonitoreoDAO.DaoGeneral;

import com.dao.vo.MaquinaDispositivoVO;
import com.util.DatosConstantes;

public class ConsecutivoUbicacionDAO  extends DaoGeneral{

	public ConsecutivoUbicacionDAO() {
		super();
	}

	@Override
	public Object consultarRegistroPorLlavePrimaria(String idMapper,
			Object filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ConsecutivoUbicacionDAO> consultarRegistros() {
		return null;
	}
	
	@Override
	public Object insertarRegistro(String idMapper, Object objeto) {

		SqlSession session =  null;
		Integer resultadoEntregar = null;
		try {
			session =  super.getSession();
			int resultado = session.insert(idMapper);
			session.commit();
			resultadoEntregar = new Integer(resultado);
			
			System.out.println("inserto consecutivo ok");
		} catch (Exception e) {
			System.out.println("inserto consecutivo error");
			e.printStackTrace();
		}finally{
			
			session.close();
			
		}

		
		return resultadoEntregar;
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