package designpattern;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=0;i<3;i++)
{
	for(int j=0;j<3;j++) 
	if(i==1&&j==1) {
		System.out.print(" ");
	}else {
		System.out.print("x");
	}
	System.out.println();
}
	}

}
