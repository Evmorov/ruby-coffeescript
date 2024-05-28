import java.net.*;
import java.io.*;

class FileSisterDirPath {
  public static void main(String[] args) throws IOException {
    URL location = FileSisterDirPath.class.getProtectionDomain().getCodeSource().getLocation();
    String parentPath = new File(location.getFile() + ".." + "/java").getCanonicalPath();
    System.out.println(parentPath);
  }
}
