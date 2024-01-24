package github.nowsoar.mybatis.session.defaults;

import github.nowsoar.mybatis.binding.MapperRegistry;
import github.nowsoar.mybatis.session.SqlSession;

/**
 * @description:
 * @author: ZKP
 * @time: 2024/1/24
 */
public class DefaultSqlSession implements SqlSession {

    private MapperRegistry mapperRegistry;

    public DefaultSqlSession(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了!" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        return (T) ("你被代理了!" + "方法: " + statement + " 入参: " + parameter);
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return mapperRegistry.getMapper(type, this);
    }
}
