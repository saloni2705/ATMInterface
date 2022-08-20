import java.util.Scanner;

 public class BankAccount {
    String name;
    String username;
    String password;
    String accountno;

    public void register(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Your Username : ");
        this.username = sc.nextLine();
        System.out.print("Enter Your Account Number : ");
        this.accountno = sc.nextLine();
        System.out.print("Enter Your Password : ");
        this.password = sc.nextLine();

    }
    public boolean login(){
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while (!isLogin){
            System.out.print("Enter User Name : ");
            String Username = sc.nextLine();
            if (Username.equals(username)){
                while (!isLogin){
                    System.out.print("Enter Your Password : ");
                    String Password = sc.nextLine();
                    if (Password.equals(password)){
                        System.out.println("Login Successfull\n");
                        isLogin = true;
                    }
                    else {
                        System.out.println("Incorrect Password");

                    }

                }

            }
            else {
                System.out.println("Username Not Found");
            }
        }
        return isLogin;
    }
 }
