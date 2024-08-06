package com.megazone.www.Service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.megazone.www.Mapper.DashboardMapper;

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
