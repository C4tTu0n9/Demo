/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static String mySolve(String s) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";

        //Pattern.CASE_INSENSITIVE cho phép khớp mẫu mà không phân biệt chữ hoa/thường.
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        /*
        * Đọc từng câu đầu vào.
        Tạo một Matcher để tìm kiếm các từ trùng lặp.
        Với mỗi kết quả khớp, thay thế toàn bộ chuỗi khớp (m.group()) bằng từ đầu tiên tìm thấy (m.group(1)).
        In ra câu đã được sửa đổi.
        * */
        Matcher m = p.matcher(s);

        // Check for subsequences of input that match the compiled pattern
        while (m.find()) {
            //m.group(): Đại diện cho toàn bộ chuỗi khớp (từ lặp lại và các lần lặp của nó).
            //m.group(1): Đại diện cho nhóm bắt đầu đầu tiên, là lần xuất hiện đầu tiên của từ.
            s = s.replaceAll(m.group(), m.group(1));
        }

        // Prints the modified sentence.
        return s;
    }
}
