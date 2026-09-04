public class ConstrutoresInstancias {
    String nome;
    int idade;

    public ConstrutoresInstancias(String n, int i){
        nome = n;
        idade = i;
    }

    public static void main(String[] args) {
        ConstrutoresInstancias u = new ConstrutoresInstancias("João", 25);

        System.out.println(u.nome + "," + u.idade);
    }

}
