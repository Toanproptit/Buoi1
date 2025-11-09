

import java.util.Scanner;



public class Main {
    static class SinhVien {

        private String name;
        private String clas;
        private String birth;
        private String gpa;

        public SinhVien(String name, String clas, String birth, String gpa) {
            this.name = name;
            this.clas = clas;
            this.birth = birth;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getClas() {
            return clas;
        }

        public void setClas(String clas) {
            this.clas = clas;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getGpa() {
            return gpa;
        }

        public void setGpa(String gpa) {
            this.gpa = gpa;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.nextLine();

        for( int i = 1 ; i <= n ; i++)
        {
            String name = scanner.nextLine();
            String clas = scanner.nextLine();
            String birth = scanner.nextLine();
            String gpa = scanner.nextLine();
            SinhVien sinhVien = new SinhVien(name, clas, birth, gpa);

            Integer num = i;
            System.out.print("B20DCCN");
            String number = num.toString();
            int size = number.length();
            size = 3 - size;

            for( int j = 0 ; j < size; j ++)
            {
                System.out.print("0");
            }
            System.out.println(num);

        }



    }
}