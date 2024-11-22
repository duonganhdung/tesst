package Bai14;

import java.util.Scanner;

public class CNTCN extends CongNhan{
    private  double luongCB, heSL;
    private  double soNC;
    public CNTCN() {
        
    }

    public CNTCN(String name, String ns, String place, String loaiCN, double luongCB, double heSL, double soNC) {
        super(name, ns, place, loaiCN);
        this.luongCB = luongCB;
        this.heSL = heSL;
        this.soNC = soNC;
    }
    public double thuong(){
        if(soNC < 20){
            return 0;
        }else{
            return luongCB *1.2;
        }
    }
    @Override
    public double thuNhap() {
        return this.luongCB * this.heSL + thuong();
    }
    public void nhap()
    {
    	super.nhap();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("nhap luongCB : ");
    	luongCB = sc.nextDouble();
    	System.out.println("he so luong : ");
    	heSL = sc.nextDouble();
    	System.out.println();
    	soNC = sc.nextDouble();
    }
    public void in()
    {
    	super.in();
    	System.out.println("luong : " + thuNhap());		
	}
    @Override
   	public String toString() {
   		return "CNTCN [luongCB=" + luongCB + ", heSL=" + heSL + ", soNC=" + soNC + "]";
   	}
}