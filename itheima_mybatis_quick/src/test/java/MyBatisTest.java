import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class MyBatisTest {

    @Test
    public void test1() throws Exception{

        //模拟User对象
        User user = new User();
        user.setUsername("tom");
        user.setPassword("123");


        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询操作 参数:namespace+id
        List<User> userList = sqlSession.selectList("userMapper.findAll");

        //更新操作
        sqlSession.update("userMapper.update",user);


        //删除操作
        sqlSession.delete("userMapper.delete",2);

        //插入操作，并且提交事务
        sqlSession.insert("userMapper.save",user);
        sqlSession.commit();

        //打印数据
        System.out.println(userList);

        //释放资源
        sqlSession.close();
    }
}
