package Example1;

public class A {

	
	public A()
	{
        //I want certain statement Excuted at time Of Object cration
		System.out.println("Object Is Craeted");
		System.out.println("i want excuted certain statement at time of object creation");	
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		
		//I want certain statement Excuted at time Of Object dead/killed
		System.out.println("i want excuted certain statement at time of object kill/death");
	    System.out.println("Object Is Dead"); 	
			
	}

}
