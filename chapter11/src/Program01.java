import com.boda.xy.Book;

void main() {
    Book book = new Book(101,"Java编程思想","Bruce Echel",72,"机械工业出版社");
    Book book2 = new Book(105,"Java Web编程技术","沈泽刚",63.8,"清华大学出版社");
    IO.println(book.id());
    IO.println(book.name());
    IO.println(book.press());
    IO.println(book.compareTo(book2));
}