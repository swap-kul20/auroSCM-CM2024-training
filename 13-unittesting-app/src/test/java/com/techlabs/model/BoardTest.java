package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	
	private Board board;
	
	@BeforeEach
	void init()
	{
		board=new Board();
	}

	@Test
	void testIsBoardFull() {
		
		for(int i=0;i<9;i++)
		     board.setCellMark(i, MarkType.X);
		
		assertTrue(board.isBoardFull());
	}
	
	@Test
	void testIsBoardNotFull() {
		
		for(int i=0;i<8;i++)
		     board.setCellMark(i, MarkType.X);
		
		assertFalse(board.isBoardFull());
	}

	@Test
	void testSetCellMark() {
		
		  

          board.setCellMark(4, MarkType.O);
          
          Cell cells[]=board.getCells();
          
          assertEquals(MarkType.O, cells[4].getMark());
          
         assertThrows(NullPointerException.class,()->board.setCellMark(9,MarkType.O));
          
          
	}

}
