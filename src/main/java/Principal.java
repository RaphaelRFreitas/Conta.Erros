import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Entre com nome:");
        String saldo = JOptionPane.showInputDialog(null,"Entre com o saldo:");
        String pEmp = "";
        String vEmp = "0";
        if((JOptionPane.showConfirmDialog(null,"O cliente pode fazer um empréstimo?")) == 0) {
            pEmp = "Sim";
            vEmp = JOptionPane.showInputDialog(null, "Entre com o valor maximo do empréstimo:");
        }
        else {
            pEmp = "Não";
        }
        Conta c1 = new Conta(nome,Double.parseDouble(saldo),pEmp,Double.parseDouble(vEmp));

        try {
            c1.sacar(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor para o saque:")));
        }catch (SaqueException e){
            System.out.println(e);
        }

        try {
            c1.fazerEmprestimo(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor para solicitar empréstimo:")));
        }catch (EmprestimoException e){
            System.out.println(e);
        }
    }
}
