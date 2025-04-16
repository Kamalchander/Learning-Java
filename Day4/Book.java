package Day4;

public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void getSummary(){
        System.out.println("Book Title is : " + title);
        System.out.println("Book Author is : " + author);
        System.out.println("Book Pages are : " + pages);
        System.out.println("------------------------------------");
    }
    public static void main (String[] args){
        Book bk1 = new Book("Demo","Demo",200);
        Book bk2 = new Book("Demo2","Demo2",300);

        bk1.getSummary();
        bk2.getSummary();
    }

}
