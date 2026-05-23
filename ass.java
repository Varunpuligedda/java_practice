//there are few ways 

//method 1
class ass1 {
    public static void main (String arrg [])
    {
        int a = 10;

        a += 20;
         System.out.println(a);

        a -= 10;
        System.out.println(a);

         a *= 2;
        System.out.println(a);

         a /= 5;
         System.out.println(a);

         a %= 5;
         System.out.println(a);

    }
}

//method 2

class ass2{  
    public static void main (String arrg [])
    {
         int a = 10;
         System.out.println(
            "initial a = " + a +
            "\nnext a become = " + (a+=20) +
            "\nnext a become = " + (a-=10) +
            "\nnext a become = " + (a*=2) +
            "\nnext a become = " + (a/=5) +
            "\nnext a become = " + (a%=2) 
         );
}
}

//method 3

class ass3{
    public static void main (String arrg [])
    {
       int a =10;
        a+=20;
        a-=10;
        a*=2;
        a/=5;
        a%=5;

        System.out.println(a);
    }
}