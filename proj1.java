package mypackage;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class proj1 {

	
	public static void add() 
	 {
		File f1 = new File("C:\\Users\\AKANKSHA\\eclipse-workspace\\project04_arrayList" );
		System.out.println("Enter a file name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
      
        if(new File(f1,name).exists()){
            System.out.println("file already exist");
        }
        else {
            File f11 = new File(f1, name);
            f11.mkdir();
            if (new File(f1, name).exists()) {
                System.out.println("file added successfully");
            }
        }
	 }
	
	public static void delete() {
		
		File f2 = new File("C:\\Users\\AKANKSHA\\eclipse-workspace\\project04_arrayList" );
		System.out.println("Enter a file name");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
         boolean f12 = new File(f2, name1).exists();
         System.out.println(f2);
         if (f12 == true) {
             File f22 = new File(f2, name1);
             f22.delete();
             System.out.println("File successfully deleted");
         } else {
             System.out.println("file does not exist");
         }
		
	}
	
	public static void search() {
		File f3 = new File("C:\\Users\\AKANKSHA\\eclipse-workspace\\project04_arrayList" );
		System.out.println("Enter a keyword to search");
		Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();

        File arr1[] = f3.listFiles();
        
        for(int a=0;a<arr1.length;a++)
        {
        	if(arr1[a].getName().startsWith(search))
        	{
                System.out.println(arr1[a]);
            }
            
        else{
        	
           System.out.println("no file found");
              }
        }
	}
	
	public static void getAllFiles() {
		
		File folder = new File("C:\\Users\\AKANKSHA\\eclipse-workspace\\project04_arrayList" );
	
		
		File arr[] = folder.listFiles();
              Arrays.sort(arr);

              for(int i=0;i<arr.length;i++)
              {
                  System.out.println(arr[i]);
              }
                 }

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
System.out.println("************** WELCOME TO THE APPLICATION *****************");
System.out.println("**************    VIRTUAL KEY REPOSITORY      *************");
System.out.println("***********   Developed by Akanksha Keshari  **************");
System.out.println();
System.out.println("-----------------------------------------------------------");
System.out.println("");

System.out.println("****** Select any option to start ******");

while(true) {
	System.out.println("Enter 1: TO Get file names in ascending order");
	System.out.println("Enter 2: For Business Level Operation");
	System.out.println("Enter 3: Close the Application");

	System.out.println("Enter your choice");
Scanner sc = new Scanner(System.in);
int option = sc.nextInt();


   if(option == 1) {
	getAllFiles();
	System.out.println();
	}

   
   else if(option == 2) 
   {
	System.out.println("\n Select Any one to perform business levele operations");
	System.out.println("\nEnter 1 :To Add file");
	System.out.println("Enter 2: To Delete file");
	System.out.println("Enter 3: To Search file");
	System.out.println("Enter 4: To Go back");
	
	Scanner sc1 = new Scanner(System.in);
	int option1 = sc1.nextInt();
	
	switch(option1) {
	case 1:
		add();
		System.out.println();
		break;
		
	case 2:
		delete();
		System.out.println();
		break;
		
	case 3:
		search();
		System.out.println();
		break;
		
	case 4:
		System.out.println("back is successful");
		System.out.println();
		break;
	
	}
	
}

else if(option == 3)
{
	System.out.println("thank you for using the application");
	System.exit(option);
}

else {
	System.out.println("enter the valid input");
}

}


	}

}
