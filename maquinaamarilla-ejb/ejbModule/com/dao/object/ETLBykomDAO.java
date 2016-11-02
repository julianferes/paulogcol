package com.dao.object;


import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.vo.EtlBykomVO;

public class ETLBykomDAO {
	
	
	public List<EtlBykomVO> onBuscaUbicacionFromImei(String imei){
			
			
		List<EtlBykomVO> response =  null;
			SqlSession session = null;
	        try {
	            String resource = "fsmonitoreo-bycom.xml";
	            Reader reader = Resources.getResourceAsReader(resource);
	            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
	            session = sqlMapper.openSession();
	            
	            response =  session.selectList("buscarBykom",imei);
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        } finally {
	            session.close();
	            return response;
	        }		
		}
	}
