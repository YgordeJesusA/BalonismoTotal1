public class Main {
    public static void main(String[] args) {
        // Aula de Orientação á Objeto

        // Declarar Objetos
        Pessoa adao;
        // classe "Pessoa" que deu origem ao objeto: "Adão"

        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();

        //Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";

        // Acionar comportamento - fazer o adao falar
        adao.falar();
        eva.falar();
    }
}
