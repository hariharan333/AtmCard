import java.util.*;
import java.util.Scanner;

public class ATM{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.add account");
            System.out.println("2.deposit");
            System.out.println("3.withdraw");
            System.out.println("4.balance");
            System.out.println("5.create gift card");
            System.out.println("6.view gift card balance");
            System.out.println("7.exit");
            ch = scan.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("enter your details");
                    System.out.println("enter your name");
                    String name = scan.next();
                    System.out.println("enter your age");
                    int age = scan.nextInt();
                    Users u = new Users(name,age);
                    u.userDetails(u);
                    break;
                }
                case 2:
                {
                    Users u = new Users();
                    System.out.println("enter your account number");
                    int accNo = scan.nextInt();
                    System.out.println("enter your amount");
                    int amt = scan.nextInt();
                    u.deposit(accNo,amt);
                    break;
                }
                case 3:
                {
                    Users u = new Users();
                    System.out.println("enter your account number");
                    int accNo = scan.nextInt();
                    System.out.println("enter your withdraw amount");
                    int amt = scan.nextInt();
                    u.withdraw(accNo,amt);
                    break;
                }
                case 4:
                {
                    Users u = new Users();
                    System.out.println("enter your account number");
                    int accNo = scan.nextInt();
                    System.out.println("enter your withdraw amount");
                    u.getBalance(accNo);
                    break;
                }
                case 5:
                {
                    Users u = new Users();
                    System.out.println("enter your account number");
                    int accNo = scan.nextInt();
                    System.out.println("enter gift card amount");
                    int gc = scan.nextInt();
                    u.createGiftCard(accNo,gc);
                    break;
                }
                case 6:
                {
                    Users u = new Users();
                    System.out.println("enter your account number");
                    int accNo = scan.nextInt();
                    u.getGiftCardBalance(accNo);
                    break;
                }
            }
        }while(ch!=7);
    }



}
