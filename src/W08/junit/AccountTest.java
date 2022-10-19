package W08.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(100);
    }

    @Test
    void getBalance() {
        assertEquals(100, account.getBalance());
    }

    @Test
    void withdraw() {
        account.withdraw(10);
        assertTrue(account.getBalance() < 100);

        account.withdraw(101);
        assertTrue(account.getBalance() < 100);
    }

    @Test
    void deposit() {
        account.deposit(10);
        assertTrue(account.getBalance() > 100);
    }
}