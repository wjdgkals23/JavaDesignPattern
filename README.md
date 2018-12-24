# JavaDesignPattern
---
## 1. Strategy Pattern (자바 객체지향 디자인 기본 패턴)
1-1. 인터페이스 개념
* 기능에 대한 선언과 기능을 사용하는 통로 역할을 한다.

1-2. 델리게이트 개념
* 현재 구현하는 객체 이외의 함수를 사용할 때 델리게이트를 통해 사용할 수 있다.

1-3. 전략 패턴
* 개념 : 여러 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어 접근 점에서 서로 교환가능 하도록 하는 패턴

## 2. Adapter Pattern (상관성 낮은 라이브러리 묶어서 사용하기)
1-1. Adapter 개념
* 개념 : 이미 구현된 알고리즘을 요구사항에 맞춰 사용할 수 있다.

## 3. Template Method Pattern
1-1. Template Method 개념
* 개념 : 알고리즘의 구조를 메소드에 정의 하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴

1-2. 언제 사용하는가?
* 구현하려는 알고리즘이 일정한 프로세스가 있고 변경 가능성이 있을 때

1-3. 어떻게 구현하는가?
* 알고리즘을 여러 단계로 나눈다.
* 나눠진 알고리즘 단계를 메소드로 선언한다.
* 알고리즘을 수행할 템플릿 메소드를 만든다.
* 하위 클래스에서 나눠진 메소드들을 구현한다.

## 4. Factory Method Pattern
1-1. Factory Method Pattern 개념
* 개념 : 템플릿 메소드 패턴의 형태로 구조 모델을 작성한다. 구조와 구현을 분리하는 형태로 개발한다.

1-2. 언제 사용하는가?
* 구현하려는 알고리즘이 일정한 프로세스가 있고 변경 가능성이 있을 때
* 가장 큰 범위의 추상클래스의 구현부를 각각 다르게 하위 클래스에서 구현하더라도 알고리즘의 프로세스는 같은 형태를 가진다.

## 5. SingleTone Pattern
1-1. SingleTone Pattern 개념
* 개념 : 단 하나의 인스턴스를 생성해야할 때 사용하는 디자인 패턴

1-2. 언제 사용하는가?
* DB 접근 인스턴스와 같이 하나만 있어야 하는 성질을 가질 때 싱글톤을 사용하면 좋다.

1-3. Thread의 동시성 문제?
* Thread의 동시 접근 문제는 synchronized와 LazeHolder기법을 통해 해결할 수 있다.

## 6. Prototype Pattern
1-1. Prototype Pattern 개념
* 개념 : 프로토 타입 패턴을 통해서 복잡한 인스턴스를 복사 할 수 있다.
* 만약 인스턴스를 생성하는 과정이 매우 복잡한 클래스라면 생성하는 과정을 반복하지 않고 기존에 생성된 인스턴스를 복사하고 값을 변경하여 새로운 객체로 사용하는 방법이 Prototype Pattern 이다.

1-2. 언제 사용하는가?
* 인스턴스 생산 비용이 높은 경우
  - 종류가 너무 많아서 클래스로 정리되지 않는 경우
  - 클래스로부터 인스턴스 생성이 어려운 경우

1-3. 얕은 복사 / 깊은 복사 ?
* 인스턴스에 다른 인스턴스를 주는 것은 얕은 복사로 같은 레퍼런스를 가지게 된다.
* Cloneable 인터페이스를 이용해 clone 함수를 통해 복사하면 새로운 인스턴스를 메모리에 할당하여 서로 다른 레퍼런스를 가지게 된다.

1-4. ArrayList copy / List copy ?
* 클래스 속성 중 ArrayList가 있다면 이는 불변객체가 아니므로 clone 과정에서 추가적으로 해당 속성을 복사하는 과정을 추가해주어야한다.
* List는 ~~~~List 들의 인터페이스로 clone을 사용할 수 없다.

1-5. 객체 레퍼런스를 포함하는 객체의 클로닝 ?
* 멤버 변수로 다른 객체를 포함하고 있는 상태라면 포함된 객체또한 Cloneable를 내포하게 구현되어야 clone을 진행할 수 있다.
