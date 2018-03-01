package org.kson7.logic;

import java.io.PrintWriter;

import org.kson7.data.Grid;
import org.kson7.data.Ride;
import org.kson7.data.Vehicle;

public class Simulator {
    private Grid grid;
    private Ride[] rides;
    private Vehicle[] vehicles;

    public Simulator(Grid grid, Ride[] rides){
        this.grid = grid;
        this.rides = rides;
        this.vehicles = new Vehicle[grid.getNumberOfVehicles()];
    }

    public void start(String fileName){
        for(int i = 0; i < this.grid.getSteps(); i++){
            this.tick();
        }
        this.writeResults(fileName);
    }

    private void tick(){
        this.assignVehicles();
        this.makeMove();
    }
    
    private void assignVehicles(){
        for(int i = 0; i < this.vehicles.length; i++){
            if(!this.vehicles[i].isTaken()){
                Ride ride = this.getRideForVehicle();
                this.vehicles[i].setRide(ride.getStartingRow(), ride.getStartingColumn(), ride.getFinishRow(), ride.getFinishColumn(), ride.getRideId());
            }
        }
    }

    private void makeMove(){
        for(int i = 0; i < this.vehicles.length; i++){
            vehicles[i].move();
        }
    }

    // TODO Wait for team members to come up with an algorithm them code it
    private Ride getRideForVehicle(){
        return null;
    }

    private void writeResults(String fileName){
        try(PrintWriter pw = new PrintWriter("C:\\Users\\nkurcubic\\Desktop\\Workspace_Hashcode\\Solution\\" + fileName + ".out")){
            for(int i = 0; i < this.vehicles.length; i++){
                String result = "" + this.vehicles[i].getNumberOfRides() + this.vehicles[i].getAllRideIds();
                pw.println(result);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
