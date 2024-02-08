package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.vo.MyTableVO;

@Repository
public class MyTableDaoImpl implements MyTableDao {
	@Autowired
	SqlSession sql;
	
	@Override
	public List<MyTableVO> list(MyTableVO mtVO) {
		return sql.selectList("mytable.mytableList", mtVO);
	}

}
