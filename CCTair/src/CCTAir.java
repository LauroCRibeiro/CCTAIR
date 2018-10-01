


public class CCTAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberFlight = 5;
        AirPlane air = new AirPlane("Boeing", 707, 400, "Renan");
        AirPlane air1 = new AirPlane("Boeing",703, 430, "Fabiana");
        AirPlane air2 = new AirPlane("Airbus", 320, 340, "Lauro");
        
        Flight f1 = new Flight("Dublin", "New York", "05/11/2018", air);
        Flight f2 = new Flight("Lisboa", "Dublin", "05/10/2018", air1);
        Flight f3 = new Flight("Dublin", "Madrid", "05/09/2018", air);
        Flight f4 = new Flight("Lisboa", "London", "05/08/2018", air2);
        Flight f5 = new Flight("Liverpool", "Porto", "05/07/2018", air1);
        f1.schedule("16:30","10:10");
        f1.schedule("18:00");
        f2.schedule("4:20", "20:40");
        f3.schedule("6:30", "12:30");
        f4.schedule("10:10", "14:50");
        f5.schedule("17:30", "21:45");
        System.out.println(f1.toString()+"\n");
        System.out.println(f2.toString()+"\n");
        System.out.println(f3.toString()+"\n");
        System.out.println(f4.toString()+"\n");
        System.out.println(f5.toString());
    }
    
}

