package JavaFeatures;

class Table 
{
	synchronized void printTable(int n)
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

class MyThread1 extends Thread
{
	Table object;
	MyThread1(Table object)
	{
		this.object = object;
	}
	
	public void run(){  
		object.printTable(5);  
	} 
	
}

class MyThread2 extends Thread
{
	Table object;
	MyThread2(Table object)
	{
		this.object = object;
	}
	
	public void run(){  
		object.printTable(10);  
		}  
}


class ObjectLevelLocking
{
	public static void main(String[] args) {
		
		Table table = new Table();
		MyThread1 t1=new MyThread1(table);  
		MyThread2 t2=new MyThread2(table);  
		t1.start();  
		t2.start();  
	
		
	}
}