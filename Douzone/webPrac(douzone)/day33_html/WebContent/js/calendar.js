const date = new Date();

let year = date.getFullYear();
let month = date.getMonth();

document.querySelector(`.year`).textContent= `${year}년`;
document.querySelector(`.month`).textContent=`${month+1}월`;
//전후 날짜 계산용.
const prev = new Date(year,month,0);
const thisD = new Date(year,month+1,0);
//지난달
let lastDate = prev.getDate();
let lastDay = prev.getDay();

let toDate = thisD.getDate();
let toDay = thisD.getDay();

let prevDates = [];
let thisDates = [...Array(toDate+1).keys()].slice(1);
let nextDates = [];

//토요일이 아닌 경우 발동. 생성할 필요가 없어지니.
if(lastDay !==6){
    for(let i=0;i<lastDay+1;i++){
        prevDates.unshift(lastDate-i);
    }
}
for(let j=1;j<7-toDay;j++){
    nextDates.push(j);
}
// field fin.

let dates = prevDates.concat(thisDates,nextDates);

dates.forEach((date,i)=>{
    dates[i] = `<div class="date">${date}</div>`;
})
//join으로 합쳐서 넣는다. ''시 그대로 합침.
document.querySelector(`.dates`).innerHTML = dates.join('');