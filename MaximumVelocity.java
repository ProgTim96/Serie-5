import acm.program.*;


public class MaximumVelocity extends ConsoleProgram {
	


    public void run() {

}

class Formula{

    public String Description;

    public double getMaximumVelocity(double P, double DENSITY, double A, double CW){
        //Calculate Maximum Velocity with ilearn-Formula
        return Math.cbrt((2*P)/(DENSITY*A*CW))*3.6;
    }
}

class WaterVehicles extends Formula{

    public double P;
    //Motorkraft in Watt
    
    public double A;
    //Widerstand durch Oberfläche
    
    public final int WATER_DENSITY = 1028;
    //Wasserdichte (in der Aufgabenstellung festgelegt)
    
    public final double CW = 0.35;
    //Koeffizient (in der Aufgabenstellung festgelegt

}

class LandVehicles extends Formula{

	protected int Ps;
	//Motorkraft

	private final double A = 2.5;
	//Größe der Frontscheibe
	
	private final double CW = 0.35;
	//Widerstands-Koeffizient
	
	private final double Air_Density = 1.3;
	//Luftdichte
	
	public void Cars(int power){
		this.Ps = power;
	}

class Cars extends LandVehicles{

    public final double A = 2.5;
    //Größe der Frontscheibe

    int s = (int) 735.49875;

}

class Steamships extends WaterVehicles {
	
	
    public double displaceVolume;
    public double length;

    public Steamships(String description, int ps, double displaceVolume, double length) {

        this.Description = description;
        this.displaceVolume = displaceVolume;
        this.length = length;
        this.P = ps * 735.49875;
        this.A = displaceVolume / length;

    }

    public double getMaximumVerlocity() {
        return super.getMaximumVelocity(P, WATER_DENSITY, A, CW);
    }



class RowingBoats extends WaterVehicles{

    public int persons;
    public double width;
    public double draught;

    public RowingBoats(String description, int persons, double width, double draught){

        this.Description = description;
        this.P = persons * 100;
        this.A = 0.5 * width * draught;
        this.persons = persons;
        this.width = width;
        this.draught =  draught;

    }

    public double getMaximumVerlocity(){
        return super.getMaximumVelocity(P, WATER_DENSITY, A, CW);
    }
}

class Bicycles extends LandVehicles {

    public double a;
    public double b;
    public double cdA;
   
}
}
}
}
    




    



