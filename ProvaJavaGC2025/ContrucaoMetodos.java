public class ContrucaoMetodos {
    String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }

    public String status(){
        if(emprestado){
            return "Indisponivel";
        }
        return "Disponivel";
    }

    public static void main(String[] args) {
        ContrucaoMetodos l = new ContrucaoMetodos();
        l.titulo = "Java para iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}
