package org.modules.stringReviseAllAbout;

public class StringBuilderClass {
    public static void main(String[] args) {
        // why came?
        /*
        suppose we have a empty string
        like
        string s = "";
        and we want to add the all alphabets of english to make a series
        like
        s = "a";
        "a+ + b
        s  = "ab"
        and so on
        here, each time there is a lot of memory wastage for creating new object
        time - o(n^2)

        // so we need a type which can be mutable(changeable) and each time all updates made to the same object and points to the reference instead of
        creating new object for each operation.


        There the "stringBuilder" class comes into the picture, (WHICH PROVIDES MUTABILITY)

         */



        String str = new String();// it's wasting the memory instead we can use stringBuilder object
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0;i<26;i++)
        {
            char alp = (char) ('A'+i);
//            str+=alp;
            sb.append(alp);
        }


        System.out.print(sb);

        // other methods of sb are

        StringBuilder sb2 = new StringBuilder("");
        sb2.append("1");
        sb2.append("2");
        sb2.append("3");
        System.out.println(sb2);

        sb2.delete(1, 2);
        System.out.println(sb2);

        sb2.deleteCharAt(1);
        sb2.reverse();


        System.out.println(sb2);
        sb2.replace(1 , 2, "raja mohanty");
        System.out.println(sb2);



    }
}
