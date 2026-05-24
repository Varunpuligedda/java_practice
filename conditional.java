//this the first conditional statement of java 
//used for the single condition


/**if the statement is true the block of code written will be executed 
   if the condition is not true the code will be skipped and out from the block

   */


class condi_if
{
    public static void main(String args [])
    {
        int a = 20;
        
        if (a>=15){
            System.out.println("yes... 20 is grater than 15" + a);
        }

       
    }
}


/** second conditional statement  (if_else)
 * if the conditon is true the block of code or statement will be executed
 * if not else , which means the block of code or statement written in the else will be executed
*/

class condi_if_else { //if first conditon true case
    public static void main(String args[])
    {
        int a = 24;

        if(a == 24)
            System.out.println("this num is equal to 24 ");
        else
            System.out.println("this num is not equal to 24 ");

        
    }
}

class condi_if_else2{ //if first conditon false case
    public static void main(String args[])
    {
        int a = 24;

        if(a != 24)
            System.out.println("this num is equal to 24 ");
        else
            System.out.println("this num is not equal to 24 ");

        
    }
}

/**this is the 3rd conditional statement in java
 * in this we have if statement inside one if_else statement 
 * it depends on the conditions or logics users need to build for there project
 * second conditon depends on previous one
 */

class nested_if 
{
    public static void main(String args [])
    {
        int a = 15;

        if(a >= 18)
        {
            System.out.println("person is eligiable to vote ");
        
            if(a == 18)
            {
               System.out.println("person on boarder to vote");
            }
        }
             if(a < 18)
            {
                System.out.println("person is not eligiable to vote");
            }
    }
}

/**the next conditional statement is if_else_ladder
 * in this we will use if condition inside another if else / else if conditon
 * used to check one condtion upon another condition
 * chooseing one condition from many
 */

class ladder{
    public static void main(String args [])
    {
        int a = 40;

        if( a >= 90)
        {
            System.out.println("grade is A , good luck");

        }
        else if ( a >=70 )
            System.out.println("grade is B , try to get A next time");

            else if (a >= 50)
            System.out.println("grade is C , try to get B next time");

            else if(a >= 40)
            System.out.println("grade is D , try to get C next time");

            else if(a < 40)
            System.out.println("grade is F , student failed");


    }
}

/**the next concept is switch case control statements in java 
 *  switch checks the value of expression
 * case matches values break stops execution default runs if no case matches
 */

class alter {
    public static void main(String args [])
    {
        int day = 4;

        System.out.println("Days in a week are represented");

        switch(day)
        {
            case 1 :
                System.out.println("its monday");
                break;

            case 2 :
                System.out.println("its tuesday");
                break;

            case 3 :
                System.out.println("its wednesday");
                break;

            case 4 :
                System.out.println("its thursday");
                break;

            case 5 :
                System.out.println("its friday");
                break;

            case 6 :
                System.out.println("its saturday");
                break;

            default:
                System.out.println("its sunday");
            
        }
    }
}