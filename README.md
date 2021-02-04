Java
===
## 목차
1. [변수와 자료형](#1-변수와-자료형)
2. [연산자](#2-연산자)
3. [조건문과 반복문](#3-조건문과-반복문)
4. [클래스와 객체](#4-클래스와-객체)
5. 배열과 리스트
6. 상속과 다형성
7. 추상 클래스
8. 인터페이스
9. 기본 클래스
10. 컬렉션 프레임워크
11. 내부 클래스, 람다식, 스트림
12. 예외 처리
13. 자바 입출력

***

# 1. 변수와 자료형
## 변수

    [자료명] [변수 이름];
    
* 변수 이름
  * 영문자, 숫자, $, _ 사용 가능
  * 숫자로 시작 불가
> camel notation
<br> 대부분 소문자로 시작해서 중간 단어의 첫글자를 대문자로 표기

## 자료형
### 기본 자료형
* 정수형

      byte (-128 ~ 127) 
      short (-32,768 ~ 32,767)
      int (-2,147,483,648 ~ 2,147,483,647) 
      long (-2^63 ~ 2^63-1)
      * long형은 숫자 뒤에 식별자 L(l)을 붙여 사용
      
* 문자형 

      char
* 실수형 
 
      float
      * 식별자 F(f) 사용
      double 
* 논리형 
  
      boolean
      
### 자료형 없이 변수 선언
    var
    지역변수만 사용 가능
    
## 상수
    final
## 리터럴
    모든 숫자, 문자, 논리값을 일컫는 말
    변수나 상수 값으로 대입 가능
## 형 변환
    1. 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이뤄진다.
    2. 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이뤄진다.
- 묵시적 형 변환(자동 형 변환)

      자료 손실 없이 대입된다.
- 명시적 형 변환(강제 형 변환)

      int num = 10;
      byte num2 = (byte)num2;     //괄호로 명시
    

 ***
# 2. 연산자
* 대입 연산자
 
      =
* 부호 연산자
 
      +, -
* 산술 연산자
 
      +, -, *, /, %
* 증감 연산자

      ++, --
* 관계 연산자

      >, <, ==, != 등
* 논리 연산자

      &&, ||, !
* 복합 대입 연산자

      +=, -=, *=, %= 등
* 조건 연산자

      조건식 ? 결과1 : 결과2;
        
***
# 3. 조건문과 반복문
## 조건문
### if문

    if (조건식1) {
        수행문;
    }
    else if (조건식2) {
        수행문2;
    }
    else {
        수행문3;
    }
### switch-case문

    switch (조건) {
        case 값1 : 수행문1;
                    break;
        case 값2 : 수행문2;
                    break;
        default : 수행문4;
    }
## 반복문
### while문

    while (조건식) {
        수행문1;           //조건식이 참일 동안 반복
    } 수행문2;
### for문

    for(초기화식; 조건식; 증감식) {       //식 생략 가능
        수행문;
    }
### continue문

    반복문 내에서 continue문을 만나면 뒷 문장 수행 않고 다음 과정으로 넘어감
### break문

    더 이상 반복하지 않고 반복문을 빠져나옴

***
# 4.클래스와 객체
