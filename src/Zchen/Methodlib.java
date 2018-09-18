package Zchen;

public class Methodlib {

    public static String dateStr(String input)
    {
        String output = "";
        for (int i =0; i < input.length();i++)
        {
            if(input.charAt(i) == '/')
            {
                output = output + "-";
            }
else
            {
                output = output + input.charAt(i);
            }
        }
        return output;
    }

    public static String cutOut(String mainStr, String subStr)
    {
        int x = mainStr.indexOf(subStr) + subStr.length();
        return  mainStr.substring(x);
    }

    public static boolean isFibonnaci( int num)
    {
        boolean check = false;
        int x = 0;
        for(int i = 0; i < Integer.MAX_VALUE; i++)
        {
            if(x+i == num)
            {
                check = true;
            }
        }
        return check;
    }

    public static void multiplicationTable(int base, int range)
    {
        for(int i = 0; i < range; i ++)
        {
            System.out.println(base * i);
        }
        System.out.println("Process end");
    }

    public static int sumUpTo(int input)
    {
        int output = 0;
        for(int i = 0; i < input; i ++)
        {
            output = output + i;
        }
        return output;
    }
}
