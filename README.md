# OOP-training

> ## 1. 라면 끓이기
> 1. 라면의 종류를 정합니다. (ex : 일반 라면, 떡볶이 라면, 짜장라면 etc)
> 2. 냄비에 물을 넣습니다.
> 3. 물을 끓입니다.
> 4. 물이 끓기 시작하면 라면을 물에 넣습니다.
> 5. 라면의 종류에 따라 스프를 넣는 순서가 다릅니다.
> 6. 일반 라면의 경우, 라면과 함께 스프를 넣습니다.
> 7. 그 외 라면의 경우, 물을 뺀 후 스프를 넣습니다. 
> 8. 이제 라면을 먹을 수 있습니다.


> ## 2. 휴가 상신하기
> 1. 사용할 휴가의 종류를 선택합니다.
> 2. 남은 휴가 일수를 확인합니다.
> 3. 사용할 휴가와 남은 휴가 일수를 비교하여, 사용가능 여부를 확인합니다.
> 4. -> 해당 휴가를 사용할 수 있습니다.
> 5. 결재 라인을 선택합니다.
> 6. 휴가 결재를 상신 합니다.
> 7. 결재가 종결됐습니다.
> 8. 선택한 휴가 종류 만큼 휴가 일수가 차감됩니다.
> 9. 휴가를 떠납니다.


> ## 3. 볶음밥 만들기
> 1. 재료 준비 (밥, 야채, 고기, 기름 등)
> 2. 후라이팬을 준비하고, 기름을 두릅니다.
> 3. 야채를 썹니다.
> 4. 고기를 썹니다.
> 5. 밥을 볶습니다.
> 6. 야채와 고기를 볶습니다.
> 7. 다같이 볶습니다.
> 8. 볶음밥이 완성됐습니다.

> 셀프 리뷰 
> 1) FriedRice 클래스에 의존하는 객체가 너무 많다.
> 2) new 연산자 밭을 만들어 놨네.
> 3) Rice, Meat, Vegetable 클래스를 선언했으면, 내부를 구체화 해야하는데 그렇지 못했다.


> ## 4. 배민 간단 주문 V1
> 1. 주문자를 다수 생성한다.
> 2. 가게를 다수 생성한다.
> 3. 주문할 가게를 고른다.
> 4. 요금을 지불하고 주문을 진행한다.
> 5. 주문이 완료된다.
> 6. 거래 후 주문자와 가게의 잔액을 확인한다,.


> ## 5. 배민 주문 V2
> 1. 주문자를 다수 생성한다.
> 2. 가게를 다수 생성한다.
> 3. 주문할 가게를 고른다.
> 4. 주문자의 잔액과 요금을 비교한다.
> 5. 요금을 지불하고 주문을 진행한다.
> 6. 주문이 완료된다.
> 7. 거래 후 주문자와 가게의 잔액을 확인한다.
> ### 문제점
> - order() 메서드에 주문자의 id 값을 삽입하려니 모든 코드를 수정해야한다.
> - 메뉴를 문자열이 아닌 타입으로 받질 못한다. 메뉴가 추가될 시 일일이 case 문을 추가해야 한다.


> ## 6. Proxy Pattern 을 이용한 Mock DB connection
0. IConnection 인터페이스에 connect() 추상 메서드를 선언
1. DB connection 클래스에서 구현한 connect() 메소드를 사용하면 0.5초가 소요된다.
2. MockClient 클래스에서 connect() 메서드를 호출한다.
3. IConnection 인터페이스를 구현한 ProxyConnection 클래스를 생성한다.
4. ProxyConnection 는, 최초 DB connection 에만 DBConnection 객체를 생성하고, 그 다음 부턴 곧 바로 connect() 한다.
햣 