package com.mybatis3.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory 
{
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			try {
				InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				throw new RuntimeException();
			}
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession openSession() {
		return getSqlSessionFactory().openSession();
	}
}
                