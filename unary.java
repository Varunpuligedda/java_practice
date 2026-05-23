class unary{ //unary operaters
    public static void main(String arrg [])
    {
        int a = +10;
        int b = -10;
        int c = +10;
        int d = -10;

        System.out.println(-a);
         System.out.println(-b);
          System.out.println(+c);
           System.out.println(+d);


        System.out.println("increment operaters"); //increment operaters
            int x = 100;
            System.out.println(x++);
            System.out.println(x);
            System.out.println(++x);
            System.out.println(++x);
        
        System.out.println("decriment operaters"); //decriment operaters
            short y = 200;
            System.out.println(y--);
            System.out.println(y);
            System.out.println(--y);
            System.out.println(--y);

        // unary not operater
        System.out.println("unary not operater"); //used to convert the boolean function
            boolean z = true;
            System.out.println(z);
            System.out.println("using not operater = " + !z);


    }
}