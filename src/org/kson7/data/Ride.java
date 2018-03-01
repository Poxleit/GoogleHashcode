package org.kson7.data;

public class Ride{
    private int startingRow;
    private int startingColumn;
    private int finishRow;
    private int finishColumn;
    private int earliestStart;
	private int latestFinish;
	private int rideId;
    
	public Ride(int startingRow, int startingColumn, int finishRow,
			int finishColumn, int earliestStart, int latestFinish, int rideId) {
		super();
		this.startingRow = startingRow;
		this.startingColumn = startingColumn;
		this.finishRow = finishRow;
		this.finishColumn = finishColumn;
		this.earliestStart = earliestStart;
		this.latestFinish = latestFinish;
		this.rideId = rideId;
	}
	public int getStartingRow() {
		return startingRow;
	}
	public void setStartingRow(int startingRow) {
		this.startingRow = startingRow;
	}
	public int getStartingColumn() {
		return startingColumn;
	}
	public void setStartingColumn(int startingColumn) {
		this.startingColumn = startingColumn;
	}
	public int getFinishRow() {
		return finishRow;
	}
	public void setFinishRow(int finishRow) {
		this.finishRow = finishRow;
	}
	public int getFinishColumn() {
		return finishColumn;
	}
	public void setFinishColumn(int finishColumn) {
		this.finishColumn = finishColumn;
	}
	public int getEarliestStart() {
		return earliestStart;
	}
	public void setEarliestStart(int earliestStart) {
		this.earliestStart = earliestStart;
	}
	public int getLatestFinish() {
		return latestFinish;
	}
	public void setLatestFinish(int latestFinish) {
		this.latestFinish = latestFinish;
	}

	public int getRideId(){
		return this.rideId;
	}

	public void displayRide(){
		System.out.println(this.startingRow + " " + this.startingColumn + " " + this.finishRow
			+ " " + this.finishColumn + " " + this.earliestStart + " " + this.latestFinish);
	}
}