package Strings;

public class WhiteSpace {

    public static String whitespace(String string) {
        return string
                .chars()
                //.filter(Character::isLetter)
                .filter(chartt -> !Character.isWhitespace(chartt))
                .collect(StringBuffer::new, StringBuffer::appendCodePoint, StringBuffer::append).toString();
    }

    public static void main(String[] args) {
        String string = "  abc            scba   ";
        System.out.println(whitespace(string));
    }

    //strip uses unicode <--- use this
    //trim uses Character.isWhitespace()
}
