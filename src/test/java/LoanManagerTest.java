import org.example.Book;
import org.example.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
public class LoanManagerTest {
private Student student;
private Book book1, book2;   
   @BeforeEach 
   void setup(){
    student = new Student("123", "John Doe");
    book1 = new Book("B001", "Effective Java", "Joshua Bloch");
    book2 = new Book("B002", "Clean Code", "Robert C. Martin");
}
}
