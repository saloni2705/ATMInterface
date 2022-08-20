import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Operations implements ATMInterface {
        ATM atm=new ATM();
        Map<Double,String> ministmt=new HashMap<>();
        @Override
        public void viewBalance() {
            System.out.println("Available Balance is : "+atm.getBalance());
            System.out.println(" ");

        }

        @Override
        public void withdrawAmount(double withdrawAmount) {
            if(withdrawAmount%500==0) {
                if (withdrawAmount <= atm.getBalance()) {
                    ministmt.put(withdrawAmount, " Amount Withdrawn");
                    System.out.println("Collect the Cash " + withdrawAmount);
                    atm.setBalance(atm.getBalance() - withdrawAmount);
                    viewBalance();
                } else {
                    System.out.println("Insufficient Balance !!\n");
                }
            }
            else {
                System.out.println("Please enter the amount in multipal of 500\n");
            }

        }

        @Override
        public void depositAmount(double depositAmount) {
            ministmt.put(depositAmount," Amount Deposited");
            System.out.println(depositAmount+" Deposited Successfully !!");
            atm.setBalance(atm.getBalance()+depositAmount);
            viewBalance();
            System.out.println(" ");

        }

        @Override
        public void viewMiniStatement() {
            for(Map.Entry<Double,String> m:ministmt.entrySet()){
                System.out.println(m.getKey()+""+m.getValue()+"" );
                System.out.println(" ");
            }

        }

        @Override
        public void transfer(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Receipent's Name : ");
            String receipent = sc.nextLine();
            System.out.print("Enter Amount To Transfer : ");
            double amount = sc.nextInt();
            ministmt.put(amount, " Amount transfered " );

            try {
                if (atm.getBalance() >=amount){
                    if (amount<= 20000){
                        System.out.print(amount+" succesfully transfered to "+receipent +"\n");
                        atm.setBalance(atm.getBalance() - amount);
                        viewBalance();
                        System.out.println(" ");

                    }
                    else {
                        System.out.println("sorry the transaction limit is 20000");
                    }

                }

            }
            catch (Exception e){

            }

        }


    }
