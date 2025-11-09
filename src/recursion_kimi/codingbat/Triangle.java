package recursion_kimi.codingbat;

public class Triangle {
    public static int triangle(int rows){
        if (rows == 1) {
            return  1;
        }
        return rows + triangle(rows - 1);
    }
    public static void main(String[] args) {
        System.out.println(triangle(3));
    }
}
