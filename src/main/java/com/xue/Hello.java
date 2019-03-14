package com.xue;

public class Hello {
    public static void main(String[] args) {
        //  int 32bit short 16bit long 64bit byte 8bit
        //  char '字'
        //  float 32bit double 64bit
        //        new Person().hello();
        //  float weight = 66.5f; 如不加f/F會錯誤 因java看到小數點會自動以double儲存 故在數字後面加f
        Person p = new Person();
        p.hello();
        int age = 25;
        char c = '哈';
        byte b = 120;
        float d = 66.5f;
        double e = 99.9;
        boolean adult = true;
        String abc = "1234";
    }
}
