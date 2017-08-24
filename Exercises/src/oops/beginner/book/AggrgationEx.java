package oops.beginner.book;
/*
 * Aggregation is a special form of association. It is also a relationship between two classes 
 * like association, however its a directional association,
 *  which means it is strictly a one way association. It represents a Has-A relationship.
 */
 class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
}
public class AggrgationEx
{
   int rollNum;
   String studentName;
   Address studentAddr; 
   AggrgationEx(int roll, String name, Address addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }
   public static void main(String args[]){
       Address ad = new Address(55, "Agra", "UP", "India");
       AggrgationEx obj = new AggrgationEx(123, "Chaitanya", ad);
       System.out.println(obj.rollNum);
       System.out.println(obj.studentName);
       System.out.println(obj.studentAddr.streetNum);
       System.out.println(obj.studentAddr.city);
       System.out.println(obj.studentAddr.state);
       System.out.println(obj.studentAddr.country);
   }
}