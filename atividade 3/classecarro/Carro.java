public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota",2020);

        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
    }
}
