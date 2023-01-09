import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
    {
				Scanner sc = new Scanner(System.in);
				int H = sc.nextInt();
				int M = sc.nextInt();
				
				int h,m =0;
				
				if(0<=H && H<=23 && 0<=M && M<=59) 
                {
					if(M<45) 
                    {
						if(H==0) 
                        {
							h=23;
							m=M+15;
							System.out.println(h + " " + m);
						}
                        else 
                        {
						h = H-1;
						m = M+15;
						System.out.println(h + " " + m);
						}
					} 
                    else 
                    {
					m=M-45;
					System.out.println(H + " " + m);
					}
				} 
				 else 
                 {
			System.out.println("올바르지 않은 숫자 입력");
				}
			}
		}