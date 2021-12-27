package baitap;

import com.oracle.webservices.internal.impl.encoding.StreamDecoderImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào cạnh a");
            int canhA = scanner.nextInt();
            System.out.println("Nhập vào cạnh b");
            int canhB = scanner.nextInt();
            System.out.println("Nhập vào cạnh c");
            int canhC = scanner.nextInt();
            TriangleException triangleException = new TriangleException();
            triangleException.triangle(canhA, canhB, canhC);

    }

    public void triangle(int canhA, int canhB, int canhC) {
        try {
            if (canhA > 0 && canhB > 0 && canhC > 0) {
                if (canhA + canhB > canhC && canhB + canhC > canhA && canhA + canhC > canhB) {
                    System.out.println("ABC là tam giác");
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Xảy ra ngoại lệ: Nhập sai dữ liệu");
        }
    }
}
