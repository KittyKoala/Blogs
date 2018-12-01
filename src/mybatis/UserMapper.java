package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
	/*
     * ���ǻ���ע���ӳ�䷽ʽ��ʵ�ֶ����ݵ���ɾ�Ĳ飬��sql���ֱ��д��ע���������
     * ����һ���ӿڣ��䲻��Ҫ��ȥʵ����
     * �±߷ֱ��ǲ��룬ɾ�����޸ģ���ѯһ����¼����ѯ���еļ�¼
     * */
	 @Insert("insert into users(id,name,age) values(#{id},#{name},#{age})")
	    public void insertT(User user);
	 @Delete("delete from users where id=#{id}")
	    public void deleteById(int id);
	 @Update("update users set name=#{name},age=#{age} where id=#{id}")
	    public void updateT(User user);
	 @Select("select * from users where id=#{id}")
	    public User getUser(int id);
	 @Select("select * from users")
	    public List<User> getAllUsers();
}
