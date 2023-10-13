import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentEvaluationTest {
    @Test
    public void testInvalidInput() {
        assertEquals("Input không hợp lệ", StudentEvaluation.evaluateStudent(5.0f, true));
    }

    @Test
    public void testExcellentStudent() {
        assertEquals("Sinh viên xuất sắc", StudentEvaluation.evaluateStudent(3.7f, true));
    }

    @Test
    public void testGoodStudent() {
        assertEquals("Sinh viên giỏi", StudentEvaluation.evaluateStudent(3.3f,true));
    }

    @Test
    public void testAcademicWarning() {
        assertEquals("Cảnh cáo học vụ", StudentEvaluation.evaluateStudent(1.5f, true));
    }

    @Test
    public void testNoTitle() {
        assertEquals("Không có danh hiệu", StudentEvaluation.evaluateStudent(2.7f, false));
    }
}