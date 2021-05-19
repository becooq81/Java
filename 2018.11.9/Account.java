import java.text.NumberFormat;
    public class Account
    {
        private NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        private final double RATE = 0.035; // interest rate of 3.5%
        
        private int acctNumber;
        private double balance;
        private String name;
        
        // set up the account by defining its owner, account number, and initial balance
        public Account (String owner, int account, double initial) {
            name = owner;
            acctNumber = account;
            balance = initial;
        }
        
        public Account(String own, int acc) {
            name = own;
            acctNumber = acc;
            balance = 0;
        }
        
        // validates the transaction, then deposists the specified amount into the account. Returns the new balance
        public double deposit (double amount) {
            if (amount < 0) //deposit value is negative 
            {
                System.out.println();
                System.out.println("Error: Deposit amount is invalid.");
                System.out.println(acctNumber + " " + fmt.format(amount));
            }
            else {
                balance = balance + amount;
            }
            return balance;
        }
        
        // validates the transaction, then withdraws the specified amount from the account. returns the new balance.
        public double withdraw (double amount, double fee) {
            amount += fee;
            if (amount < 0) //withdraw value is negative
            {
                System.out.println();
                System.out.println("Error: Withdraw amount is invalid.");
                System.out.println("Account: " + acctNumber);
                System.out.println("Requested: " + fmt.format(amount));
            }
            else if (amount > balance) //withdraw value exceeds balance
            {
                System.out.println();
                System.out.println("Error: Insufficient funds.");
                System.out.println("Account: " + acctNumber);
                System.out.println("Requested: " + fmt.format(amount));
                System.out.println("Available: " + fmt.format(balance));
            }
            else {
                balance = balance - amount;
            }
            return balance;
        }
            //adds interest to the account and returns the new balance.
        public double addInterest() {
            balance += (balance * RATE);
            return balance;
        }
        
        //returns the current balance of the account.
        public double getBalance() {
            return balance;
        }
        
        //returns the account number
        public int getAccountNumber() {
            return acctNumber;
        }
        
        //returns a one-line description of the account as a string.
        public String toString () {
            return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
        }
        
        public void move (Account newAccount, double money, double fee) {
            newAccount.deposit(money);
            balance -= (money + fee);
        }
    }
