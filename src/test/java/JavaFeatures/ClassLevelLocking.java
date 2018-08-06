package JavaFeatures;

class TableStatic
{
	static synchronized void printTable(int n)
		{
			System.out.println("Table of " + n);
			for(int i=1; i<=5; i++)
			{
				
				System.out.println(n*i);
				
			}
			
		
		   try{  
			  Thread.sleep(1000);  
			  }catch(Exception e)
		   		{System.out.println(e);}  
}
}

class MyThread3 extends Thread
{
	public void run(){  
		TableStatic.printTable(5);  
	} 
	
}

class MyThread4 extends Thread
{
	
	public void run(){  
		TableStatic.printTable(10);  
		}  
}


class ClassLevelLocking
{
	public static void main(String[] args) {
		
		MyThread3 t1=new MyThread3();  
		MyThread4 t2=new MyThread4();   
		t1.start();  
		t2.start(); 
	
		
	}
}