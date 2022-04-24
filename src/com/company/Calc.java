package com.company;

import java.io.IOException;

class Calc {
    String calculator(String userInput) throws IOException {

        int res = 0;
        String[] arrStr = userInput.split(" ", 3);
        if (arrStr.length > 3 || arrStr.length < 3) {
            throw new IOException();
        }
        String n1 = arrStr[0];
        String n2 = arrStr[2];
        if ((arrStr[0].contains("I") || arrStr[0].contains("V") || arrStr[0].contains("X")) &
                (arrStr[2].contains("I") || arrStr[2].contains("V") || arrStr[2].contains("X"))) {
            RomanNumbers romanNumber1 = RomanNumbers.valueOf(arrStr[0]);

            arrStr[0] = romanNumber1.getRomanToArabic();
            RomanNumbers romanNumber2 = RomanNumbers.valueOf(arrStr[2]);

            arrStr[2] = romanNumber2.getRomanToArabic();
        }
        int num1 = Integer.parseInt(arrStr[0]);
        int num2 = Integer.parseInt(arrStr[2]);

        ArabicCheck check = new ArabicCheck();

        check.isArabicNorm(num1, num2);

        String op = arrStr[1];
        switch (op) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            default:
                throw new IOException();
        }

        if ((n1.contains("I") || n1.contains("V") || n1.contains("X")) &
                (n2.contains("I") || n2.contains("V") || n2.contains("X"))) {
            ArabicToRoman resString = new ArabicToRoman();
            return resString.getArabicToRoman(res);
        }
        String resString = res + "";

        return resString;
    }
}
