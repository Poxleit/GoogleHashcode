package org.kson7.parser;

import java.io.File;
import java.util.Scanner;

import org.kson7.data.Grid;
import org.kson7.data.Ride;

public class DataHolder {
    private Ride[] rides;
    private Grid grid;
    
	public DataHolder(String filePath){
        this.loadData(filePath);
    }

    private void loadData(String filePath){
        try(Scanner sc = new Scanner(new File(filePath))){
            // Read grid data
            int[] gridData = new int[6];
            for(int i = 0; i < 6; i++){
                gridData[i] = sc.nextInt();
            }
            this.grid = new Grid(gridData[0], gridData[1], gridData[2], gridData[3], gridData[4], gridData[5]);
            // Read rides data
            int[] rideData = new int[6];
            this.rides = new Ride[this.grid.getNumberOfRides()];
            for(int i = 0; i < this.grid.getNumberOfRides(); i++){
                rideData = null;
                rideData = new int[6];
                for(int j = 0; j < 6; j++){
                    rideData[j] = sc.nextInt();
                }
                rides[i] = this.generateRide(rideData, i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private Ride generateRide(int[] rideData, int rideId){
        Ride ride = new Ride(rideData[0], rideData[1], rideData[2], rideData[3], rideData[4], rideData[5], rideId);
        return ride;
    }
    
    public Ride[] getRides() {
		return rides;
	}

	public Grid getGrid() {
		return grid;
	}

}
