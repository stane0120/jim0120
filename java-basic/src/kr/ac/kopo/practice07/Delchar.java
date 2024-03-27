package kr.ac.kopo.practice07;

public class Delchar {
    public static void main(String[] args) {
        String oriStr = "Hello World Java";
        char delChar = 'o';
        String result = removeChar(oriStr, delChar);
        System.out.println(result);
    }

    public static String removeChar(String oriStr, char delChar) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < oriStr.length(); i++) {
            if (oriStr.charAt(i) != delChar) {
                result.append(oriStr.charAt(i));
            }
        }
        return result.toString();
    }
}
