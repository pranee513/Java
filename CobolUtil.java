package com.jc;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * Utility class to convert Cobol values to Java equivalents
 */
public class CobolUtil {

    /**
     * Parses the input for the given COBOL data type
     *
     * @param cValue Value to parse
     * @param cType Cobol data type
     * @return Parse value
     *
     * @throws ParseException if unable to parse the input value
     */
    public static String convertToDecimal(String cValue, String cType) throws ParseException {

        String pattern = "";
        boolean suppress = false;
        boolean pConsumed = false;
        boolean signed = false;
        boolean decimal = false;
        int dIndex = 0;

        char[] array = cType.toCharArray();
        char c;

        for (int i = 0, max = array.length; i < max; i++) {

            c = array[i];
            switch (c) {
                case 'S':
                    signed = true;
                    break;
                case '9':
                    suppress = false;
                    pattern += "0";
                    if (decimal) {
                        dIndex++;
                    }
                    break;
                case 'Z':
                    suppress = true;
                    pattern += "#";
                    break;
                case 'V':
                    decimal = true;
                case 'P':
                    if (!pConsumed) {
                        pattern += ".";
                        pConsumed = true;
                    }
                    break;
                case '(':
                    String count = "" + array[++i];
                    while ((c = array[++i]) != ')') {
                        count += c;
                    }

                    final int totalDigits = Integer.parseInt(count) - 1;
                    for (int j = 0; j < totalDigits; j++) {
                        pattern += suppress ? "#" : "0";
                    }

                    break;
                case '.':
                    if (i < max - 1) {
                        pattern += ".";
                    }
                    break;
            }
        }

        if (dIndex > 0 && !cValue.startsWith(".") && !cValue.endsWith(".") && !cValue.contains(".")) {
            cValue = ((double) (Integer.parseInt(cValue)) / Math.pow(10, dIndex)) + "";
        }

        final DecimalFormat formatter = new DecimalFormat(pattern);
        if (signed) {
            formatter.setPositivePrefix("+");
            formatter.setNegativePrefix("-");

            if (!cValue.startsWith("+") && !cValue.startsWith("-")) {
                cValue = ("+" + cValue);
            }
        }

        return formatter.format(formatter.parse(cValue).doubleValue());
    }

    public static String getCobolType(final String cValue) {

        String cType = "";
        char[] array = cValue.toCharArray();
        char c;

        for (int i = 0, max = array.length; i < max; i++) {
            c = array[i];
            if (Character.isDigit(c)) {
                cType += "9";
            } else if (c == '.') {
                cType += "V";
            } else if (c == '+' || c == '-') {
                cType = "S";
            }
        }

        return cType;
    }

}
