package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class UserMapperTest {
@Test
//��������
public void testInsert() {
	SqlSessionFactory factory=MybatisUtils.getFactory();
	SqlSession session=factory.openSession(true);
	//ʹ�÷���ķ���
	UserMapper mapper=session.getMapper(UserMapper.class);
	mapper.insertT(new User(11,"��־��",18));
	session.close();
}
@Test 
//ɾ������
public void testDelete() {
	SqlSessionFactory factory=MybatisUtils.getFactory();
	SqlSession session=factory.openSession(true);
	UserMapper mapper=session.getMapper(UserMapper.class);
	mapper.deleteById(1);
	session.close();
}
@Test
//�޸�����
public void testUpdate() {
	SqlSessionFactory factory=MybatisUtils.getFactory();
	SqlSession session=factory.openSession(true);
	UserMapper mapper=session.getMapper(UserMapper.class);
	mapper.updateT(new User(2, "j", 232));
}
@Test
//��ȡһ������
public void testGetUser(){
	SqlSessionFactory factory=MybatisUtils.getFactory();
	SqlSession session=factory.openSession(true);
	UserMapper mapper=session.getMapper(UserMapper.class);
	User user=mapper.getUser(2);
	session.close();
	System.out.println(user);
}
@Test
//��ȡ��������
public void testGetAllUsers(){
    SqlSessionFactory factory=MybatisUtils.getFactory();
    SqlSession session=factory.openSession(true);
    UserMapper mapper=session.getMapper(UserMapper.class);
    List<User> users=mapper.getAllUsers();
    
    session.close();
    System.out.println(users);
}
}
