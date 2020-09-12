const rockPaperScissors = function () {
  // TODO: Your code here!
  //전략1. 이중 or 3중 for 문으로 rock, paper, scissors를 배열 안의 배열로
  //리턴시킨다.
  let a = 'rock';
  let b = 'paper';
  let c = 'scissors';
  let array = ['rock', 'paper', 'scissors'];
  let answer = Array.from(Array(3), () => new Array(3));
  /*
  [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
  ];
  */
  //new Array(3);

  /*
  for (let j = 0; j < answer.length; j++) {
    answer[j] = new Array(3);
  }
  */

  //console.log(answer);

  for (let i = 0; i < 9; i++) {
    for (let k = 0; k < array.length; k++) {
      //answer[j] = array[i][j];
      let d = array[k];
      answer[k].push(d);
      //console.log(answer[i][k]);

    }
  }
  return answer;
};
console.log(rockPaperScissors());


/**
 * english
 * 한국어
 * 일단 왜 한글이 안쳐진 한다???
 * 요시.....
 */