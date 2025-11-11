import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class patternMatching {
    public static List<Integer> patternMatch(String text, String pattern){
        List<Integer> res = new ArrayList<>();
//        int textLen = text.length();
//        int patternLen = pattern.length();
//        int len = textLen - patternLen;
        for (int i = 0; i <= (text.length() - pattern.length()); i++) {
            String str = text.substring(i,pattern.length()+i);
            if(str.equals(pattern)){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String text = "AABAABDAABDYAABD";
        String pattern = "AABD";
        List<Integer> result = patternMatch(text,pattern);
        System.out.println("Pattern found at index: " + Arrays.toString(new List[]{result}));
    }
}
