package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sd = new Scanner(System.in);
		int n1=sd.nextInt();
		int n2=sd.nextInt();
		int n3=sd.nextInt();
		int n4=sd.nextInt();
		int n5=sd.nextInt();
		int contPar=0;
		int contImp=0;
		int contPos=0;
		int contNeg=0;
		
		int []num={n1,n2,n3,n4,n5};
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0){
				contPar++;
			}
			else if(num[i]%2!=0){
				contImp++;
			}
			if(num[i]>0){
				contPos++;
			}
			else if(num[i]<0){
				contNeg++;
			}
		}
		System.out.print(contPar+" valor(es) par(es)"+"\n"+contImp+" valor(es) impar(es)"+"\n"+contPos+" valor(es) positivo(s)"+"\n"+contNeg+" valor(es) negativo(s)");
	}
	
}
