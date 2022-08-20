import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("1.Register \n2.Exit");
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();

        if(choice ==1) {
            BankAccount b = new BankAccount();
            b.register();
            while (true) {
                Scanner lg = new Scanner(System.in);
                System.out.println("\n1.Login \n2.Exit");
                System.out.print("Enter Your Choice : ");
                int chc = sc.nextInt();
                if (chc == 1) {
                    if (b.login()) {
                        System.out.println("Welcome back " + b.name);
                        boolean isFinished = false;

                        Operations op = new Operations();
                        Scanner in = new Scanner(System.in);

                            while (true) {
                                System.out.println("1.Transaction History\n2.Withdraw Amount\n3.Deposit Amount\n4.Transfer\n5.Quit");
                                System.out.print("Please Enter Your Choice : ");
                                int ch = in.nextInt();
                                if (ch == 1) {
                                    op.viewMiniStatement();

                                } else if (ch == 2) {
                                    System.out.print("Enter Amount To Withdraw : ");
                                    double withdrawAmount = in.nextDouble();
                                    op.withdrawAmount(withdrawAmount);

                                } else if (ch == 3) {
                                    System.out.print("Enter Amount to Deposit : ");
                                    double depositAmount = in.nextDouble();//5000
                                    op.depositAmount(depositAmount);


                                } else if (ch == 4) {
                                    op.transfer();

                                } else if (ch == 5) {
                                    System.out.println("Collect your ATM Card\nThank you for using ATM Machine!!");
                                    System.exit(0);
                                } else {
                                    System.out.println("Please Enter Correct Choice");
                                }
                            }
                        }
                    }
                }
            }
        }
    }


