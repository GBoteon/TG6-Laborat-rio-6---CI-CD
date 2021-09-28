package com.mackenzie.banco;

public class Bank {
    int saldoMedio;
    boolean bomPagador;
    boolean concessaoEspecial;

    public Bank() {

    }

    public String emprestimo(int saldoMedio, boolean bomPagador, boolean concessaoEspecial) {
        if(saldoMedio > 1000) {
            return "Empréstimo Liberado";
        } else if(saldoMedio < 1000 && bomPagador) {
            return "Empréstimo Liberado";
        } else if(saldoMedio < 1000 && bomPagador == false && concessaoEspecial){
            return "Empréstimo Liberado";
        } else {
            return "Empréstimo Negado";
        }
    }
}
