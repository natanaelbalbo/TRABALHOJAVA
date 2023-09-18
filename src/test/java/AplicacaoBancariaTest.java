import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.ContaCorrente;
import org.example.ContaPoupanca;
import org.example.ContaSalario;
import org.example.Pessoa;
import org.junit.jupiter.api.Test;

public class AplicacaoBancariaTest {

    @Test
    public void testContaPoupanca() {
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00");
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(1, pessoa1);

        // Teste de depósito
        contaPoupanca1.depositar(100.0);
        assertEquals(150.0, contaPoupanca1.getSaldo(), 0.001);

        // Teste de saque
        boolean saqueBemSucedido = contaPoupanca1.sacar(50.0);
        assertTrue(saqueBemSucedido);
        assertEquals(100.0, contaPoupanca1.getSaldo(), 0.001);
    }

    @Test
    public void testContaSalario() {
        Pessoa pessoa1 = new Pessoa("João", "123.456.789-00");
        ContaSalario contaSalario1 = new ContaSalario(2, pessoa1);

        // Teste de depósito
        contaSalario1.depositar(2000.0);
        assertEquals(2000.0, contaSalario1.getSaldo(), 0.001);

        // Teste de saque
        boolean saqueBemSucedido = contaSalario1.sacar(500.0);
        assertTrue(saqueBemSucedido);
        assertEquals(1500.0, contaSalario1.getSaldo(), 0.001);
    }
    @Test
    public void testContaCorrente(){
        Pessoa pessoa = new Pessoa("Jorge", "123.098.214-00");
        ContaCorrente contaCorrente = new ContaCorrente(449976384, "jorge" );

    }
}
