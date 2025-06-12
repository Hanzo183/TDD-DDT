package com.hanzo.tool;
import com.hanzo.tool.mathutil.core.MathUtility;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0RunsWell();
        testFactorialGivenRightArgument1RunsWell();
        testFactorialGivenRightArgument2RunsWell();
    }



    // TEST THỬ HÀM VỪA GÕ
    // CẦN CÓ TEST CASE
    // TEST CASE #1: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 0
    // STEPS: GIVEN N = 0
    //        GETFACTORIAL(N = 0)
    // EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 0!
    // STATUS: ...

    public static void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);

        System.out.println("0! expected: " + expected + " actual: " + actual);

    }

    // TEST THỬ HÀM VỪA GÕ
    // CẦN CÓ TEST CASE
    // TEST CASE #2: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 0
    // STEPS: GIVEN N = 1
    //        GETFACTORIAL(N = 1)
    // EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 1!
    // STATUS: ...

    public static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);

        System.out.println("1! expected: " + expected + " actual: " + actual);

    }



    // TEST THỬ HÀM VỪA GÕ
    // CẦN CÓ TEST CASE
    // TEST CASE #3: CHECK/VERIFY THE GETFACTORIAL() METHOD WITH N = 0
    // STEPS: GIVEN N = 1
    //        GETFACTORIAL(N = 1)
    // EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 0!
    // STATUS: ...

    public static void testFactorialGivenRightArgument2RunsWell() {


        System.out.println("2! expected: 2 "  + " actual: " + MathUtility.getFactorial(2));
        System.out.println("3! expected: 6 "  + " actual: " + MathUtility.getFactorial(3));
        System.out.println("4! expected: 24 "  + " actual: " + MathUtility.getFactorial(4));
        System.out.println("5! expected: 120 "  + " actual: " + MathUtility.getFactorial(5));
    }





}
// TDD: Test Driven Development
// Viết code chính và viết test case/run song song với nhau
// Cứ viết dc code nào, thì có ngay test case
// Test case dùng để test hàm (ko nhầm với test app - test màn hình ui và nhập
//liệu, chỉ dành cho chính dân dev (QA/QC ko dính vào code project)

//Nhờ Tdd góp 1 phần giúp ta tự động hóa quá trình build, check bug, đóng gói nếu code ổn, deploy lên staging server (server để test app)
//Code -> check var code (unit test, TDD)
//               ok thì đóng góp app
//               đưa app lên server
// Quy trình này là CI/CD

//CV có 1 mục:
//Technical skills ---------------
//JUnit
//TDD
//CI/CD
//Maven