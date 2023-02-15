package array;

public class ArrayStudy2 {
    public static void main(String[] args) {

        /**
         앞선 정리에서
         배열의 간단한 개념과 선언, 생성, 초기화를 알아보았다
         추가적으로 간단한 활용법을 알아보자


         [3] 배열의 크기 (length)

         배열의 크기를 구하고 싶다면?
         직접 세보거나 일일히 확인해서 사용하기엔 실수할 가능성이 높다
         그럴땐 간단하게 length를 활용하면된다
         */

        //배열을 만들고, size 변수에 arr1.length, 즉 배열의 크기를 넣었다 size를 출력해보면?
        String[] arr1 = new String[65465];
        int size1 = arr1.length;
        String[] arr2 = new String[1];
        int size2 = arr2.length;

        System.out.println(size1);
        //출력결과 : 65465
        System.out.println(size2);
        //출력결과 : 1


        /**
         [4] 배열과 반복문
         배열은 반복문을 이용하여 처리하기에 적합하다

         [상황 1] 100개의 크기를 가지는 배열을 만들어, 각각방에 1부터 100까지 순서대로 숫자를 넣고 출력하려면?
         */

        // [2] 배열과 반복문, 상황1-예시
        int[] arr3 = new int[100];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[99] = 100;

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[99]);

        /**
         위에처럼 (arr3) 각각 데이터를 넣기엔
         시간도 오래걸리고
         실수할 가능성이 굉장히 높다 (인덱스나 값을 잘못 넣는다던지...)
         지금 예시를 작성하는데에도 굉장히 귀찮을정도다

         아무튼 그럴땐 반복문을 활용하면 된다
         (위에서 배운 length도 적절히 활용하자)
         */

        // [2] 배열과 반복문, 상황1-예시
        int[] arr4 = new int[100];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i + 1;
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        /**
         바로 위 arr4의 예시를보자

         이러면 반복문이 알아서 잘 넣어준다
         마찬가지로 배열을 전부 출력할때도 반복문을 활용하면 편하다
         */
    }
}
