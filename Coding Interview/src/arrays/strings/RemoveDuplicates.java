package arrays.strings;

//demo for jenkins

public class RemoveDuplicates {

	
public static void removeduplicates1(char[] str)	{
	if(str == null) return;
	int len = str.length;
	if(len <2 ) return;
	
	int tail =1;
	for(int i=1;i<len;++i) {
		int j;
		for(j=0;j<tail;++j) {
			if(str[i] == str[j]) break;
			}
		if(j==tail) {
			str[tail] = str[i];
			++tail;
		}
	}    str[tail]=0;
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'a','b','c','d'};
removeduplicates1(ch);
		
	}

}
