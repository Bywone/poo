public class Estudiante extends Persona {

    private String matricula;
    private String carrera;
    Laptop laptop;
    
    public Estudiante(String nombre, int edad, double altura, String genero, String nacionalidad, String matricula, String carrera) {
        super(nombre, edad, altura, genero, nacionalidad);
        this.matricula = matricula;
        this.carrera = carrera;
    }        

    public Estudiante(String nombre, int edad, double altura, String genero, String nacionalidad, String matricula, String carrera, String Laptop) {
        super(nombre, edad, altura, genero, nacionalidad);
        this.matricula = matricula;
        this.carrera = carrera;
        this.laptop = new Laptop(Laptop);
    }  
    @Override
    void hablar() {
        System.out.println(getNombre() + " está preguntando al profesor sobre la tarea.");
    }

    @Override
    void caminar() {
        System.out.println(getNombre() + " camina rápido para llegar a clase.");
    }
    //overload
    public void caminar(int distancia){
        System.out.println(" está recorriendo: " + distancia + " para llegar a su clase");
    }    
    @Override
    void dormir(){
        System.out.println(getNombre() + " está soñando con ella");
    }
    //overload
    public void dormir(int horas){
        System.out.println(getNombre() + "se mimió " + horas + " horas, no fue a chambear");
    }
    @Override
    void comer(){
        System.out.println(getNombre() + " le dio hambre y fue a comer papas");
    }
    //overload
    public void comer(int cantidadPapas){
        System.out.println(getNombre() + " compró: " + cantidadPapas + " bolsas de papas con salsa valentina.");
    }
    public String getMatricula(){
        return matricula;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }   

}
