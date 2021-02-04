Java
===
## 목차
1. [변수와 자료형](#1-변수와-자료형)
2. [연산자](#2-연산자)
3. [조건문과 반복문](#3-조건문과-반복문)
4. [클래스와 객체](#4-클래스와-객체)
5. [배열과 리스트](#5-배열과-리스트)
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
      
### 참조 자료형
* String
* 프로그래머가 필요에 의해 만든 클래스

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

# 4. 클래스와 객체
## 객체 지향 프로그래밍이란
    객체를 정의하고 객체 간 협력을 프로그래밍하는 것
## 클래스란
    객체의 속성과 기능을 코드로 구현한 것
    
    (접근 제어자) class [클래스 이름] {
        멤버 변수;
        메서드;
    }
> 클래스 이름은 대문자로 시작하는 게 불문율
## 메서드
    클래스 내부에서 사용하는 멤버 함수
    
    (함수 반환형) [함수 이름] (매개 변수) {
            return 예약어;
    }
- 값을 반환하는 메서드

        public String getStudentName() {
            return studentName;
        }
- 값을 대입하는 메서드

        public void setStudentName(String name) {
            studentName = name;
        }
### main() 함수
    프로그램을 시작하기 위해 호출하는 함수
- 인스턴스 생성

        (클래스형) [변수 이름] = new 생성자;
- 생성자
    
        클래스를 처음 만들 때 멤버 변수나 상수를 초기화하는 것
    - 디폴트 생성자
    
            자동으로 생성됨
            직접 추가 시 public Person() {}
    - 생성자 오버로드
    
            생성자가 2개 이상 제공되는 경우 생성자 선택 사용 가능
## 접근 제어자
    - public : 어디서나 접근 가능
    - protected : 같은 패키지 내부 + 상속 관계의 클래스에서 접근 가능
    - default : 같은 패키지 내부에서 접근 가능
    - private : 같은 클래스 내부에서 접근 가능

## this 예약어
    인스턴스 스스로를 가리키는 예약어
1. 생성자에서 다른 생성자를 호출

        Person() {
            this("No name", 1);             //this를 사용해 아래 생성자 호출
        }                                   //this문을 가장 처음에 작성해야 함

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
2. 자신의 주소를 반환
    
        //위 코드 이어서
        Person returnItSelf() {
            return this;        //this 반환
        }
## 객체 간 협력 과정
ex) 학생이 버스와 지하철을 이용하는 과정을 구현    

1. 필요한 객체 정의    
    학생, 버스, 지하철에 대한 멤버 변수와 생성자 정의   
    
2. 객체 사이의 협력 기능 구현  
    학생이 지하철을 탄다, 지하철에 학생이 탄다    
    각 두 객체에 서로 다른 일이 발생했으므로 각각의 클래스에 메서드로 구현
## static 변수
    정적 변수, 클래스 변수라고도 함
    인스턴스 생성과 상관 없이 먼저 생성되고 그 값을 모든 인스턴스가 공유함
        
***

# 5. 배열과 리스트
## 배열
    자료형[] 배열 이름 = new 자료형[개수];
    자료형 배열 이름[] = new 자료형[개수];
### 문자 저장 배열 선언
    public class CharArray {
        public static void main(String[] args) {
            char[] alphabets = new char[26];
            char ch = 'A';
            
            for(int i=0; i<alphabets.length; i++, ch++) {
                alphabets[i] = ch;      //아스키 값으로 각 요소에 저장
            }
    }
### 객체 배열 사용
    Book[] library = new Book[5];
    
    for(int i=0; i<library.length; i++){
        System.out.println(library[i]);
    }
### 배열 복사하기
기존 배열과 자료형 및 배열 크기가 똑같은 배열을 새로 만들거나     
배열의 모든 요소에 자료가 꽉 차서 더 큰 배열을 만들어 기존 배열에 저장된 자료를 가져오려 할 때 배열을 복사      
    
1. 기존 배열과 길이가 같거나 더 긴 배열을 만들어 for문 사용해 복사   
2. System.arraycopy() 메서드 사용    
    **System.arraycopy(src, srcPos, dest, destPos, length)**  
    - src : 복사할 배열 이름
    - srcPos : 복사할 배열의 첫 번째 위치
    - dest : 복사해서 붙여 넣을 대상 배열 이름
    - destPos : 복사해서 대상 배열에 붙여넣기를 시작할 첫 번째 위치
    - length : src에서 dest로 자료를 복사할 요소 갯수
#### 얕은 복사
객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니라 인스턴스의 주소 값   
따라서 객체 배열을 복사할 때 인스턴스를 따로 생성하는 게 아니라 기존 인스턴스의 주소 값만 복사  
= 두 배열은 서로 다른 요소가 같은 인스턴스를 가리키고 있으므로
= 복사되는 배열의 인스턴스 값이 변경되면 두 배열 모두 영향 받음
#### 깊은 복사
복사할 객체 배열의 인스턴스를 생성한 후 복사하면 두 배열이 다른 인스턴스를 가리키게 됨
### 배열 참조 for문
    for (변수 : 배열) {     //배열 요소 값을 순서대로 가져와 변수에 대입
        반복 실행문;
    }
    
