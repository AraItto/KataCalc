package com.company;

import java.io.IOException;

class ArabicToRoman {
    String getArabicToRoman (int value) throws IOException {
        int firstSym = value/10;
        int lastSym = value%10;
        if ((lastSym <= 0)&(firstSym <= 0)) {
            throw new IOException();
        }
        String[] firstSyms = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String[] lastSyms = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String firstSymRom = firstSyms[firstSym];
        String lastSymRom = lastSyms[lastSym];
        return firstSymRom+lastSymRom;
    }
}
