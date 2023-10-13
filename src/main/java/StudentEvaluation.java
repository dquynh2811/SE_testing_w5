public class StudentEvaluation {

    public static String evaluateStudent(float GPA, boolean allGradesAboveC) {
        if (GPA > 4.0 || GPA < 0) {
            return "Input không hợp lệ";
        }
        if (allGradesAboveC) {
            if (GPA >= 3.6) {
                return "Sinh viên xuất sắc";
            } else if (GPA >= 3.2) {
                return "Sinh viên giỏi";
            }
        }
        if (GPA < 1.6) {
            return "Cảnh cáo học vụ";
        }
        return "Không có danh hiệu";
    }
}