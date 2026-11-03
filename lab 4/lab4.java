import java.util.*;
interface Parking_charge{
   double calculatecharge();
   void displayparkingdetails();
}
class Vehicleparking{
   String vnum;
   String vtype;
   int parkhrs;
   Vehicleparking(String a,String b,int c){
      this.vnum=a;
      this.vtype=b;
      this.parkhrs=c;
   }
}
class Twowheeler extends Vehicleparking implements Parking_charge{
   Twowheeler(String a,int b){
      super(a,"Two wheeler",b);
      }
      public double calculatecharge(){
         if(parkhrs<=2)
            return parkhrs*20;
         else
            return 2*20 + (parkhrs-2)*10;
      }
      public void displayparkingdetails(){
         System.out.println("Vehicle Number:"+vnum);
         System.out.println("Vehicle Type:Two Wheeler");
         System.out.println("Parking Hours:"+parkhrs);
         System.out.println("Charges:"+calculatecharge());
      }
}
class Fourwheeler extends Vehicleparking implements Parking_charge{
   Fourwheeler(String a,int b){
      super(a,"Four wheeler",b);
      }
      public double calculatecharge(){
         if(parkhrs<=2)
            return parkhrs*50;
         else
            return 2*50 + (parkhrs-2)*30;
      }
      public void displayparkingdetails(){
         System.out.println("Vehicle Number:"+vnum);
         System.out.println("Vehicle Type:Four Wheeler");
         System.out.println("Parking Hours:"+parkhrs);
         System.out.println("Charges:"+calculatecharge());
      }
}
public class parking{
   public static void main(String[] args){
      Parking_charge p1 = new Twowheeler("KA101",3);
      p1.displayparkingdetails();
      Parking_charge p2 = new Fourwheeler("KA201",5);
      p2.displayparkingdetails();
      }
}
