package com.master.jm;



/*
 * 제한자.
 * 
 * 정보보안과 은닉을 위해 접근제한자라는 키워드가있다.
 *  public, private, protected 가있다.
 *  
 *  깊게들어가면 초반에는 어려운개념이므로
 *  쉽게생각하자
 *  public >>> 일명 호구 오픈마인드로 전부다 접근가능
 *  
 *  private >>> 같은 패키지안에서 접근 가능 
 *  
 *  protected >>> 같은 클래스 안에서만 가능 단 상속을 받은경우는 가능
 *  
 *  왜이러한 개념을 만들었나 잘생각해봐라
 *  
 *  public 처럼 오픈마인드로 정보를 남에게 다 공개해버리면 id와 pw개념도 업을것이다.
 *  왜 ? 그냥 접근만 하면 정보를 얻을수있으니깐
 *  
 *  접근 제한자 키워드를 적어서 원치않는 정보의 유출을막기 위해서 이러한 키워드를 만들었다
 *  Java 만든놈은 머리가 엄청 좋은놈인것 같다.
 * 
 * 추상성
 * 전체적인 큰 틀을 클래스라고했을때 
 * 세부적인 틀이 객체라고했었다.
 * 추상성은 가장 에메모호한 개념이다.
 * 왜? 객체지향프로그래밍에서 객체로 프로그래밍을한다면서
 * 무슨 추상??? 이렇게 생각할수도있지만
 * 다시한번 말하지만 컴퓨터는 사람이아니다. 밥먹는방법 씹는방법 수저쥐는법까지 하나하나
 * 전부 설정을해줘야한다.
 * 그런의미에서 객체를 만들려면 어느정도  추상적인 개념이 필요하다.
 * 그것이 클래스고 클래스를 통해 객체를 만드는것이다.
 * 이개념이 어느정도 이해가갔으면 추상성도 대충감이 잡힐것이다.
 * abstract라는 키워드를 활용하여 추상 클래스 추상매서드를 만들수있지만.
 * java 8버젼에서는 이개념보다는 interface라는 것을 활용하여
 * 더 쉽고 간편하게 추상성을 이용할수있다.
 * 이 추상성에대한 개념은 상속, 오버라이딩, 오버로딩, 과 함께이해 한 후 큰 덩어리처럼
 * 이해가되면 성공이다. 
 * 
 * 
 * 인터페이스
 * 만드는 방식은 클래스와 동일하다.
 * 개념적인 측면에서는 클래스와 완벽히 다르다.
* 
 * 상속성
 * 부모자식 관계 라고 생각하면 이해가쉽다. 부모클래스, 인터페이스 로부터 extend, implement 라는 키워드를 사용하여
 * 상속을 받은 자식 클래스는 부모클래스, 인터페이스 에있는 모든 자원을 가져다가 쓸수있다.
 * 
 * 오버라이딩
 * 부모클래스, 인터페이스로부터 상속받았을때 
 * 상속받은 클래스에서 메서드를 재정의 하는것
 *
 * 
 * 오버로딩
 *  쉽고간단하게 이해하자 
 *  생성자 오버로딩 과 메소드 오버로딩이있는데
 *  본질적 개념은 
 *  A라는 클래스에서 정의되어있는 매서드를 
 *  B라라는 클래스에서 인스턴스화하고
 *  인스턴스화 되어있는 매서드의 매개변수의 유형과 개수를 다르게하는 개념
 *  복잡하면
 *  이름은 같고 ()속의 매개변수의 유형과 개수를 다르게 하는 개념이다.
 *	masterjod (String strMs, int intMs)
 */
public class Master_03 implements MasterIfs_01 {
	
	
	public void masterJob(String strMs, int intMs) {
		
	}

	@Override
	public int intEng(int intCount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intMath() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intEng() {
		// TODO Auto-generated method stub
		return 0;
	}

}