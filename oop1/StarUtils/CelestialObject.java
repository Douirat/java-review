import java.util.*;

public class CelestialObject{
private double x;
private double y;
private double z;
private String name;
public static final double KM_IN_ONE_AU = 150000000;
public CelestialObject(){
    x = 0.0;
    y = 0.0;
    z = 0.0;
    name = "Soleil";
}
    public CelestialObject(String name, double x, double y, double z){
        if (!name.isEmpty()){
            this.name = name;
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // getters:
    public String getName(){
        return this.name;
    }
    public double getX(){
        return this.x;
    }
     public double getY(){
        return this.y;
    }
     public double getZ(){
        return this.z;
    }
    
        // setters:
    public void setName(String name){
         this.name = name;
    }
    public void setX(double x){
         this.x = x;
    }
     public void setY(double y){
         this.y = y;
    }
     public void setZ(double z){
         this.z = z;
    }
 /* 
 function getDistanceBetween(obj1, obj2):
    dx = obj2.x - obj1.x
    dy = obj2.y - obj1.y
    dz = obj2.z - obj1.z
    distance = sqrt( pow(dx, 2) + pow(dy, 2) + pow(dz, 2) )
    return distance 
*/

    public static double getDistanceBetween(CelestialObject a, CelestialObject b){
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double dz = b.z - a.z;
        double d = (dx * dx) + (dy * dy) + (dz * dz);
        d = Math.sqrt(d);
        return d;
    }

//     constant KM_IN_ONE_AU = 150000000  // km in 1 AU

// function getDistanceBetweenInKm(obj1, obj2):
//     distanceInAU = getDistanceBetween(obj1, obj2)
//     distanceInKm = distanceInAU * KM_IN_ONE_AU
//     return distanceInKm
public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b){
double uDistance = getDistanceBetween(a, b);
double d = uDistance * KM_IN_ONE_AU;
return d;
}

@Override
public String toString(){
return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
}

@Override
public boolean equals(Object obj){
    // Compare memory adress.
    if(this == obj) return true;
    // Compare data presence.
    if(obj == null) return false;
    // Compare class names;
    if(this.getClass() != obj.getClass()) return false;
    // Cast and compare each attribute separately;
    CelestialObject other = (CelestialObject) obj;
    return this.name.equals(other.getName()) && this.x == other.getX() && this.y == other.getY() && this.z == other.getZ();
}

@Override
public int hashCode(){
    return Objects.hash(this.name, this.x, this.y, this.z);
}
}