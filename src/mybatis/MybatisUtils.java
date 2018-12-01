package mybatis;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	 public static SqlSessionFactory getFactory(){
		 String resource="conf.xml";
		//����mybatis �������ļ�����Ҳ���ع�����ӳ���ļ���
		 InputStream is=MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
		//����sqlSession �Ĺ���
		 SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		 return factory;
	 }
}
