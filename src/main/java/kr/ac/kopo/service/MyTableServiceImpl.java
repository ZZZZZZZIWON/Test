package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.MyTableDao;
import kr.ac.kopo.vo.MyTableVO;

@Service
public class MyTableServiceImpl implements MyTableService {
	@Autowired
	MyTableDao mytableDao;

	@Override
	public List<MyTableVO> list(MyTableVO mtVO) {
		return mytableDao.list(mtVO);
	}

}
