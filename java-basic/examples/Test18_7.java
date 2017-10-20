// ㄹe
//
// 

package bitcamp.java100;

public class Test18_7 {
     
    public static void main (String[] args) throws Exception { 
        //정규식
        String email = "1hong@test.com";
        System.out.println(email.matches("1hong@test.com"));

        System.out.println(email.matches(".+@.+\\..+")); //그냥DOT
        System.out.println(email.matches("^\\D.+@.+\\..+"));//숫자제외
        
        String str = "홍길동(hong@test.com),임꺽정(leem@test.com),"
                + "유관순(you@test.com),안중근(ann@test.com),윤봉길(yoon@test.com)";
        java.util.regex.Pattern pattern =
            java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        
        java.util.regex.Matcher matcher = pattern.matcher(str);
        
        int startIndex = 0;
        while(matcher.find(startIndex)) {
            String matchString = matcher.group();
            startIndex = matcher.start() + matchString.length();
            System.out.println(matchString);
        }
        

    }
}
























