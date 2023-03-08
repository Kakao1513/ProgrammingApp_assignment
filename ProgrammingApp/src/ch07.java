import java.util.Scanner;
public class ch07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. 8글자 이상입니다.\n" + "2. 영문자와 숫자만 사용 가능합니다. \n" + "3. 숫자는2개 이상이어야 합니다.\n" + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
        String s = input.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("적절한 패스워드입니다: " + s);
        } else {
            System.out.println("패스워드 규칙에 어긋납니다: " + s);
        }
    }

    public static boolean is_Valid_Password(String s) {
        if (s.length() < 8) {
            return false;
        }
        int count = 0;
        char[] ch_Arr = s.toCharArray();
        for (char c : ch_Arr) {
            if ((Character.toUpperCase(c) >= 'A' && Character.toUpperCase(c) <= 'Z') || (c >= '0' && c <= '9')) {
                if (c >= '0' && c <= '9') {
                    count++;
                }
            } else {
                return false;
            }
        }
        return count >= 2;
    }
}
