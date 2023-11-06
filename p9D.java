public class p9D
{
	public static void main(String[] args) {
		int n=5;
		for(int i=n-1;i>=0;i--){
		    for(int j=i+1;j<n;j++){
		        System.out.print(" ");
		    }
		    for(int k=0;k<=i;k++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}