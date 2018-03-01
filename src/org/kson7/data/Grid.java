package org.kson7.data;

public class Grid {
    private int rows;
    private int columns;
    private int numberOfVehicles;
    private int numberOfRides;
    private int startingBonus;
    private int steps;

    public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	public int getStartingBonus() {
		return startingBonus;
	}

	public void setStartingBonus(int startingBonus) {
		this.startingBonus = startingBonus;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public void setNumberOfRides(int numberOfRides) {
		this.numberOfRides = numberOfRides;
	}

	public Grid(int rows, int columns, int numberOfVehicles, int numberOfRides, int startingBonus, int steps){
        this.rows = rows;
        this.columns = columns;
        this.numberOfVehicles = numberOfVehicles;
        this.numberOfRides = numberOfRides;
        this.startingBonus = startingBonus;
        this.steps = steps;
    }

    public int getNumberOfRides(){
        return this.numberOfRides;
    }
}
