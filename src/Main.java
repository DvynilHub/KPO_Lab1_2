import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Sumtwo.run();

    }
    public static class Sumtwo{
        int x;
        int y;
        void read() throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            this.x = Integer.parseInt(in.readLine());
            this.y = Integer.parseInt(in.readLine());
        }
        int summ(){
            return x+y;
        }
        static void run() throws IOException {
            Sumtwo xy = new Sumtwo();
            xy.read();
            System.out.println(xy.summ());
        }
    }
}
