package test.jour10;

public class testascii {
    public static void main(String[] args) {
        int i = 3;
        String someNum = "123";
        someNum += "                 ".substring(0, i);
        System.out.println(someNum + 's');
    }
}
