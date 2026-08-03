import java.util.*;
public class Star extends CelestialObject{
    private double magnitude;
    public Star(){
        super();
    }
    public Star(String name, double x, double y, double z, double magnitude){
        super(name, x, y, z); 
        this.magnitude = magnitude;
    }
    public double getMagnitude(){
        return this.magnitude;
    }
       public void setMagnitude(double magnitude){
         this.magnitude = magnitude;
    }
     @Override
     public String toString(){
        return String.format("%s shines at the %.3f magnitude", getName(), magnitude);
     }
    @Override
     public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Star other = (Star) o;
        return this.getName().equals(other.getName()) && Double.compare(other.getX(), this.getX()) == 0 && Double.compare(other.getY(), this.getY()) == 0 && Double.compare(other.getZ(), this.getZ()) == 0 &&  Double.compare(other.magnitude, this.magnitude) == 0;
     }
    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getX(), this.getY(), this.getZ(), this.magnitude);
    }
}