public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota","Corolla",2020);
        Carro carro2 = new Carro("Gol","Up",2015);

        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        carro1.mostrarInformacoes();
        carro1.ligar();
        

        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

        carro2.mostrarInformacoes();
        carro2.ligar();
        
    }
}
