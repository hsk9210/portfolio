/**
 * 초기 변수 선언 ~ 상수 까지는 일반적인 스크립트 언어와 비슷비슷.
 * 식별자 이름부터 시작할때 식별자 표기법에서 카멜 케이스와 스네이크 케이스를
 * 혼용하지 말라고 하는데, 저거는 네이버의 협업 기준인 NHN 코딩 컨벤션
 * http://nuli.navercorp.com/data/convention/NHN_Coding_Conventions_for_Markup_Languages.pdf
 * 을 기준으로 하면 한국에서는 대부분 문제 없을 듯 하다. (아마도 내 교육과정에서는 케말케이스를 푸쉬해주겠지만.)
 * 그 외로는 식별자를 대문자로 하는건 클래스에서만 적용하기나,
 * 밑줄(언더바)로 시작하는건 internal 변수에서 사용하기 등이 가이드라인인 듯.
 * 제이쿼리가 '$'기호로 시작하는 것은 국룰을 넘어 국제적인 룰이니 패스.
 * 
 * 
 *  리터럴이란 무엇인가?
 * 
 * 번역체를 감수하고 읽어보면 JS에서는 '값을 만드는 방법'이라고 표현한다.
 * 리터럴 vs 식별자
 * let room1 = 'conferenceRoomA'; //'conferenceRoomA'가 리터럴, room1이 식별자.
 * let currentRoom = room1; // 이러면 컨퍼런스룸A가 항당되어 버리고.
 * currentRoom = conferenceRoomA; //이러면 식별자자도 아닌데 식별자 취급하며 할당하려니 에러가 나는 것.
 * 
 * 
 * 자바스크립트의 값
 * 
 * primitive vs object
 * 문자열 숫자같은 원시 타입은 immutable로 취급한다.
 * 유의할 점은. 'alpha' + 'omega'처럼 문자열을 병합하면 "다른" 문자열을 합친거지,
 * 같은 문자열끼리 수정한 것이 아니라는 점이다.
 * primitive 타입에는 6가지가 있는데
 * 숫자, boolean, 문자열, null, undefined, symbol
 * 이다. 이 개념이 안잡히면 함수 파트에서 js 특유의 헷갈림에 당할 듯 하다.
 * 
 * 반면, 객체는 여러가지 형태와 값을 가질 수 있다.
 * 대표적인 내장 객체 타입으로는
 * Array, Date, RegExp, Map & WeakMap, Set & WeakSet이 있다.
 * 그러면서도 숫자는 Number, 문자는 String, 참거짓은 Boolean이라는
 * 대응되는 객체 타입이 있기는 있다.
 * 객체에 실제 값이 저장되는 않지만 대응하는 원시 값에 기능(메소드 등)을 제공하는
 * 역할을 하는 것을 보니 그래도 "JAVA"에서 홍보목적으로 이름을 따왔다는 언어답게
 * 기본기는 얼추 비슷한 점을 가진 듯 하다.(그나마 비슷한 점이 있으니 다행이다...)
 * 
 * ......
 * 
 * 
 * 그나저나 숫자타입이 문제다.
 * 
 * JS는 뭔 숫자타입을 IEEE-764배정도 부동소숫점 방식 데이터 타입 하나로 통일했냐???
 * 즉, JAVA의 '더블'타입 하나만 쓴다는 것과 비슷하다.(코알못이 봐도 뭔가 좋지 않은 일이 일어날 듯.)
 * let aaa = 0.1 + 0.2; //하면
 * console.log(aaa); //가 구버전 js에서는 0.30000000...4를 내뱉을 수도 있다는 뜻으로 소개되어 있다.
 * 이러니 정밀한 정수 or 소숫점 연산은 굳이 다른 언어를 사용해서 연산하는 경우도 있다는 것이 조금 체감이 되었다.
 * 그래도 2, 8, 10 , 16의 네가지 숫자형 리터럴을 사용하기는 한다.
 * ex)
 * let count = 10; // 숫자 리터럴. count는 더블입니다.
 * const blue = 0x0000ff; // 16진수. 16진수 ff는 10진수 255와 같습니다. 
 * const umask = 0o0022; // 8진수. 8진수 22는 십진수 18과 같습니다. 
 * const roomTemp = 21.5; // 십진수 
 * const c = 3.0e6; // 지수 (3.0 × 10^6 = 3,000,000) 
 * const e = -1.6e-19; // 지수 (-1.6 × 10^-19 = 0.00000000000000000016) 
 * const inf = Infinity; 
 * const ninf = -Infinity; 
 * const nan = NaN; // "숫자가 아님"
 * 
 * ......
 * 이런 다양한 리터럴 형식을 사용해도 결국 숫자는 double 형으로 저장된다.
 * 저것들은 모두 숫자를 간편한 형식으로 표현할 수 있도록 제공된 것 뿐입니다...
 * 
 * const small = Number.EPSILON; // 1에 더했을 때 1과 구분되는 결과를 만들 수 있는 가장 작은 값. 근사치 2.2e-16 
 * const bigInt = Number.MAX_SAFE_INTEGER; // 표현가능한 가장 큰 정수 
 * const max = Number.MAX_VALUE; // 표현가능한 가장 큰 숫자 
 * const minInt = Number.MIN_SAFE_INTEGER; // 표현할 수 있는 가장 작은 정수 
 * const min = Number.MIN_VALUE; // 표현할 수 있는 가장 작은 숫자 
 * const nInf = Number.NEGATIVE_INFINITY; // -Infinity 
 * const nan = Number.NaN; // NaN 
 * const inf = Number.POSITIVE_INFINITY; // Infinity
 * 
 * 문자열string은 텍스트 데이터이고 string of characters 인건 비교적 현대 프로그래밍 언어에서는 다 비슷하다.
 * js string은 유니코드 텍스트를 사용한다.(즉 국제표준. ANSI는 엄밀히 국제표준 아닙니다에 강조!)
 * 한편, 따옴표와 이스케이프를 js에서 사용하는 예시는 다 비슷하게 들 수 있을것 같다.
 * ㄷx>
 * const dialog = 'HELL o world';
 * const imperative1  ="He saw him and said \"FU\" to x "; //이러면 에러가 안나고 된다.
 * 이스케이프(\)의 위엄은 여기서도 통하는군. 정 역슬래시가 문자열 내부에 필요하면
 *  \\ 이런식으로 2번쓰면 자기 자신이 이스케이프 된다.
 * 사용자에게 보여주는 화면단의 텍스트는 "" 큰따옴표를 쓰는게 편리할 듯 싶다.(영어의 '를 이스케이프 덜치고 빠르게 표현하려면 사실상 표준.)
 * 
 * 특수문자는 유니코드와 관련되어 사실상 표준인, 자주쓰이는 것들이 있으므로 생략.
 * 단! ES6에서 새로 생긴 ' ` ' 백틱과 ' $ '( ${aaa}처럼. ) 저것들은 유의해서 기억해두자. 반드시 나중에도 쓰인다.
 * 
 * 
 * 템플릿 문자열?
 * 프론트앤드 언어로 많이 쓰이니 값을 문자열 안에 써야하는 일도 많을 것이다.
 * 이런때는 concate, 즉 문자열 병합을 자주 사용하게 된다는 것.
 * let currentTemp = 36.5;
 * const tempMsg = "the current temp is " + currentTemp + "!";
 * 이런 식 대신 최신 ES6에서는
 * const tempMsg2 = `the current temp is ${currentTemp}!`;
 *  !?
 * 훨씬 더 간단한 표현이 가능해졌따리...
 * 문자열 템플릿 안에서는 달러 기호가 특수문자가 된다.
 * 달러 기호 다음에 중괄호로 감싼 값을 쓰면 그 값이 문자열에 삽입된다. 달러기호가 필요하면 내부에서 \
 * multiLine 의 예시로 여러줄 문자열의 예시를 실제코드로 작성했다. 그러나 보다시피 `백틱이 더 편하다. 주석 하단 참조.
 * 
 * 
 * 숫자와 문자열 복합.
 * 숫자를 "" 안에 넣으면 문자열이 된다.
 * 하지만 js는 자동으로 숫자로 바뀌는 신기한 경우가 빈발하는게 특징이다.
 * const res1 = 3 + "30"; //이러면 '330'이 나오고
 * const res2 = 3*"30"; //이러면 숫자 90이 나온다??????
 * 후반부의 js식 데이터 형변환은 필수로 숙지해야 될 듯.
 * 
 * boolean은 중반의 truthy falsy 설명에서 공부.
 * 
 * 
 * symbol
 * 유일한 토큰을 나타내기 위해 ES6에서 도입된 최신 데이터 타입.
 * 사용은 Symbol(내용물); 생성자를 사용. 
 * 
 * null, undefined
 * js의 특별한 타입.
 * 널은 널 하나만 값으로 가질수 있고, unde도 마찬가지.
 * 둘다 존재하지 않는 것을 나타내는데, 데이터타입은 서로 다르다는 괴상한...
 * 일단 최신 규칙에서는 null은 프로그래머가 쓰는 데이터 타입,
 * undefined는 JS 자체에서 사용하는 타입이다.(콘솔로그의 단골손님)
 * 그러니 undefined는 되도록 쓰지 말자 괜히 콘솔창에서 더 헷갈려진다;;
 * 
 * 객체
 * js에서의 객체는 일종의 컨테이너다.
 * 내용물은 바뀌어도 컨테이너가 바뀌지는 않는 것처럼.
 * { } 리터럴 문법은 다른 언어들과 동일.
 * 내부 컨텐츠는 property or member라고 영어권에서 표현한다.
 * 프로퍼티 이름은 문자열이나 심볼을 사용하며 값은 자유.
 * let obj = {};
 * obj.color = "yellow"; //멤버접근연산자 도트를 써서 이렇게 넣거나
 * obj["2ndColor"] = "red"; //계산된 멤버 접근연산자 []를 사용한다.
 * 
 * 
 *  Number, String, Boolean객체나 배열같은 자주쓰이는 건
 * 백문이 불여일타이니 직접 예시코드를 주석 하단에 작성한다.
 * 
 * 
 * Array in JavaScript
 * 자바스크립트에서 배열은 꽤 특수한 객체로 취급된다.(문법이 이러니 몇몇에 기능을 몰아버릴 수밖에.)
 * 굳이 표현하자면 C언어의 indexed 배열 + 동적 배열 + 연결 리스트 정도를 Array에 모조리 때려박은 셈.
 * 
 * 이러므로 특징이 약간 다른데,
 * 배열 요소가 0으로 시작한다 정도는 다 비슷해도,
 * 배열 크기가 고정되지 않음. 요소 추가 및 제거가 자유.
 * 요소의 data type도 가리지 않음. string만 쓰는 배열, number만 쓰는 배열 이런거 없다.
 * 심지어 숫자가 아닌 키나 분수, 음수 key도 가능.(하지만 절대 피하자. 개인 PJ에서도 금물급;)
 * 
 * RegExp, Map과 Set 등은 후반부 설명(정규식 + 자료구조는 후반부가 국룰)
 * 
 * number와 string 사이 형변환 메소드나 테크닉은 숙지할 것.
 * let number1 = Number(바꿀 문자열); //단, 저건 숫자값을 만드는 것이지 인스턴스는 아니다!
 * 또는 parseInt 나 parseFloat를 사용하는 방법도 있다.
 * 
 * 
 */

 const multiLine = "line1\n\
line2";
console.log(multiLine);
const multiLine2 = `line1
line2`;
console.log(multiLine2);

