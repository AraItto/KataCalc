package com.company;

import java.io.IOException;

class ArabicCheck {
    boolean isArabicNorm(int n1, int n2) throws IOException {
        boolean isNorm;
        if (n1 >= 1 && n1 <= 10 && n2 >= 1 && n2 <= 10){
            isNorm = true;
        } else {
            isNorm = false;
        }
        if (!isNorm) {
            throw new IOException();
        }
        return isNorm;
    }
}
