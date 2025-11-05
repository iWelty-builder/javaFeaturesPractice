package PathEncryption;

public class PathEncryption {

    public static void main(String[] args) {
        String path = "a.aef.qerf.bb";
        System.out.println(pathEncryption(path));
    }


    public static String pathEncryption(String path) {
        return path.replace("."," ");
    }
}
