package sofi;

public class LabelledLoopDemoOne {

	public static void main(String[] args) {
		outer: for(int m=1;m<11;m++) {
			for(int n=1; n<11; n++) {
				System.out.print("  " + m*n);
				if (n==m) {
					continue outer;
				}
					
			}
		}

	}

}
