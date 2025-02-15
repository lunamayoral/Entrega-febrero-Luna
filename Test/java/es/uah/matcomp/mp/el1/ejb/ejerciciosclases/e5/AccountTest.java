package es.uah.matcomp.mp.el1.ejb.ejerciciosclases.e5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer);
        assertEquals(5652,account.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer);
        assertEquals(customer,account.getCustomer());
    }

    @Test
    void getBalance() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer,2333.23);
        assertEquals(2333.23,account.getBalance());
    }

    @Test
    void setBalance() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer,2333.23);
        account.setBalance(5662);
        assertEquals(5662,account.getBalance());

    }

    @Test
    void testToString() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer,2333.238);
        assertEquals("Roberto Pascual(1303) balance=$2333.24", account.toString());
    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer,2333.23);
        assertEquals("Roberto Pascual", account.getCustomerName());
    }

    @Test
    void deposit() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer,200);
        account.deposit(50);
        assertEquals(250,account.getBalance());

    }

    @Test
    void withdraw() {
        Customer customer = new Customer(1303,"Roberto Pascual",'m');
        Account account = new Account(5652,customer,200);
        account.withdraw(50);
        assertEquals(150,account.getBalance());
        account.withdraw(300);
        assertEquals(150,account.getBalance());
    }
}