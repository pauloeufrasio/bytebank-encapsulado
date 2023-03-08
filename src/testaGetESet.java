public class testaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero = 1377;
        conta.setNumero(1377);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("paulo silveira");
        paulo.setCpf("23.456.789-11");
        paulo.setProfissao("Auxiliar de limpeza");
        conta.setTitular(paulo);


        System.out.println(conta.getTitular().getNome()+ " " +conta.getTitular().getCpf());


    }
}
