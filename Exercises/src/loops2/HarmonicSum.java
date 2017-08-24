package loops2;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int maxDenaminator = 5000;
double sumL2R=0;
double sumR2L=0;
for(int denominator=1;denominator <= maxDenaminator;++denominator) {
	sumL2R += (double) 1/denominator;
	sumR2L += (double) 1/(maxDenaminator-denominator+1);
}

System.out.println("HArmonic sum Left to right = "+sumL2R);
System.out.println("Harmonic sum right to left = "+sumR2L);
System.out.println("The difference is "+(sumL2R-sumR2L));
	}

}
