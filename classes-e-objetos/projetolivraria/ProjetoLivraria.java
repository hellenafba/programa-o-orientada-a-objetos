
public class ProjetoLivraria {

    public static void main(String[] args) {
        Livro obj1;
        obj1 = new Livro();

             
        obj1.titulo = "The Garden of Evening Mists";
        obj1.numeroPaginas = 350;
        obj1.anoPublicacao = 2012;
        obj1.preco = 60.00;

        Cliente cliente1;
        cliente1 = new Cliente();

        cliente1.nome = "Ana Clara";
        cliente1.cpf = "123.456.789-00";    
        cliente1.endereco = "Rua das Flores, 123 - N8n";

        cliente1.cadastrar();
        obj1.cadastrar();
        System.out.println("Título: " + obj1.titulo);
        System.out.println("Número de páginas: "+ obj1.numeroPaginas);
        System.out.println("Ano publicação: "+obj1.anoPublicacao);
        obj1.vender();
        System.out.println(" ");

        double frete1 = obj1.calcFrete("00000-000");
        System.out.printf("Frete R$%.2f",frete1);
        System.out.println("");
        obj1.envio();
        System.out.println("");
        cliente1.comprar();
        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        System.out.println("Endereço: " + cliente1.endereco);

        Livro obj2;
        obj2 = new Livro();

        Cliente cliente2;
        cliente2 = new Cliente();

        cliente2.nome = "Bruno Silva";
        cliente2.cpf = "987.654.321-00";
        cliente2.endereco = "Avenida Central, 456 - Apt 101";

        obj2.titulo = "O grande Livro do Excel";
        obj2.numeroPaginas = 90;
        obj2.anoPublicacao = 2021;
        obj2.preco = 15.00;

        
        cliente2.cadastrar();
        obj2.cadastrar();
        System.out.println("Título: " + obj2.titulo);
        System.out.println("Número de páginas: "+ obj2.numeroPaginas);
        System.out.println("Ano publicação: "+obj2.anoPublicacao);
        obj2.vender();
        System.out.println("");
        

        
        double frete2 = obj2.calcFrete("02300-000");
        System.out.printf("Frete R$%.2f",frete2);

        System.out.println("");
        obj2.envio();

        cliente2.comprar();
        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + cliente2.nome);
        System.out.println("CPF: " + cliente2.cpf);
        System.out.println("Endereço: " + cliente2.endereco);
    }
}
