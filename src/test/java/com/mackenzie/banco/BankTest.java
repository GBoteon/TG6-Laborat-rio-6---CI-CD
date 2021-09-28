package com.mackenzie.banco;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {

    Bank banco;
    public BankTest() {
        banco = new Bank();
    }

    @Test
    public void emprestimoLiberado(){
        assertEquals("Empréstimo Liberado", banco.emprestimo(1200, false, false));
        assertEquals("Empréstimo Liberado", banco.emprestimo(15000, false, true));
        assertEquals("Empréstimo Liberado", banco.emprestimo(820, true, false));
    }

    @Test
    public void emprestimoNegado(){
        assertEquals("Empréstimo Negado", banco.emprestimo(981, false, false));
        assertEquals("Empréstimo Negado", banco.emprestimo(800, false, false));
    }
}