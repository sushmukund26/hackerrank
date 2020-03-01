import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
