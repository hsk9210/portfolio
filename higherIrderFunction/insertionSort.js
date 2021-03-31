/**
 * JS식 삽입 정렬 ex>
 * 첫 숫자는 놔두고, 두 번째 자리 숫자부터 뽑아서 
 * 그 숫자가 첫 숫자보다 크면 첫 숫자 오른쪽에, 
 * 작으면 왼쪽에 넣습니다. 세 번째 자리 숫자를 뽑아서 
 * 앞의 두 숫자와 크기를 비교해서 알맞은 자리에 넣는 방식을 반복하여 정렬.
 */

//함수화
let insertionSort = function(array){
    let j=0, temp=0; //반복문용 인수 하나와 임시 저장 변수 선언.
    
    처
    for(let i=1;i<array.length;i++){
        temp = array[i]; //0이아닌 1번째부터 새로운 숫자를 선택한다.
        //console.log(temp);
        for(j=i-1;j>=0 && temp<array[j];j--){
            array[j+1] = array[j];
        }
        array[j+1] = temp;
    }
    return console.log(array);
}
insertionSort([5,6,1,2,4,3]);


