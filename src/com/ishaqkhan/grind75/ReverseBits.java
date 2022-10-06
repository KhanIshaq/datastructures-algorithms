package com.ishaqkhan.grind75;

public class ReverseBits {

    public static void main(String[] args) {

    }
    public static int reverseBits(int n) {
        int res = 0;

        for(int i = 0;i<32; i++) {
            int bit = (n >> i) & 1;
            res = res | (bit << (31-i));
        }
        return res;
    }
}
