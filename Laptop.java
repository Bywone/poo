public class Laptop {
    private String Laptop;
    private String marca;
    private int modelo;
    private String color;    
    private double precio;
   
    Laptop(){}
    Laptop(String marca,int modelo, String color, double precio) {  
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }  
    void bateria(){
        System.out.println("No tiene pila mano, ponla a cargar");
    }
    //overload
    public void bateria(int porcentaje){
        System.out.println("Tiene de batería: " + porcentaje + "% ");
    }
    
    Laptop(String Laptop) {
        this.Laptop = Laptop;
    }      
    public String getLaptop(){
        return Laptop;
    }

    public void SetLaptop(String Laptop){
        this.Laptop = Laptop;
    }
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getModelo(){
        return modelo;
    }
    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

}
