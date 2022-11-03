package OrientadoObjetos.Aula5.Atividade6;

public class TesteCurso {
    public static void main(String[] args) {
        Curso java = new Curso("Java Fullstack","Fullstack",2000.00f,234567,"Rafael");
        Curso react = new Curso("React estilo shinob","Front-end",2000.00f,234568,"Yuri");
        java.vizualizar();
        react.vizualizar();
    }
}
