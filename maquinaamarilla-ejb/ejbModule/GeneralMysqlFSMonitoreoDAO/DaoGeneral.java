package GeneralMysqlFSMonitoreoDAO;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class DaoGeneral {

	SqlSession session = null;

	public DaoGeneral(){
		try {
			String resource = "fsmonitoreo-config.xml";
			InputStream inputStream = null;
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			System.out.println("session: "+session);
			
//		    Dispositivo blog = (Dispositivo) session.selectOne("Mapper.Dispositivo.selectDispositivo", 2147483647);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//		  session.close();
		}		
	}
	
	abstract public Object consultarRegistros(String idMapper, Object filtro);
	
	abstract public Object consultarRegistroPorLlavePrimaria(String idMapper, Object filtro);
	
	abstract public Object insertarRegistro(String idMapper,Object objeto);
	
	abstract public Object actualizarRegistro(String idMapper,Object objeto);
	
	abstract public Object eliminarRegistro(String idMapper,Object objeto);
	
	
	public SqlSession getSession() {
		return session;
	}
	public void setSession(SqlSession session) {
		this.session = session;
	}
	

}
