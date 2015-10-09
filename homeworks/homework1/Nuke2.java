import java.io.*;
import java.util.*;
import java.lang.*;

class Nuke2 {
  public static void main(String args[]) throws java.lang.Exception {
    String aman;
    BufferedReader myReader;
    myReader = new BufferedReader(new InputStreamReader(System.in));
    aman = myReader.readLine();
    if(aman.length() == 2) {
      aman = aman.substring(0,1); 
    }
    else if(aman.length() > 2) {
      aman = aman.substring(0,1) + aman.substring(2,aman.length());
    }
    System.out.println(aman);
  }
}


