package review7;

public class Store {

    public static void main(String[] args) {

        System.out.println(Book.type); //right way accessing static variables - By the class name

        Book book1=new Book();
        book1.title="Nightwork";
        book1.author="Irwin Shaw";
        book1.year=1975;
        book1.price=45;
        book1.type="Hard Copy"; //not right way of accessing static variable
        //book1.page=298; CE: variable does not exist in the Book class

        book1.read();
        book1.changePrice(41);
        double total=book1.totalWithTax(0.1);
        System.out.println("The price with taxes ="+total);

        // new Magazine(); - we do not have Magazine class - so we cannot create an Object of it

        Book book2=new Book();
        book2.title="Atomic Habits";
        book2.author="James Clear";
        book2.year=2010;
        book2.price=12.50;
        System.out.println(book2.type); //now all books became hard copies

    }
}
