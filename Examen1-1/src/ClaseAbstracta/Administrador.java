package ClaseAbstracta;

public class Administrador extends Persona{
    private String departamento;


    @Override
    public void mostrarInformacion() {
        System.out.println("Bienvenido A los Administradores");
    }

    public Administrador() {
    }

    public Administrador(int id, String nombre, int edad, String departamento) {
        super(id, nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                " departamento='" + departamento + '\'' +
                ", id=" + id +
                "}\n";
    }
}
