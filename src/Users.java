import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Users
{
    int age,amt,bal;String name;static int accNO=0;
    static Map<Integer,Integer> m = new HashMap<>();
    static Map<Integer,Integer> giftCard = new HashMap<>();
    static List<String>l = new ArrayList<>();

    Users(){};
    Users(String name,int age)
    {
        this.name = name;
        accNO = accNO+1;
        this.age = age;
        String rec = name+" "+age;
        l.add(rec);
        m.put(accNO,0);
    }
    public void userDetails(Users u)
    {
        System.out.println(u.name +" "+u.age +" "+accNO +" "+u.bal);
        System.out.println("your account is successfully added");
    }
    public static void deposit(int accNO,int value)
    {
        int tot = m.get(accNO)+value;
        m.put(accNO,tot);
        System.out.println("your amount is successfully deposited ");
        System.out.println("user name and age");
        System.out.println(l.get(accNO-1));
        System.out.println("balance amount = "+m.get(accNO));
    }
    public void withdraw(int accNO,int value)
    {
        if(m.get(accNO)<value)
            System.out.println("you don't have sufficient amount for in your account");
        else
        {
            int reductionAmount = m.get(accNO)-value;
            m.put(accNO,reductionAmount);
            System.out.println("successfully withdraw");
            System.out.println("user name and age");
            System.out.println(l.get(accNO-1));
            System.out.println("balance amount = "+m.get(accNO));
        }
    }
    public void getBalance(int accNO)
    {
        System.out.println("user name and age");
        System.out.println(l.get(accNO-1));
        System.out.println("balance amount = "+m.get(accNO));
    }
    public void createGiftCard(int accNO,int GCAmount)
    {
        if(m.get(accNO)<GCAmount)
            System.out.println("you can't create gift card .because you don't have sufficient amount for in your amount");
        else
        {
            giftCard.put(accNO,GCAmount);
            m.put(accNO,m.get(accNO)-GCAmount);
            System.out.println("successfully created gift card");
        }
    }
    public void getGiftCardBalance(int accNO)
    {
        System.out.println("user name and age");
        System.out.println(l.get(accNO-1));
        System.out.println("balance amount = "+giftCard.get(accNO));
    }
}