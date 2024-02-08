package kr.ac.kopo.dao;

import java.util.List;

import kr.ac.kopo.vo.MyTableVO;

public interface MyTableDao {

	List<MyTableVO> list(MyTableVO mtVO);

}
