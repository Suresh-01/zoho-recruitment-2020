
/**
 *
 * @Language :Java_SE_8
 * @Author Suresh Kumar
 * @Email cmsuresh14@gmail.com
 * @Description: Zoho Interview/Programming Round-2020
 *
 **/


import java.io.*;

public class Test {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    /** Solution Start **/
    void solve()throws Exception{


        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<=n;i++){
            for(int j=n;j>=0;j--){
                if(j>i ){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();

        }

    }

    /** Solution End  **/

    public static void main(String[] args)throws Exception {
        Test test=new Test();
        test.solve();
    }


}
