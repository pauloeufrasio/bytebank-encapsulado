public class testaGetESet {

    public static void main(String[] args) {
        Conta conta= new Conta();
        conta.setNumero(1377);

        System.out.println(conta.getNumero());
        System.out.println(conta.getAgencia());

        Cliente paulo = new Cliente();
        paulo.setNome("paulo silveira");
        paulo.setCpf("23.456.789-11");
        paulo.setProfissao("Auxiliar de limpeza");
        conta.setTitular(paulo);

        System.out.println(conta);
        System.out.println(conta.getTitular().getNome()+ " " +conta.getTitular().getCpf());


    }
}
