package logic.cell;
import logic.Board;

/* fill code */

public/* fill code */class Cell {

	protected int x, y;
	private boolean opened = false;
	private boolean flagged = false;

	public Cell(int x, int y) {
		/* fill code */
	}

	public boolean isOpened() {
		return opened;
	}

	public boolean isFlagged() {
		return flagged;
	}

	public void open(Board board) {
		opened = true;
		actionOnOpen(board);
		if (!(this instanceof BombCell)) {
			board.getPlayer().openNewNonBombCell();
		}
	}

	public void setFlagged(boolean value) {
		flagged = value;
	}

	/* fill code : void actionOnOpen(Board board) */
}
