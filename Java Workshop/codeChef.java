/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int u = sc.nextInt();
            int d = sc.nextInt();
            int  h[] = new int[n];
            for(int j=0;j<n;j++){
                h[j]=sc.nextInt();
            }
            int x=0;
            int count=1;
            for(int j=0;j<n-1;j++){
                if(h[j+1]-h[j]>u){
                    break;
                }
                else if(h[j]-h[j+1]>d){
                    if(x==0){
                        count++;
                        x++;
                    }
                    else{
                        break;
                    }
                }
                else if (h[j]==h[j+1]){
                    count++;
                }
                else{
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
