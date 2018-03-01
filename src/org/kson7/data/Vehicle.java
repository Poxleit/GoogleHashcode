package org.kson7.data;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private boolean taken;
	private int currentRow;
	private int currentColumn;
	private int rideStartRow;
	private int rideStartColumn;
	private int rideEndRow;
	private int rideEndColumn;
	private List<Integer> rideIds = new ArrayList<>();

	public Vehicle(){
		this.taken = false;
		this.currentRow = 0;
		this.currentColumn = 0;
	}
	
	public void move(){
		if(taken){
			if(this.currentRow < this.rideEndRow){
				this.currentRow++;
			}else if(this.currentRow > this.rideEndRow){
				this.currentRow--;
			}else if(this.currentColumn < this.rideEndColumn){
				this.currentColumn++;
			}else if(this.currentColumn > this.rideEndColumn){
				this.currentColumn++;
			}
		}else if(this.rideStartRow != -1 && this.rideEndRow != -1){
			if(this.currentRow < this.rideStartRow){
				this.currentRow++;
			}else if(this.currentRow > this.rideStartRow){
				this.currentRow--;
			}else if(this.currentColumn < this.rideStartColumn){
				this.currentColumn++;
			}else if(this.currentColumn > this.rideStartColumn){
				this.currentColumn++;
			}
		}
		this.checkProgress();
	}
	
	private void checkProgress(){
		if(this.currentRow == this.rideEndRow && this.currentColumn == this.rideEndColumn){
			this.taken = false;
		}
		if(!taken && this.currentRow == this.rideStartRow && this.currentColumn == this.rideStartColumn){
			this.taken = true;
			this.rideStartRow = -1;
			this.rideStartColumn = -1;
		}
	}
	
	public void setRide(int rideStartRow, int rideStartColumn, int rideEndRow, int rideEndColumn, int rideId){
		this.rideStartRow = rideStartRow;
		this.rideStartColumn = rideStartColumn;
		this.rideEndRow = rideEndRow;
		this.rideEndColumn = rideEndColumn;
		this.rideIds.add(rideId);
	}

	public boolean isTaken(){
		return this.taken;
	}

	public int getNumberOfRides(){
		return this.rideIds.size();
	}

	public String getAllRideIds(){
		String allRideIds = "";
		for(int i = 0; i < this.rideIds.size(); i++){
			allRideIds += " " + this.rideIds.get(i);
		}
		return allRideIds;
	}

}
