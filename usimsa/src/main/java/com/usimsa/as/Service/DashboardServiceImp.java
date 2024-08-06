package com.usimsa.as.Service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.usimsa.as.Mapper.DashboardMapper;

@Service
public class DashboardServiceImp implements DashboardService {
	
	private final SqlSession sqlSession;
	
//	public DashboardServiceImp(@Qualifier("slaveSqlSession") SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}
	public DashboardServiceImp(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int selectDashboard() {
		DashboardMapper dashboardMapper = sqlSession.getMapper(DashboardMapper.class);
		return dashboardMapper.selectDashboard();
	}

}
