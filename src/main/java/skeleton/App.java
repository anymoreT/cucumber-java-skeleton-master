package skeleton;

import static org.junit.Assert.assertEquals;

public class App {
    public  static void main(String[] args){
//        String input = "jakarta.apache.org";
//        String pattern = "jakarta.apache.org";
//        String sub = "${server}";
        String input = "http://jakarta.apache.org/jmeter/index.html";
        String pattern = "jakarta.apache.org";
        String sub = "${server}";

        StringBuilder ret = new StringBuilder(input.length());
        int start = 0;
        int index = -1;
        final int length = pattern.length();
        while ((index = input.indexOf(pattern, start)) >= start) {
            ret.append(input.substring(start, index));
            ret.append(sub);
            start = index + length;
        }
        ret.append(input.substring(start));
        System.out.print( ret.toString());
    }
}
