/**
 * 04. 반복문
 * 초보 프로그래머에게는 종종 레시피를 따라 하라.
 * 
 * block statement는 엄밀히 말해 제어문은 아님,
 * 그러나 제어문과 함께 쓰인다.
 * {//블록문 시작
 *   ㅁㅁㅁ
 *    
 *   
 * }//블록문 끝
 * 블록문은 제어문과 함께 쓸 때 유용해짐
 * while문에서 실행된 루프는 블록문 전체를 실행한 후 조건을 다시 테스트
 * 
 * 
 */

 //m 이상 n 이하의 무작위 정수를 반환한다.
 function rand(m,n){
     return m + Math.floor((n-m+1) * Math.random());
 }
 //크라운 앤 앵커 게임의 여섯 가지 도형중 하나를 무작위 반환.
 function randFace() {
     return [
         "crown",
         "anchor",
         "heart",
         "spade",
         "club",
         "diamond"
     ][rand(0,5)];
 }

 let funds = 50;

 while(1<funds && funds<100){
     funds = funds +2; //2보 전진
     //funds = funds -1; //1보 후퇴
     
     //돈을 건다

     //주사위 롤링
     

     //if 그림 맟추면, then 돈을 가져오기

 }

 const bets = {
     crown:0,
     anchor:0,
     heart:0,
     spade:0,
     diamond:0,
     club:0
 };
 let totalBet = rand(1,funds);
 if(totalBet === 7){
     totalBet = funds;
     bets.heart = totalBet;
 }
 else{
     //그 판에 걸 돈을 분배한다.

 }
 funds = funds - totalBet;
 
function rand(m,n){

    let g= m + Math.floor((n-m+1));
    console.log(g);
    return g;
}
rand(1,6);