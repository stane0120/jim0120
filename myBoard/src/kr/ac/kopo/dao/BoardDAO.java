package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO {

	private List<BoardVO> list;
	
	public BoardDAO() {
		list = new ArrayList<BoardVO>();
	}
	
	public void insert(BoardVO board) {
		list.add(board);
	}
	
	public List<BoardVO> selectAll() {
		return list;
	}
}


