import java.util.*;

public class Main {
    
    public static void main(String args[]){
        
        Project project = new  Project();
        project.point();
    }    
}


 class  Project{
	
	 
	public void point() {
	try {	
		int code;
		String name,employee,type;
		Scanner sc=new Scanner(System.in);
		List<Peripheral> in = new ArrayList<Peripheral>();
	    Iterator<Peripheral>inn = in.iterator();
		int i=6;
		
		do {
			System.out.println("1. Add");
			System.out.println("2. View ");
			System.out.println("3. Edit");
			System.out.println("4. Delete");
			System.out.println("5. Report");
			System.out.println("6. Exit");
			System.out.print("Enter Your Choice : ");
	         i=sc.nextInt();
			
			
			switch(i) {
	
			case 1:  
				
				System.out.println("Enter Barcode : ");
				code=sc.nextInt();
				System.out.println("Enter Name Of the Device : ");
				name=sc.next();
				System.out.println("Enter Employee Name : ");
				employee=sc.next();
				System.out.println("Enter Peripheral Type  :");
				type=sc.next();
						
	      
	        Peripheral n = new Peripheral(code,name,employee,type);
	        in.add(n);
				
				break;
			case 2:
			
				System.out.println("---------------------------------------------------");
				
				inn=in.iterator();
				
				for(Iterator<Peripheral> cir;inn.hasNext();) {
					System.out.println(inn.next().ShowString());				}
				System.out.println("---------------------------------------------------");
				break;
			case 3:
				
				boolean booling = false;
				
				
				
				System.out.println("Enter The Bar Code :");
				code=sc.nextInt();
				for( ListIterator<Peripheral> function = in.listIterator();function.hasNext();) {
					Peripheral p = function.next();
					if(p.Codes()==code) {
						
						System.out.println("Enter Barcode : ");
						code=sc.nextInt();
						System.out.println("Enter Name Of the Device : ");
						name=sc.next();
						System.out.println("Enter Employee Name : ");
						employee=sc.next();
						System.out.println("Enter Type Of Peripheral :");
						type=sc.next();
						
						function.set(new Peripheral(code,name,employee,type));
						booling = true;
						
						if(!booling) {
						    System.out.println("Not Found");
						    }else {
						        System.out.println("Success");
						        
					    }  

					}
				}
				
				break;
				
			case 4:
				
				inn = in.iterator();
				System.out.println("Enter The Code To Delete : ");
				code = sc.nextInt();
				boolean boolings =  false;
				for(Iterator<Peripheral> cir;inn.hasNext();) {
					Peripheral g = inn.next();
					if(g.Codes()==code) {
						inn.remove();
						boolings = true;
					}
				}
			
				
				if(!boolings) {
					System.out.println("The Code Didn't Match, Please Try Again!!!!");
				}else {
					System.out.println("It is Deleted Successfuly!!!!!!!!!!");
				}
				
				break;
				
			case 5:
				System.out.println("---------------------------------------------------");
				for(Iterator<Peripheral> cir;inn.hasNext();) {
					System.out.println(inn.next().ShowString());
				}
				System.out.println("---------------------------------------------------");
				break;
				
			case 6:
				System.out.println("===========================================");
				System.out.println("The Program is Finally Exit Thank You!!!!!");
				System.out.println("===========================================");
				break;
			
			}
		}while(i!=6);
	}catch(Exception e) {
		System.out.println("Please Enter Number Only");
	}
  }
}
	
class Peripheral extends Project{
	
	int c;
	String n,e,p;
	
	Peripheral(int c,String n,String e,String p){
		this.c = c;
		this.n = n ;
		this.e = e ;
		this.p = p ;
	}
	public int Codes() {
		return c;
	}
	
	
	public String ShowString() {
	
		return "Code Bar Number: "+c+"\n"+"Name of the device:"+n+"\n"+"Here is the Employee Name : "+e+"\n"+" Pheriperal : "+p;
	}
	Peripheral(){
		
	}

	
}

