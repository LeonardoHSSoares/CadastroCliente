package resource;

import javax.swing.JOptionPane;

import resource.dao.ClienteMapDAO;
import resource.dao.IClienteDAO;

public class App {

    private static IClienteDAO iClienteDAO;
    public static void main(String[] args) {
        
        iClienteDAO = new ClienteMapDAO();
        
        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para Cadastro,2 para Consultar,3 para Exclusão,4 para Alteração,5 para Sair: ", null, 2);

        


    }
}
