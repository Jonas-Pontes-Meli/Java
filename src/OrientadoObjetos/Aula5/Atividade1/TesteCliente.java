package OrientadoObjetos.Aula5.Atividade1;

import java.util.Date;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcos","Mecânico",8000.0f,56789056789l,new Date(20/12/1990));
        Cliente cliente2 = new Cliente("João Cleber","Farmaceutico",7000.0f,45623434515l,new Date(20/12/1990));
        cliente1.vizualizar();
        cliente2.vizualizar();


    }
}
