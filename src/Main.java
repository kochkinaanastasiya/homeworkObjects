public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Настя", "Кочкина");
        Author author2 = new Author("Kristina", "Li");

        Book book1;
        book1 = new Book("Приключения котика", author1, 2025);
        System.out.println(book1.getYearPublication());
        Book book2;
        book2 = new Book("Your world", author2, 2030);

        book1.setYearPublication(2023);
        System.out.println(book1.getYearPublication());
        System.out.println(book1.toString());
        System.out.println(book1.equals(book2));
        System.out.println(author1.equals(author2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());


       }

}