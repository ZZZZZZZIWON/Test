package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.vo.RoomVO;

@Repository
public class MapTestDaoImpl implements MapTestDao {
	@Autowired
	SqlSession sql;
	
	@Override
	public List<RoomVO> selectRoom(String keyword) {
		return sql.selectList("room.list",keyword);
	}

	
}
