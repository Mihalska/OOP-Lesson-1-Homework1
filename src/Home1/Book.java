package Home1;

public class Book {
    static  void show(String t, String a, String c) {
        System.out.println("Назва книги: " + t + ", автором якої є  " + a +  ". Ця книга про " +c);
    }
    public static void main(String[] args) {
        Title t = new Title() ;
        Author a = new Author();
        Content c = new Content() ;
         show(t.title, a.author,c.content) ;
        }




}
