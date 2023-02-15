package array;

public class ArrayStudy1 {
    public static void main(String[] args) {

        /**
         [1] 배열 (Array)
            인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료구조

         1. 배열을 이용하면 한번에 많은 메모리 공간을 할당
         2. 같은 타입의 데이터들이 저장
            인덱스를 이용하여 데이터 접근가능
            반복문을 이용하여 처리하게 적합
         3. 배열 생성시, 해당 배열의 주소값을 가지게 된다 (주소값을 통해 데이터에 접근)
         4. 배열을 선언만 하고 생성을 안할 시 주소값은 가지지만, 공간은 할당되지 않는다
         5. 배열을 생성할땐 크기를 지정해주어야 한다
         6. 배열의 인덱스는 0부터 시작하며, 배열의 마지막 인덱스는 (배열크기-1) 이다.
         */

        // 배열의 선언
        int[] arr;

        // 배열의 생성
        int[] arr2 = new int[5];

        // 배열의 생성2 (선언만 된 배열의 크기를 지정해주어 생성)
        arr = new int[3];

        // 생성과 동시에 초기화 (배열의 크기를 써주지 않아도 자동으로 된다)
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7};


        /**
         [2] 배열의 타입 (참고사항)

         배열은 레퍼런스 타입이기 때문에 사용시 유의해야 한다
         이 부분은 나중에 따로 정리해서 올릴예정이니
         간단하게 예시만 봐보자

         바로 하단에
         String 변수하나와 -> testStr
         int 배열을 하나 생성하였다 -> testArr

         그리고
         문자열을 넣으면 그 문자열을 "bbbb" 로 바꾸는 메소드와 -> test1
         배열을 넣으면 그 배열의 0번째 인덱스의 값을 -1로 바꾸는 메소드를 만들었다 -> test2
         둘다 리턴값은 없는 메소드이다

         각각 메소드에
         testStr = "aaaa"와
         testArr = {1,2,3} 을 넣어주면
         결과는 어떻게 될까??
         */

        String testStr = "aaaa";
        int[] testArr = {1, 2, 3};

        test1(testStr);
        System.out.println(testStr);
        //출력 : aaaa

        test2(testArr);
        System.out.println(testArr[0]);
        //출력 : -1

        /**
         보는바와 같이
         "aaaa" 라는 문자열은 test1메소드에 넣어도 그대로 "aaaa"였다

         하지만
         원래 0번째 인덱스가 1이였던 배열은 test2에 넣으니
         0번째 인덱스가 -1 로바뀌었다

         왜일까?

         1. test1의 경우
         testStr은 프리미티브 타입이다 -> String
         프리미티브타입을 메소드에 넣으면
         진짜 testStr이 들어가 바뀌는게 아니라
         복사본이 들어가 복사본이 바뀌는거라 보면된다
         고로 원래 testStr은 바뀌지 않는다
         (리턴값을 줘서 바꾸고 그런건 가능하지만 설명을 위한 예시니 참고하자)

         2. test2의 경우
         testArr은 레퍼런스 타입이다
         레퍼런스 타입은 주소값을 가지는데
         해당 주소값을 메소드에 넘기는 것 이기에
         해당 데이터에 직접 접근이 가능해지고
         그렇기에 0번 인덱스의 값이 -1로 변경이 되는것이다
         */
    }

    public static void test1(String testStr) {
        testStr = "bbbb";
    }

    public static void test2(int[] testArr) {
        testArr[0] = -1;
    }
}
