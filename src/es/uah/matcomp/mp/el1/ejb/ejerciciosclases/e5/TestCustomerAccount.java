package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e5;

public class TestCustomerAccount {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1234, "Luna Mayoral", 'f');

        Account account = new Account(1234, customer1);

        account.deposit(500);
        System.out.println(account);

        Customer customer2 = new Customer(2345, "Luna Mayoral", 'f');
        Account account2 = new Account(2345, customer2);
        account2.deposit(500);
        System.out.println(account2);

        account.withdraw(200);
        System.out.println(account);

        account2.withdraw(600); // Intentamos retirar mas de lo que hay en la cuenta
        System.out.println(account2);

        // Imprimir balance final
        System.out.println("Balance final: " + account.getBalance());
    }
}
