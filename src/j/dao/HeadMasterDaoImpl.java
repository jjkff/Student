package j.dao;

import j.model.HeadMaster;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class HeadMasterDaoImpl extends SqlSessionDaoSupport implements HeadMasterDao{

	public List<HeadMaster> selectHeadMasterfromheadUserTable() {
		
		return this.getSqlSession().selectList("j.dao.HeadMasterDao.selectHeadMasterfromheadUserTable");
	
	}

}
