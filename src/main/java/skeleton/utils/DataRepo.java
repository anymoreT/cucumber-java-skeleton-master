package skeleton.utils;
public class DataRepo
{
    public int version = 1;

    public String dataType(){
        return "DataRepo";
    }
    public void setVersion(int version){
        this.version = version;
    }

    public int getVersion() {
        return version;
    }
}
