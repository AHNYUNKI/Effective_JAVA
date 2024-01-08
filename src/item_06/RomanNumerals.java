package item_06;

import java.util.regex.Pattern;

/**
 * 값비싼 객체를 재사용해 성능을 개선한다.
 */
public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?c{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
