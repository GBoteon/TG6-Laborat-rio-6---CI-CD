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
        assertEquals("Empréstimo liberado", banco.emprestimo(1200, false, false));
        assertEquals("Empréstimo liberado", banco.emprestimo(820, true, false));
        assertEquals("Empréstimo liberado", banco.emprestimo(15000, false, true));
    }

    @Test
    public void emprestimoNegado(){
        assertEquals("Empréstimo liberado", banco.emprestimo(981, false, false));
        assertEquals("Empréstimo negado", banco.emprestimo(800, false, false));
    }
}