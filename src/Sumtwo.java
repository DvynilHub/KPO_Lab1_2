import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SumTwo{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public SumTwo() {

    }

    void read() throws IOException { //считывание двух чисел
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        this.x = Integer.parseInt(in.readLine());
        this.y = Integer.parseInt(in.readLine());
    }
    int summ(){ //функция сложения
        return x+y;
    }
    //считывание, суммирование и вывод результата на экран
    static void run() throws IOException {
        SumTwo xy = new SumTwo();
        xy.read();
        System.out.println(xy.summ());
    }
}
