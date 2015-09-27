package logic;
/* fill code */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lib.GameScreen;
import logic.cell.BombCell;
import logic.cell.Cell;
import logic.cell.EmptyCell;
import logic.cell.HeartCell;
import logic.cell.InfoCell;

public class Board {

	private PlayerStatus player;
	private Cell[][] board;
	private int width, height;
	private int bombCount, heartCount;

	public Board(int width, int height, int bombCount, int heartCount) {
		if (width <= 0 || height <= 0) {
			width = 3;
			height = 3;
		}

		if (width * height <= bombCount + heartCount) {
			bombCount = width * height - 1;
			heartCount = 0;
		}

		/* fill code */

		generateGameBoard();
	}

	public PlayerStatus getPlayer() {
		return player;
	}

	public boolean outOfBoard(int x, int y) {
		/* fill code */
	}

	public Cell getCellAt(int x, int y) {
		/* fill code */
	}

	public void setCellAt(int x, int y, Cell cell) {
		/* fill code */
	}

	public void leftClickAt(int x, int y) {
		/* fill code : put the right condition */
		Cell cell = board[x][y];
		cell.open(this);
	}

	public void rightClickAt(int x, int y) {
		/* fill code : put the right condition */
		Cell cell = board[x][y];
		cell.setFlagged(!cell.isFlagged());
	}

	public void deleteOnTimer() {
		/* fill code */
	}

	private void generateGameBoard() {
		/* fill code */
	}
}
