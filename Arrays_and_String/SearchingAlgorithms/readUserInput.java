import java.io.*;

class ConsoleToFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("output.txt", true);

        String line;
        while (!(line = br.readLine()).equals("exit")) {
            fw.write(line + "\n");
        }

        fw.close();
    }
}
