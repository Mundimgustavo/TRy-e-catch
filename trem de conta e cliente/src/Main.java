public class Main {
    public static void main(String[] args) {
        try {
            // Criação da conta com saldo e limite
            Conta conta = new Conta(1000.0, 500.0);

            // Adicionando clientes, incluindo um nulo
            conta.adicionarCliente(new Cliente("Gustavo Mundim ", "123.456.789-00"));
            conta.adicionarCliente(new Cliente("Jose lindo", "987.654.321-00"));
            conta.adicionarCliente(null);

            // Exibindo as informações da conta e dos clientes
            conta.mostrarInfo();
        } catch (Exception e) {
            System.out.println("Erro durante a execução: " + e.getMessage());
        }
    }
}