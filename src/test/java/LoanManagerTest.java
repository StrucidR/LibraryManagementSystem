import org.example.Book;
import org.example.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LoanManagerTest {
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book book = null;
        LoanManager instance = null;
        instance.addBook(book);
        fail("It's just a test.");
    }

    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student student = null;
        LoanManager instance = null;
        instance.registerStudent(student);
        fail("It's just a test.");
    }

    @Test
    public void testLendBook() {
        System.out.println("lendBook");
        String bookId = "";
        String studentId = "";
        LoanManager instance = null;
        boolean expResult = false;
        boolean result = instance.lendBook(bookId, studentId);
        assertEquals(expResult, result);
        fail("It's just a test.");
    }
}
