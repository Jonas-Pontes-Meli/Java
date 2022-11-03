package OrientadoObjetos.Aula5.Atividade2;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Jhon Constantine","Exorcista",20000.00f,201050,"Sagrada Trindade");
        Funcionario funcionario2 = new Funcionario("Gabriel Vanhelsing","Matador de Vampiro",40000.00f,239056,"Limpeza");
        funcionario1.vizualizar();;
        funcionario2.vizualizar();;
    }
}
