package kr.ac.kopo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.dao.MapTestDao;
import kr.ac.kopo.vo.RoomVO;

@Service
public class MapTestServiceImpl implements MapTestService {
	@Autowired
	MapTestDao dao;
	
	@Override
	public List<RoomVO> selectRoom() {
		return dao.list();
	}

}
