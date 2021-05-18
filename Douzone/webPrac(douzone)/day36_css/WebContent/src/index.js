import "./styles.scss";

document.getElementById("app").innerHTML = `
<h1>Hello Vanilla!</h1>
<div>
  We use the same configuration as Parcel to bundle this sandbox, you can find more
  info about Parcel 
  <a href="https://parceljs.org" target="_blank" rel="noopener noreferrer">here</a>.
</div>
`;

let chanmin = {
  name: "chanmin",
  age: 24
};
let admin = chanmin;
console.log(admin.name);

for (let index = 0; index < 5 /*array.length*/; index++) {
  //let a[] = document.querySelector(hero+${`index`});
  //const element = array[index];
}

//상황을 가정해보자. 우선 다음과 같이 전화번호부 객체가 구현되어있는 상태이다.
function PhoneBook() {
  this.dictionary = {
    아나: "01012341234",
    애쉬: "01023456789",
    바스뭐시기: "01077777777",
    "디바(?)": "010-0000-0000",
    "맥크리?": "010-1111-0000",
    "라인하르트?": "010-0000-2222",
    "햄스터?": "010-3333-0000"
  };
}

PhoneBook.prototype.get = function (name, callback) {
  var self = this;
  setTimeout(() => {
    callback(self.dictionary[name]);
  }, 3000);
};

/**
 * 이 전화번호부 클래스의 get()이 호출될 때마다, 조회수를 따로 기록하여 저장하고 싶다면 어떡해야 할까? 전화번호부 클래스의 코드를 고치는 것은 예상치못한 사이드 이펙트를 초래할 수 있기 때문에 지양하고 싶다.
 */
//이런 경우에 프록시 패턴을 사용.
function PhoneBookProxy() {
  var phoneBook = new PhoneBook();
  var viewCount = 0;

  return {
    get: function (name, callback) {
      viewCount++;
      phoneBook.get(name, callback);
    },

    getViewCount: () => {
      return viewCount;
    }
  };
}
/**
 * 위와 같이 프록시 객체를 구현해서 조회수를 따로 저장하고 PhoneBook을 대리하는 객체로 PhoneBookProxy를 사용하면 된다.
 *  이 때 프록시 클래스는 공개된 인터페이스인 get()메소드를 반드시 구현해야 한다.
 */

class PhoneBook2 {
  constructor() {
    this.dictionary = {
      아나: "01012341234",
      애쉬: "01023456789",
      바스뭐시기: "01077777777",
      "디바(?)": "010-0000-0000",
      "맥크리?": "010-1111-0000",
      "라인하르트?": "010-0000-2222",
      "햄스터?": "010-3333-0000"
    };
  }
  get(name, callback) {
    let self = this;
    setTimeout(() => {
      callback(self.dictionary[name]);
    }, 1000);
  }
}
class PhoneBookProxy2 {
  constructor() {
    this.phoneBook = new PhoneBook2();
    this.viewCount = 0;
  }
  // let phoneBook = new PhoneBook2();
  // let viewCount = 0;

  get(name, callback) {
    this.viewCount++;
    this.phoneBook.get(name, callback);
  }
  getViewCount() {
    return this.viewCount;
  }
}

/**
  * Proxy for Caching
위의 PhoneBook 객체는 하나의 전화번호를 얻기 위해서는 무려 3초를 기다려야 한다. 
따라서 캐시를 이용해 좀 더 빠르게 해볼 수 있을 것이다. 이 때도 프록시 패턴을 활용할 수 있다.
  */

function PhoneBookProxy3() {
  var phoneBook = new PhoneBook();
  var viewCount = 0;
  var cache = {};

  return {
    get: function (name, callback) {
      viewCount++;

      if (cache[name]) {
        callback(cache[name]);
      } else {
        phoneBook.get(name, function (number) {
          cache[name] = number;
          callback(number);
        });
      }
    },

    getViewCount: function () {
      return viewCount;
    }
  };
}

/**
 * 아까 만든 프록시 객체에 캐시를 저장하는 변수를 추가하고, get() 메소드에 캐시를 검사하는 로직만 추가하면 된다. 프록시 객체를 통해서 get()을 호출하면 2번째 요청부터는 캐시로부터 데이터를 반환할 수 있다.
 * 
 * 
 * $.proxy()
jQuery에서는 동명의 메소드를 구현하고 있다. jQuery의 $.proxy() 메소드는 함수 내부의 this 컨텍스트를 바꾸는 ES5의 bind()와 비슷한 동작을 한다. 실제 jQuery의 구현 코드를 보면 컨텍스트를 바꿔주는 apply()와 call()을 사용하고 있는 걸 볼 수 있다. 하지만 컨텍스트를 바꾸어 주는 것 이외에는 원래 함수에 별다른 커스터마이징을 할 수가 없다. 원래 그런 용도가 아니기 때문.
여기에서는 오히려 특정 함수의 대상이 되는 객체가 프록시 된다. 따라서 앞서 소개한 프록시 패턴과는 다른 종류라고 볼 수 있다. 물론 의미적으로 프록시라는 말은 적절하다.
 * 
 * 
 */

/**
 * let a = new PhonwBook();
 * a.get('이승민');
 * //callback개념이 어려우면 제네릭을 대입한다고 생각하시면 이해가 되실 겁니다.
 * a.get('이승민',alert);
 */

let a = PhoneBookProxy();
function proxy_example_click(input) {
  a.get(input, alert);
}

let imgBtn = document.getElementById("overwatchLogo");
imgBtn.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`맥크리?`);
});

function proxy_example_click2() {
  return `관리자모드: 클라이언트의 영웅 pick 횟수 = ` + `${a.getViewCount()}`;
}

let imgBtn2 = document.getElementById("overwatchLogo2");
imgBtn2.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  console.log(proxy_example_click2());
});

let imgBtn3 = document.getElementById("디바(?)");
imgBtn3.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`디바(?)`);
});

let imgBtn4 = document.getElementById("햄스터?");
imgBtn4.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`햄스터?`);
});

let imgBtn5 = document.getElementById("맥크리?");
imgBtn5.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`맥크리?`);
});

let imgBtn6 = document.getElementById("아나");
imgBtn5.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`아나`);
});

let imgBtn7 = document.getElementById("애쉬");
imgBtn5.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`애쉬`);
});

let imgBtn8 = document.getElementById("바스뭐시기");
imgBtn5.addEventListener("click", () => {
  //proxy_example_click(`아나`);
  proxy_example_click(`바스뭐시기`);
});
