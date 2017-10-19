import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class LibrarySystem {
	static String BookName="";
	static String BookTotal="";
	static String BookCn="";
	static int AnsT=0;
	
	
    static List<String> Booklist = new ArrayList<String>();
    static Scanner input = new Scanner( System.in );
    public static  void add()
    {
			System.out.println("Add A Book  name and total number......");			        
			BookName=input.next().toString();
			BookTotal=input.next().toString();
			Booklist.add(BookName);
			Booklist.add(BookTotal);			       
     
    }
    public static void show()
    {
        for(int i=0;i<Booklist.size();i++) {
         
        	BookName=Booklist.get(0);
        	BookTotal=Booklist.get(1);
                   
        }
        System.out.println("Name=   "+BookName+"   Total Number of book = "+BookTotal+" ");
        
    }
    
    
    public static void Borrow()
    {
    	 System.out.println("How many books you want to borrow ? ");
        for(int i=0;i<Booklist.size();i++) {
             
        	BookName=Booklist.get(0);
        	BookTotal=Booklist.get(1);
                         
        }
        Booklist.remove(BookName);
        Booklist.remove(BookTotal);
        BookCn=input.next().toString();
        AnsT=Integer.parseInt(BookTotal)-Integer.parseInt(BookCn);
        BookTotal=Integer.toString(AnsT);
        Booklist.add(BookName);
        Booklist.add(BookTotal);
        
    }
    
    public static void ReturnBook()
    {
    	 System.out.println("How many books you want to Return ? ");
        for(int i=0;i<Booklist.size();i++) {
             
        	BookName=Booklist.get(0);
        	BookTotal=Booklist.get(1);
                         
        }
        Booklist.remove(BookName);
        Booklist.remove(BookTotal);
        BookCn=input.next().toString();
        AnsT=Integer.parseInt(BookTotal)+Integer.parseInt(BookCn);
        BookTotal=Integer.toString(AnsT);
        Booklist.add(BookName);
        Booklist.add(BookTotal);
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Library System");
        System.out.println("----------------\n");
            
        char selection;
           Scanner input = new Scanner( System.in );
           do
               {
                   //display menu
                   System.out.println("\n--------------");
                   System.out.println("Main Menu\n");
                   System.out.println("1. Add A Book ");
                   System.out.println("2. Stock Details");
                   System.out.println("3. Return Book ");
                   System.out.println("4. Borrow Book");

                   //selection results
                   selection = input.next().charAt(0);

                   switch(selection){
                   case '1':
                       add();
                       break;
                   case '2':
                       show();
                       break;
                   case '3':
                	   ReturnBook();
                       break;
                   case '4':
                	   Borrow();
                       break;
                   default:
                       System.out.println("4");
               }//end Switch   

        }while( selection != 4);//end do

        }//end main


       

}