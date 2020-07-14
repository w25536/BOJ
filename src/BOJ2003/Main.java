package BOJ2003;
/**
 * https://www.acmicpc.net/problem/2003
 * 수들의 합 2
 * 알고리즘 : 브루트포스
 * 이메일 : ucbqsuh@ucl.ac.uk
 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        solution(n, m, a);

    }

    private static void solution(int n, int m, int[] a) {
        int left = 0;
        int right = 0;
        int sum = a[0];
        int ans = 0;

        while (left <= right && right <= n){


            if(m < sum){ // 합이 m 보다 작으면
                sum = sum - a[left];
                left++;
                if(left > right  && left < n){
                    right = left;
                    sum = a[left];
                }

            }else if(m == sum){// 합이 m 이랑 같으면
                if(right == n){
                    break;
                } else{
                    ans = ans + 1;
                    right= right + 1;
                    sum = sum + a[right];
                }

            }else if (m > sum ){ //합이 m 보다 작으면

                if (right == n){
                    break;
                }else {
                    right = right + 1;
                    sum = sum + a[right];
                }
            }
        }
        System.out.println(ans);
    }
}




