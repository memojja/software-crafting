package roman_numerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralConverterShould {

    @ParameterizedTest
    @CsvSource(value = {
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "10, X",
            "18, XVIII", "30, XXX",
            "40, XL",
            "50, L",
            "76, LXXVI", "90, XC",
            "100, C",
            "400, CD", "493, CDXCIII", "500, D",
            "648, DCXLVIII", "900, CM",
            "1000, M",
            "2497, MMCDXCVII", "2748, MMDCCXLVIII", "3949, MMMCMXLIX",
    }, delimiter = ',')
    void convert_arabic_numbers_into_roman_numerals(int arabic, String roman) {
        //given
        //when
        //then
        Assertions.assertEquals(RomanNumeralConverter.romanFor(arabic),roman);
    }
}
