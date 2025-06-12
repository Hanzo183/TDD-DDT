package com.hanzo.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test  //@test mang ý nghĩa biến hàm ở sát dưới thành hàm main() thì mới chạy lệnh test khi run app!!
    //Test case 1: Verify Getfactorial
    void testFactorialGivenRightArgument0RunsWell(){
long expected = 1; //hy vọng n = 0, tức là 0! sẽ có giá trị là 1
int n = 0;
long actual = MathUtility.getFactorial(n);
assertEquals(expected, actual);//so sánh giúp xem thức tế có như kì vọng ko. Nếu ko thì màu đỏ


    }

    //Test case 2: Verify Getfactorial with n=1
    @Test
    void testFactorialGivenRightArgument1RunsWell(){
        long expected = 1; //hy vọng n = 0, tức là 0! sẽ có giá trị là 1
        int n = 1;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);//so sánh giúp xem thức tế có như kì vọng ko. Nếu ko thì màu đỏ


    }

    //Test case 3: Verify Getfactorial with n=1
    @Test
    void testFactorialGivenRightArgument2RunsWell(){

        assertEquals(2, MathUtility.getFactorial(2));//so sánh giúp xem thức tế có như kì vọng ko. Nếu ko thì màu đỏ
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));

    }

    //Test case 4: (Bắt ngoaij lệ)
    //Verify getFactiorial() with n < 0, e.g n = -5 to throw an Exception
    //Steps
    // 1. Given an invalid number, n = -5
    // 2. Call invoke the function getFactorial(-5)
    //Expected result:
    // an IllegalArgumentException ưill be thrown
    //Nếu đưa -5 cà chớn, hy vọng sẽ nhìn thấy ngoại lệ

@Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException(){


        //Ta phải kiểm soát ngoại lệ đã đến chưa, nếu là âm 5 là Illegal phải ra màu xanh đúng như kỳ vọng, cú pháp biểu thức lambda
    assertThrows(IllegalArgumentException.class,() -> MathUtility.getFactorial(-5));


    }



    void getFactorial() {




    }
}