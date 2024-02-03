package com.saikr;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: SequenceProblem
 * Package: com.saikr
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2024/2/3 10:25
 */
public class SequenceProblem {
    public static void main(String[] args) {
//        System.out.println(SequenceProblem.test(28));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(SequenceProblem.test2(n));
    }

    /**
     * 已知一个数列的前 3 个数为 3,4,5以后每个数为前3个数的和，编程序求此数列的第 N 项。【递推】
     *
     * @param n
     * @return
     */
    public static int test(int n) {
        int[] arr = new int[n + 3];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        if (n <= 3) {
            return arr[n - 1];
        } else {
            for (int i = 3; i < n; i++) {
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            }
            return arr[n - 1];
        }

    }
    public static int test2(int n){
        int a=3,b=4,c=5;
        if(n<=3){
            if (n==1) {
                return a;
            }
            if (n==2) {
                return b;
            }
            if (n==3) {
                return c;
            }
        }
        int result=0;
        for (int i = 4; i <= n; i++) {
            result=a+b+c;
            a=b;
            b=c;
            c=result;
        }
        return result;
    }
}
