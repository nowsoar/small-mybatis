package github.nowsoar.mybatis.session;

/**
 * @description:
 * @author: ZKP
 * @time: 2024/1/24
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
