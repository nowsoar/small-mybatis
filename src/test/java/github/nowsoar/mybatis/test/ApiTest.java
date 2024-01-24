package github.nowsoar.mybatis.test;

import github.nowsoar.mybatis.binding.MapperProxyFactory;
import github.nowsoar.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: ZKP
 * @time: 2024/1/24
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_MapperProxyFactory() {
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        Map<String, String> sqlSession = new HashMap<>();
        sqlSession.put("github.nowsoar.mybatis.test.dao.IUserDao.queryUserName", "模拟执行Mapper.xml中的SQL语句，操作：查询用户名称.");
        IUserDao userDao = factory.newInstance(sqlSession);
        String result = userDao.queryUserName("1");
        logger.info("测试结果: {}", result);
    }
}
