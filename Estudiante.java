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
