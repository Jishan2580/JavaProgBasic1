class AeroPlane{
    void fly(){
        System.out.println("Aeroplane fly on greater height");
    }
    void takeoff(){
        System.out.println("Aeroplane is takomg off");
    }
}
class CargoPlane extends AeroPlane{
    void fly(){
        System.out.println("CargoPlane fly on less height");
    }
    void takeoff(){
        System.out.println("cargoplane is takking off");
    }
}
class PassengerPlane extends AeroPlane{
    void fly(){
        System.out.println("Passenger plane fly on medium height");
    }
    void takeoff(){
        System.out.println("passengerplane is takking off");
    }
}
class FighterPlane extends AeroPlane{
    void fly(){
        System.out.println("fighterplane is flying ");
    }
    void takeoff(){
        System.out.println("fighterplane is takking off ");
    }
}
class Airport{
    void poly(AeroPlane ref){/*parent class reference can hold address of child class like
                Aeroplene ref = new CargoPlane()*/
        ref.fly();
        ref.takeoff();
        System.out.println("--------------------------");
    }
}
//Example of runtime polymorphism

public class Polymorphism_with_ref_type{
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp= new FighterPlane();
        //cp.fly();  /*    */
        //cp.takeoff();
        //pp.fly();
        //pp.takeoff();
        //fp.fly();
        //fp.takeoff();
        /* when we hhave  to call all the methods only by calling at one time then create one more class
         * airport with reference of parent type like this 
         */
        Airport ap = new Airport();
        ap.poly(cp);
        ap.poly(pp);
        ap.poly(fp);
        ap.poly(new CargoPlane());//we can also do this 
    }
}