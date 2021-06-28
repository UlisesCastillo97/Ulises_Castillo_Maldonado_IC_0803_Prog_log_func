class Cliente extends Persona {
    //Persona persona=new Persona();
    private double saldo;
    private boolean ocupado;

    Cliente(){
        super();
    }

    Cliente(String nombre,String apellido_paterno,String apellido_materno,int edad,char sexo){
        super(nombre,apellido_paterno,apellido_materno,edad,sexo);
        
    }
     Cliente(String nombre,String apellido_paterno,String apellido_materno,int edad,char sexo,double saldo,boolean ocupado){
        super(nombre,apellido_paterno,apellido_materno,edad,sexo);
        this.saldo=saldo;
        this.ocupado=ocupado;
                
    }
    

   Cliente(Cliente cliente){
        this.setTodosDatos(cliente);
    }

    private void setTodosDatos(){
        setNombre("");
        setApellido_materno("");
        setApellido_paterno("");
        setEdad(0);
        setSexo(' ');
        this.saldo = 0.0;
        this.ocupado = false;
    }

    public void setTodosDatos(String nombre,String apellido_paterno,String apellido_materno,int edad, char sexo, double saldo){
        setNombre(nombre);
        setApellido_paterno(apellido_paterno);
        setApellido_materno(apellido_materno);
        setEdad(edad);
        this.validarSexo(sexo);
        this.validarSaldo(saldo);
        this.setOcupado();
    }

    public void setTodosDatos(Cliente cliente){
        cliente.getNombre();
        cliente.getApellido_paterno();
        cliente.getApellido_materno();
        cliente.getEdad();
        this.validarSexo(cliente.getSexo());
        this.validarSaldo(cliente.getSaldo());
        this.setOcupado();
    }

    public Cliente getTodosDatos(){
        Cliente temporal = new Cliente();
        temporal.getNombre();
        temporal.getApellido_paterno();
        temporal.getApellido_materno();
        temporal.getEdad();
        temporal.getSexo();
        temporal.saldo = this.getSaldo();
        temporal.ocupado = this.isOcupado();
        return temporal;
    }

    private void validarSexo(char sexo){   //este metodo es para la clase persona para validar su sexo
        if(sexo != 'M' && sexo != 'F'){
            sexo = ' ';
        }
        setSexo(sexo);
    }

    private void validarSaldo(double saldo){
        if(saldo <= 0.0){
            saldo = 0.0;
        }
        this.saldo = saldo;
    }

    private boolean tieneSaldo(){
        return this.saldo > 0.0;
    }

    private boolean tieneDatos(){
        return !(getNombre() == null || getNombre().equalsIgnoreCase(" ") || getSexo() == ' ');
        /*if(this.nombre == null || this.nombre.equalsIgnoreCase(" ") || this.sexo == ' ')
            return false;
        else
            return true;*/
    }

    private void setOcupado() {
        if(!this.tieneDatos()){
            this.setTodosDatos();
        }
        else{
            this.ocupado = true;
        }
    }

   

    public double getSaldo() {
        return saldo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void eliminar(){
        this.setTodosDatos();
    }

    public void cambiarNombre(String nuevoNombre){
        if(nuevoNombre != null && !nuevoNombre.equalsIgnoreCase(" ")){
            setNombre(nuevoNombre);
        }
        this.setOcupado();
    }
    public void cambiarApp(String nuevoApp){
        if(nuevoApp != null && !nuevoApp.equalsIgnoreCase(" ")){
            setApellido_paterno(nuevoApp);
        }
        this.setOcupado();
    }
    public void cambiarApm(String nuevoApm){
        if(nuevoApm != null && !nuevoApm.equalsIgnoreCase(" ")){
            setApellido_materno(nuevoApm);
        }
        this.setOcupado();
    }
    
    public void cambiarEdad(int nuevaEdad){
        if( nuevaEdad>0){
            setEdad(nuevaEdad);
        }
        this.setOcupado();
    }

   
    public void cambiarSexo(char sexo){
        if(sexo == 'M' || sexo == 'F'){
            setSexo(sexo);
        }
        this.setOcupado();
    }

    public void abonarSaldo(double cuanto){
        if(this.tieneDatos()) {
            if(cuanto > 0.0){
                this.saldo += cuanto;
            }
            else{
                System.out.println("\tImposible, no puedes abonar saldos negativos o nada.");
            }
        }
    }

    public void retirarSaldo(double cuanto){
        if(this.tieneDatos()){
            if(cuanto > 0.0){
                if(this.tieneSaldo()){
                    if(this.saldo >= cuanto)
                        this.saldo -= cuanto;
                    else
                        System.out.println("\tImposible, tú saldo es insuficiente para retirar " + cuanto + ".");
                }
                else
                    System.out.println("\tImposible, no hay saldo.");
            }
            else
                System.out.println("\tImposible, no puedes retirar saldos negativos o nada.");
        }
    }

    @Override
    public String toString(){
        return "-> Nombre: |" + getNombre() +
                
                "| ->Ap_p: |" + getApellido_paterno()+
                "| ->Ap_m: |"+ getApellido_materno()+
                "| ->Edad: |"+ getEdad()+
                "| ->Sexo: |"+ getSexo()+
                "| -> Saldo: |" + this.saldo +
                "| -> Ocupado: |" + this.ocupado + "|";
    }

    public void imprimirCliente(){
        System.out.println("\t\t" + this.toString());
    }

   
}