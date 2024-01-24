package github.nowsoar.mybatis.session.defaults;

import github.nowsoar.mybatis.binding.MapperRegistry;
import github.nowsoar.mybatis.session.SqlSession;
import github.nowsoar.mybatis.session.SqlSessionFactory;

/**
 * @description:
 * @author: ZKP
 * @time: 2024/1/24
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
