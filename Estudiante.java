public class Estudiante extends Persona {

    private String matricula;
    private String carrera;
    EstudianteUniversitario estudianteUniversitario;

    public Estudiante(String nombre, int edad, double altura, String genero, String nacionalidad, String matricula, String carrera) {
        super(nombre, edad, altura, genero, nacionalidad);
        this.matricula = matricula;
        this.carrera = carrera;
    }        

    public Estudiante(String nombre, int edad, double altura, String genero, String nacionalidad, String matricula, String carrera, String universidad) {
        super(nombre, edad, altura, genero, nacionalidad);
        this.matricula = matricula;
        this.carrera = carrera;
        this.estudianteUniversitario = new EstudianteUniversitario(nombre,edad, altura, universidad, universidad, universidad, universidad, universidad);
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
