public class Questao4 {
    public static void main(String[] args) {

        float distancia = 100, carro = 110, caminhao = 80;

        float tempoCarro = distancia / carro * 60;
        float tempoCaminhao = (distancia / caminhao * 60)+10;

        System.out.println("Tempo carro: " + tempoCarro + " min");
        System.out.println("Tempo caminhao: " + tempoCaminhao + " min");

    }
}
