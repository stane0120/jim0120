package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	private BoardDAO dao;
	
	public BoardService() {
		dao = new BoardDAO();
	}
	
	public void addBoard(BoardVO board) {	
		dao.insert(board);
	}
	
	public List<BoardVO> searchAllBoard() {
		List<BoardVO> list = dao.selectAll();
		return list;
	}
}
