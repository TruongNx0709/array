import java.sql.SQLOutput;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("Bài tập Mảng ");
        array baitap = new array();
        // Bài 2b
        Boolean checkBai2b = baitap.checkSNT(baitap.bai2b());
        if (checkBai2b) {
            System.out.println("Mảng này toàn là số nguyên tố");
        } else {
            System.out.println("Mảng này không phải là số nguyên tố");
        }
        // Bài 2c
        Boolean checkBai2c = baitap.checkMangTangDan(baitap.bai2b());
        if (checkBai2c) {
            System.out.println("Mảng này là mảng tăng dần");
        } else {
            System.out.println("Mảng này không phải là mảng tăng dần");
        }
        //Bài 3a
         baitap.chichiahetcho4(baitap.bai2b());
        //Bài 3b
        int sum = baitap.tongcacSoNguyen(baitap.bai2b());
        System.out.println(sum);
    }

    // Hàm nhập mảng
    public int[] bai2b() {
        System.out.println("--------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 mảng 5 chữ số vào kiểm tra:");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public boolean checkSNT(int[] arrayCheck) {
        System.out.println("Check mảng có phải SNT hay không");
        boolean check = true;
        for (int i : arrayCheck) {
            if (i < 2) {
                System.out.println("Mảng này không phải là số nguyên tố");
                break;
            }
            for (int y = 2; y <= Math.sqrt(i); y++) {
                int temp = i % y;
                if (temp == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public boolean checkMangTangDan(int[] arrayCheck) {
        System.out.println("Check mảng có tăng dần hay không");
        boolean check = true;
        for (int i = 0; i < arrayCheck.length - 1; i++) {
            if (arrayCheck[i] > arrayCheck[i + 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public void chichiahetcho4(int[] arrayCheck) {
        System.out.println("Liệt kê ra các số chia hết cho 4 và không chia hết cho 5:");
        for (int i : arrayCheck) {
            if (i % 4 == 0 && i % 5 != 0) {
                System.out.println("Số chia hết cho 4 và không chia hết cho 5 là :" + i);
            } else {
                System.out.println("Các số không hợp lệ với đề bài là :" + i);
            }
        }
    }

    public int tongcacSoNguyen(int[] arrayCheck) {
        int sum = 0;
        boolean check = true;
        for (int i : arrayCheck) {
            if (i < 2) {
                System.out.println("Mảng này không phải là số nguyên tố");
                break;
            }
            for (int y = 2; y <= Math.sqrt(i); y++) {
                int temp = i % y;
                if (temp == 0) {
                    check = false;
                }
            }
            if(check){
                sum=sum+i;
            }
        }

        return sum;
    }
}

