package com.org.learnOOPS.termsToRemember.constructor;


class Game1
{
    public Game1()
    {
        System.out.println("Game1 Constructor");
    }

    public Game1(String name)
    {
        System.out.println("Game1 Constructor"+name);
    }
    public Game1(int pt1, int pt2)
    {
        System.out.println(pt1+pt2);
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Game1 g1 = new Game1();
        Game1 g2 = new Game1("Raj");
        Game1 g3 = new Game1(22,22);

        //As here we have Game1 class has more than one constructor with the same name but different in their parameter types and
        // order of the parameters, it's refers to constructor overloading .


        // ALWAYS REMEMBER: (IMP ...............)
        // During constructor overloading it only focus on parameters not even the modifiers we are using .
//          even if two constructs inside the same class have the same access specifier but if they same for parameter order and type, it is not acceptable.

    }
}
