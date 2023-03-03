public class AccessModifires {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        // set values
        myAcc.setUsername("jayminDarji");
        myAcc.setPassword("darjijaymin");

        // print values
        System.out.println(myAcc.getUsername());
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    private String username;
    private String password;

    void setUsername(String name) {
        this.username = name;
    }

    void setPassword(String pwd) {
        password = pwd;
    }

    String getUsername() {
        return this.username;
    }

    String getPassword() {
        return this.password;
    }

}
