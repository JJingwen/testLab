package cn.tjuscs.jw;

public class Calculate{
    int a,b,c; //定义a b c 分别是三角形的三个边
    
	public int justify(int a, int b, int c) {
		// TODO Auto-generated method stub
		int pd=0;//作为三角形的判断标准
		
		if((a==0 || b==0 || c==0) || ((a+b<=c) || (a+c<=b) || (b+c<=a)) ){
			pd=-1;
			System.out.println("不是三角形"); //不是三角形
		}
		
		else if(a==b || a==c || b==c){
	             if(a==b && b==c) {
	            	 pd=1;
	            	 System.out.println("这个三角形是等边三角形。");//等边
	             }
	             else{
	            	 pd=2;
	            	 System.out.println("这个三角形是等腰三角形。");//等腰
	             }
	        }
		else {
	       	pd=3;
	       	System.out.println("这个是一般三角形。");//一般三角形
        }
		
		return pd;
	}
}