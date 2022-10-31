import java.util.Objects;

public class Clase1 {
    private int v1;
    private double v2;
    private float v3;
    private boolean v4;
    private char a;
   
    public Clase1(int v1, double v2, float v3, boolean v4, char a){
        
        this.v1=v1;
        this.v3=v3;
        this.v4=v4;
        this.v2=v2;
        this.a=a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3, v4, a);
    }

    public boolean equals(Object obj){
        if(obj instanceof Clase1){
            Clase1 otro = (Clase1)obj;
            if(this.v1 == otro.v1){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
    
    
    
}