package oops.beginner.book;
/*
 * Association establish relationship between two classes through their objects. 
 * The relationship can be one to one, One to many, many to one and many to many.
 */
class CarClass{
	   String carName;
	   double carSpeed;
	   int carId;
	   CarClass(String name, double speed, int Id)
	   {
		this.carName=name;
		this.carSpeed=speed;
		this.carId=Id;
	   }
	}
	class Driver{
	   String driverName;
	   int driverAge;
	   Driver(String name, int age){
	      this.driverName=name;
	      this.driverAge=age;
	   }
	}
	public class AssociationExample{
	   public static void main(String args[])
	   {
		CarClass obj= new CarClass("Ford", 180.15, 9988);
		Driver obj2 = new Driver("Andy", 45);
		System.out.println(obj2.driverName+" is a driver of car Id: "+obj.carId);
	   }
	}
