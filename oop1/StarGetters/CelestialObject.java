public class CelestialObject {
private double x;
private double y;
private double z;
private String name;
public CelestialObject(){
    this.name = "Soleil";
}
public CelestialObject(String name, double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
    this.name = "Soleil";
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

public String getName(){
    return this.name;
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

public void setName(String name){
    this.name = name;
}
}
