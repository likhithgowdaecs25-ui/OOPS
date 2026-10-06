class Book{
   int bookID;
   String title;
   String author;
   double price;
   
   static int count=0;
   Book(int id,String t,String a,double p){
    bookID=id;
    title=t;
    author=a;
    price=p;
    count++;
   }
   void display(){
    System.out.println("Book ID:"+bookID);
    System.out.println("Title:"+title);
    System.out.println("Author:"+author);
    System.out.println("Price:"+price);
    }
    void search(int id){
     if(bookID==id)
        System.out.println("Book Found:"+title);
     else
        System.out.println("Book not found");
     }
     void search(String t){
      if(title.equalsIgnoreCase(t))
        System.out.println("Book Found:"+title);
     else
        System.out.println("Book not found");
     }
     Book costlier(Book b){
     if(price>b.price)
       return this;
     else
       return b;
     }
    }
    public class Main{
      public static void main(String[] args){
        Book B1 = new Book(101,"JAva","James",500);
        Book B2 = new Book(102,"python","guido",400);
        Book B3 = new Book(103,"Data Structures","Mark Allen",650);
        B1.display();
        System.out.println();
        B2.display();
        System.out.println();
        B3.display();
        System.out.println();
        B1.search(101);
        B2.search("python");
        Book expensive=B1.costlier(B3);
        System.out.println("\nCostlier Book:");
        expensive.display();
        System.out.println("\nTotal books created:"+Book.count);
        }
        }
