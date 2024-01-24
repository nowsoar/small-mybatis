package github.nowsoar.mybatis.session;

/**
 * @description:
 * @author: ZKP
 * @time: 2024/1/24
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> T getMapper(Class<T> type);
}
