package com.company;

public class Main {

    public static void main(String[] args) {

//	    calculate(6,10,0.2f);
//	    isPalidrom("abc");
        Integer []a = {9,9, 2, 2, 3, 4, 4};
        displayPattern(20);
        clump(a);
    }

    public static void calculate(int a, int b, float c){
        float x = a*b/c;
        System.out.println("x = " + x);
        calculteDigit(235230);
    }

    public static void calculteDigit(int a){
        int sum = 0;
        while (a != 0) {
            int temp = a%10;
            sum += temp;
            a = a / 10;
        }
        System.out.println(sum);
    }

    public static void stringLength(String a, String b){

        //sum length of 2 strings
        int sum = a.length() + b.length();
        System.out.println("Sum of length of strings is: " + sum);

        //compare 2 string
        if(a.compareTo(b) < 0){
            System.out.println("String a is after b in alphabetic order");
        }

        //Capitalize the first letter of 2 strings
        a = a.substring(0,1) + a.substring(1,a.length()-1);
        b = a.substring(0,1) + b.substring(1,b.length()-1);
        System.out.println(a + " " + b);
    }

    public static void isPalidrom(String string){

        String inv = "";

        for(int i = string.length() - 1; i >= 0; --i){
            inv += string.charAt(i);
        }

        if(string.equals(inv)){
            System.out.println(string + " is palindrome ");
        } else {
            System.out.println(string + "is not palindrome");
        }
    }

    public static void startAndEndSubstring(String string, int start, int end){
        if(start > end && !(start+end >=2)){
            System.out.println("Indices is not ok");
        }
        string.substring(start, end);
        System.out.println(string);
    }

    public static void displayPattern(int n){
        String []items = {"=", "_", "/", "\\"};

        int itr = 1;
        for(int i = 0; i < n; ++i){

            for(int j = i; j < n-1; ++j){
                System.out.print(items[0]);
            }

            System.out.print(items[2]);

            for(int k = 0; k<itr; ++k){
                System.out.print(items[1]);
            }

            itr +=2;

            System.out.print(items[3]);

            for(int j = i; j < n-1; ++j){
                System.out.print(items[0]);
            }

            System.out.println();

        }
    }

    static public void clump(Integer []a){
        int count = 0;
        if(a[0].equals(a[1])) {
            count++;
        }
        for(int i = 2; i < a.length-1; ++i){
            if(a[i].equals(a[i+1])){
                count++;
            }
        }
        System.out.println("No of clump is " + count);
    }
}
