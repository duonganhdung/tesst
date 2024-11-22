package Bai14;
import java.util.*;

public class Test {
	public static void main(String[] args) {
	       
        Scanner s = new Scanner(System.in);
       int x ;
       System.out.print("so luong giang vien ");
       int n = Integer.parseInt(s.nextLine());
      while(n != 0)
      {
          while (true) {               
              try {
              System.out.println("nhap 1 de tham mot giao vien huu");
              System.out.println("nhap 2 de them mot giang vien huu co");
              x = Integer.parseInt(s.nextLine());
              switch (x) {
              case 1:
                  	CNKSP a = new CNKSP();
                  	a.nhap();
                  	a.in();
                  break;
              case 2:
                   CNTCN b = new CNTCN();
                   b.nhap();
                   b.in();
                   break;
              case 0:
                  return;
              default:
                  System.out.println("vui long nhap lai ");
                  continue;
          }
             n--;
             break;
          }catch (Exception e) {
              
              System.out.println("nhap sai du lieu ");
          } 
          }
      }
	}
}