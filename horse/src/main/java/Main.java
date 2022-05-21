import java.util.Scanner;

public class Main {
    static int n,m,count;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入棋盘规格(用空格隔开)：");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        dfs(0,0);
        System.out.println(count);
    }
    public static void dfs(int a,int b) {
        if(a<0||a>n||b<0||b>m) {
            return;
        }
        if(a==n&&b==m) {
            count++;
            return;
        }
        dfs(a+2,b+1);
        dfs(a+1,b+2);
        dfs(a-1,b+2);
        dfs(a-2,b+1);

    }

}