//멀티라인의 예시에서 보는 것처럼 영 좋지 않으니
let currentTemp = 20.5;
let multiLine3 = `Current temp:\n` +
`\t${currentTemp}` + "입'니다";
console.log(multiLine3);
//이런 방식이 제일 최신에 합리적이다.

const sam1 = {
    name: 'Sam',
    age: 4,

};
const sam2 = {name:'sam', age:4}; //프로퍼티가 완전히 똑같아도 sam1과는 서로 다른 객체.
const sam3  ={
    name: "ssam",
    classification: { //이런식으로 프로퍼티 값도 객체가 될 수 있다. 객체 in 객체.
        kingdom: "Anamalia",
        class: "Mamalia",
        family: "Felidae",
    },
};
sam3.classification.family;
sam3["classification"].family;
sam3.classification["family"];
sam3[`classification`]["family"]; //모두 "Felidae"

sam3.speak = function() {
    return `Meow!`;
}; //이런식으로 객체 자체에 함수를 담을 수도 있다.
console.log(sam3.speak());
delete sam3.speak; //이렇게 delete 연산자를 쓰면 speak 함수가 삭제된다.

const s = "HeLlO";
s.toLowerCase();
console.log(s);
console.log(s.toUpperCase()); //임시적인 String객체를 만든 것이다. 함수 호출후 즉시 임시객체를 파괴함.
console.log(s);

let a1 = [1,2,3,4] ;
let a2 = [1, "two", 3, null];
let a3 = [
    "What the f? what the ff?",
    "U r the Worst",
    "Dare its deadly terors clasp?",
];
const a4 = [
    {
        name: "Ruby",
        hardness:9
    },
    {
        name: "Topaz",
        hardness:8
    },

];
const a5 = [
    [1,2,5],
    [2,4,6],
];
console.log(a1.length); //length는 여기서도 먹힌다.
console.log(a3[1]); //이러면 "U r the Worst"가 나올 것이다.
console.log(a2[a2.length-1]); //배열은 0부터 시작, 마지막 index는 length-1 === null 저장된 게 나온다.(undefined면 로직 잘못된거.)
a4[2] = 4;


console.log(sadfdsdsfa);

