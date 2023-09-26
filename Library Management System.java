import java.util.Scanner;
public class project{
    public static void public static void main(String[] args) {
        System.out.println(**************Library Management System**************);
        System.out.println("Press 1 to add Book");
        System.out.println("Press 2 to issue a book");
        System.out.println("Press 3 to return a book");
        System.out.println("Press 4 to print complete details");
        System.out.println("Press 5 to exit");
    }
}
class Library
{
    String str,b,date;
    int a,c;
    void add()
    {
        System.out.println("Enter book Name.Prize and Book_no" );
        Scanner obj2=new Scanner (System.in);
        String str=obj2.nextLine();
        float price=obj2.nextInt();
        int bookno=obj2.nextInt();
        System.out.println("your details is "+ str + price + bookno);      
    }
    void iss()
    {
        Scanner obj3=new Scanner (System.in);
        System.out.println("Book Name");
        str=obj3.nextLine();
        System.out.println("Book_id");
        a=obj3.nextInt();
        System.out.println("issue date");
        b=obj3.nextLine();
        System.out.println("total number of book Issued");
        c=obj3.nextInt();
        System.out.println("Return book date");
        date=obj3.nextLine();
    }
    int getid()
    {
        return a;
    }
    void ret()
    {
        System.out.println("Enter Student _name & book_id");
        Scanner c =new Scanner(System.in);
        String name= c.nextLine();
        int bookid=c.nextInt();
        if(a==bookid)
        {
            System.out.println("Total details");
            System.out.println("Book Name::"+str );
            System.out.println("Book id ::"+a);
            System.out.println("issue date"+b);
            System.out.println("total number of book Issued::"+c);
            System.out.println("Book Return date :: "=date);
        }
        else
        {
            System.out.println("weong id,pls enter correct id");
        }
    }
    void detail()
}