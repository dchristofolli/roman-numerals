package com.dchristofolli.romannumerals;

public class RomanNumberConverter {
    public String converter(int decimal) {
        if (decimal == 0)
            return "";
        else if (decimal <= 3)
            return converter(decimal - 1) + "I";
        else if (decimal == 4)
            return "IV";
        else if (decimal <= 8)
            return "V" + converter(decimal - 5);
        else if (decimal == 9)
            return "IX";
        else if (decimal <= 39)
            return "X" + converter(decimal - 10);
        else return null;
    }
}
