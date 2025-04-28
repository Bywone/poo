public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private String genero;
    private String nacionalidad;
    Estudiante estudiante;
    Laptop laptop;
    // aqui se define el constructor para que funcione el main, si no lo tiene no va a funcionar
    public Persona(String nombre, int edad, double altura, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    // getter, estructura del getter:
    /* public Tipo getNombreDelAtributo() {
       return this.nombreDelAtributo;
       }*/
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    // Setter, estructura del setter:
    /* public void setNombreDelAtributo(Tipo nombreDelAtributo) {
       this.nombreDelAtributo = nombreDelAtributo;
     * }*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    void hablar() {
        System.out.println(nombre + " te dijo hola");
    }

    void caminar() {
        System.out.println(nombre + " está llegando al parque a ver a su ex con otro");
    }

    void comer() {
        System.out.println(nombre + " está viendo como está comiendo con otro");
    }

    void dormir() {
        System.out.println(nombre + " está soñando con ella");
    }

}