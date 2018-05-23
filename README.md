# blog-jsoninclude

Json형식으로 데이터를 주고 받을 때 Jackson의 ObjectMapper를 자주 이용한다.
그런데 기본값으로 Serialize 하게 되면 null, "" 같은 (상황에 따라) 필요없는 값 또한 모두 변환시켜준다.

[더알아보기](http://alwayspr.tistory.com/31)
