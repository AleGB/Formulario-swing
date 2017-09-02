package formulario;
public class data {
    //variables donde almacena los datos 
    private String nombre;
    private String pat;
    private String mat;
    private String skl;
 /*get y sets de cada variable para llamarlos en 
 la conexion de la base de datos*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getSkl() {
        return skl;
    }

    public void setSkl(String skl) {
        this.skl = skl;
    }
    
    
}