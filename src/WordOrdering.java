import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WordOrdering
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String alphabet=in.nextLine();
        int n=in.nextInt();

        in.nextLine();
        HashMap<String, String> map=new HashMap<>();
        String m;
        for (int i=0;i<n;i++)
        {
            m=in.nextLine();
            Character chr=m.charAt(0);
            map.put(chr+"",m);
        }

        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<alphabet.length();i++)
        {
            if(map.containsKey(Character.toString(Character.toUpperCase(alphabet.charAt(i)))))
            {
                ans.add(map.get(Character.toString(Character.toUpperCase(alphabet.charAt(i)))));
            }
            if(map.containsKey(Character.toString(alphabet.charAt(i))))
            {
                ans.add(map.get(Character.toString(alphabet.charAt(i))));
            }
        }

        for(String str:ans)
        {
            System.out.println(str);
        }

    }
}
