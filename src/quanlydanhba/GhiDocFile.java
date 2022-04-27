package quanlydanhba;

import java.io.*;
import java.util.List;

public class GhiDocFile {
    public static void writerToFile(String path, List<DanhBa> danhBas) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "hoTen,soDT,Email"+"\n";
        for ( DanhBa s:danhBas ) {
            str += s.getHoTen()+","+ s.getSoDT() + "," + s.getEmail() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();

    }
    public static List<DanhBa> readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine())!=null) {
            System.out.println(content);
        }
        return null;
    }
}
