package mx.edu.utng.proyectodatos;

public class Comentario{
        //Campos correspondientes a la base de datos
    int id;
    String nombre;
    String comentario;

    //Constructor
    public Comentario(int id, String nombre, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.comentario = comentario;
    }

    //Representación del objeto como cadena de texto
    @Override
    public String toString() {
        return nombre;
    }
    //Métodos de acceso a cada atributo de la clase
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getComentario() {
        return comentario;
    }
}
