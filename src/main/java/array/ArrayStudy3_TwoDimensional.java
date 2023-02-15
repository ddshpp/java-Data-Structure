package array;

public class ArrayStudy3_TwoDimensional {
    public static void main(String[] args) {

        /**
         [5] 2차원배열

         2차원배열이란 배열의 요소가 1차원 배열을 가지는 배열을 말한다.
         선언 및 생성은 1차원 배열과 비슷하다
         배열을 선언하면 기본적으로 모든 요소 값은 0으로 설정된다.

         일반적으로
         int[][] arr = new int[rows][columns]; 의 형태로 생성해준다
         아래 예시를 보며 빠르게 이해해보자
         */

        // [5] 2차원배열-예시
        int[][] arr = new int[2][3];

        /**
         위의 배열은 이해하기 쉽게 그려보면

         ------ Column0  columns1  columns2
         Row 0   [0][0]   [0][1]   [0][2]
         Row 1   [1][0]   [1][1]   [1][2]

         이런 형태가 된다
         */


        /**
         [6] 2차원배열- 추가설명

         -- 전에 정리한 일반적인 배열(1차원배열)을 다시 봐보자
         int[] arr = new int[3]
         arr[0] = 어떤값;
         arr[1] = 어떤값;
         arr[2] = 어떤값;
         이렇게 되는건 무리없이 이해할수 있을것이다

         --- 2차원배열은
         int[][] arr = new int[2][3]
         arr[0] = 1차원배열; -> 크기는 3
         arr[1] = 1차원배열; -> 크기는 3
         이런 형태라 보면된다

         그렇다고 마구잡이로 합치면 안된다
         각각 배열의 목적이 있을것이고, 2차원배열을 봤을때 직관적인 이해가 어려울수 있으므로
         적절한 상황에서 사용하자
         */

        // [6] 2차원배열- 추가설명예시

        // 이 2개의 배열은
        int[] arrExample1 = new int[3];
        int[] arrExample2 = new int[3];

        //이 2차원배열과 같은 형태다
        int[][] arrExample3 = new int[2][3];


        /**
         [6] 2차원배열의 크기

         위의 2차원 배열을 예시로 크기를 구해보려한다
         arrExample3.length 는 2가 되며
         arrExample3[i].length 는 3이 된다
         */

        System.out.println(arrExample3.length);
        //출력결과 : 2
        System.out.println(arrExample3[0].length);
        //출력결과 : 3
    }
}
