package flowControl;

public class PrintDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int day =3;
if(day ==0) {
	System.out.println("SUnday");
} else if (day==1) {
	System.out.println("monday");
} else if (day==2) {
	System.out.println("Tuesday");
} else if(day==3) {
	System.out.println("wed day");
} else if (day ==4) {
	System.out.println("Thu day");
} else if(day ==5) {
	System.out.println("FRI day");
} else if (day ==6) {  
	System.out.println("Sat Day");
} else {
	System.out.println("YOur Eneterd number out of the range");
}


switch(day) {
case 0:
	System.out.println("SUN");
	break;
	
case 1:
	System.out.println("MON");
	break;
case 2:
	System.out.println("Tue");
	break;
case 3:
	System.out.println("Wed");
	break;
case 4:
	System.out.println("THU");
	break;
case 5:
	System.out.println("FRI");
	break;
case 6:
	System.out.println("Sat");
	break;
	default:
		System.out.println("YOur Enterd the number out of the range");
}


 	}

}
