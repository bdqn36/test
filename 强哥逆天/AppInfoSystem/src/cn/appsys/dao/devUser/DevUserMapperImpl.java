package cn.appsys.dao.devUser;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.appsys.pojo.DevUser;

@Repository
public class DevUserMapperImpl implements DevUserMapper {
	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public DevUser getLoginUser(String devCode) throws Exception {
		return sqlSession.selectOne("cn.appsys.dao.devUser.DevUserMapper.getLoginUser", devCode);
	}

}
