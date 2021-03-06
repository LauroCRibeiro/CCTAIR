
public class AirPlane {

    public String make;
    public int model;
    public int capacity;
    public String pilot;

    public AirPlane(String make, int model, int capacity, String pilot) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
    }

    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public String getPilot() {
        return pilot;
    }
    public int capacity() {
        return capacity;
    }
    
    public void assignPilot(String namePilot){
        this.pilot = namePilot;
    }
    
    @Override
    public String toString(){
        String st = "Airplane Information:\n" +
        "Aircraft : "+ this.getMake() + "  " + this.getModel()+"\n" +
        "Capacity: "+ this.capacity() +" seats\n" +
        "Pilot: "+ this.getPilot();
        return st;
    }
    
}
