package com.infogalaxy;

 class Result extends Internal {
    int total;
    float perc;

        void calculate() {
            total = im1 + im2;
            perc = total / 2;
        }
        void showResult() {
            System.out.println("NAME = " + name);
            System.out.println("ID = " + id);
            System.out.println("IM1 = "+im1);
            System.out.println("IM2 = "+im2);
            System.out.println("PERCENTAGE = "+perc);
        }

    }
    class Main {
        public static void main(String[] args) {
            Result result = new Result();
            result.getStudent();
            result.getInternal();
            result.calculate();
            result.showResult();

        }
}
