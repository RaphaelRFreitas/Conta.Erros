import javax.swing.*;

public class Conta {
    public String  propietario;
    public double saldo;
    public String permissaoEmprestimo;
    public double valorEmprestimo;

    public Conta(String  propietario,double saldo,String permissaoEmprestimo,double valorEmprestimo){
        this.propietario = propietario;
        this.saldo = saldo;
        this.permissaoEmprestimo = permissaoEmprestimo;
        if(this.permissaoEmprestimo == "Sim")
            this.valorEmprestimo = valorEmprestimo;
        else
            this.valorEmprestimo = 0;
    }
    public void sacar (double saque) throws SaqueException {
        if (saldo >= saque) {
            JOptionPane.showMessageDialog(null,"Seu saldo era: " + saldo + " R$");
            saldo -= saque;
            JOptionPane.showMessageDialog(null,"Seu novo saldo é: " + saldo + " R$");
        } else throw new SaqueException();
    }

    public void fazerEmprestimo(double valor) throws EmprestimoException {
        if (permissaoEmprestimo == "Sim" && valor <= valorEmprestimo)
            JOptionPane.showMessageDialog(null,"Seu empréstimo estará na sua conta em até 24Hrs!");
        else throw new EmprestimoException();
    }
}
