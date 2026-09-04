public class CadastroSobrecarga {

        String nome;
        int quantidade;

        public CadastroSobrecarga(String nome){
            this.nome = nome;
            this.quantidade = 1;
        }

        public CadastroSobrecarga(String nome, int quantidade){
            this.nome = nome;
            this.quantidade = quantidade;
        }

    public static void main(String[] args) {
        CadastroSobrecarga x = new CadastroSobrecarga("Caderno");
        CadastroSobrecarga y = new CadastroSobrecarga("Caderno", 3);

        System.out.println(x.quantidade + y.quantidade);
    }
}
