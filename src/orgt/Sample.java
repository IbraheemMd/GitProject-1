package orgt;

public class Sample {
public static void main(String[] args) {
    //reverse the num
	
	int a=123;
	int i=0, j=0;
	while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		
		
	}
		System.out.println(j);	
			

}
}
