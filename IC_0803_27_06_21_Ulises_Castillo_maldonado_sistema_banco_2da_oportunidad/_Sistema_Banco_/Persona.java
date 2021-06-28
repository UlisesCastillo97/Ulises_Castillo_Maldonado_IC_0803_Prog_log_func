class Persona {

    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int edad;
    private char sexo;
    

    public Persona() {
        super();
    }

    public Persona(String nombre, String apellido_paterno, String apellido_materno, int edad, char sexo) {
        super();
        this.nombre = nombre;
        this.apellido_paterno =  apellido_paterno;
        this.apellido_materno= apellido_materno;
        this.edad = edad;
        this.sexo = sexo; 
        

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido_paterno(String  apellido_paterno) {
        this.apellido_paterno =  apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

   

}
