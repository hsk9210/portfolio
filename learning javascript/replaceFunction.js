/*
function replaceFoo(text){
    //foo라는 글자의 index가 -1이 아니면 단어를 찾은 것이다
    while(text.prototype.indexOf('foo') !== -1){
        let index = text.indexOf('foo');
        
    }
}
*/

function findIndexofString(text, string1){
    //1. if text.indexOf('foo') !== -1
    // finded!
    //2. return true;
    for(let i=0;i<text.length;i++){
        if(text.indexOf(`${string1}`) !== -1){
            return text.indexOf(`${string1}`);
        }
    }

}
console.log('원래문자열, 찾을 단어, 교체할단어');
function replace(text, findText, rText){
    //1. finding index of searchString in text.
    let targetIndex = findIndexofString(text, findText);

    //그 이전까지의 단어를 슬라이싱해서 잘라내어 저장해두고.
    let beforeText = text.slice(0, targetIndex);

    //교체할 단어를 입력받는다.
    let replaceText = `${rText}`;

    //교체할 단어 이후의 텍스트를 넣기위해 그 사이를 빼주고 남은 뒷부분을 가져온다.
    let afterText = text.slice(targetIndex + rText.length);
    //교체할 단어의 길이만큼 인덱스를 더 비워줘야됨.

    text = beforeText + replaceText + afterText;
    
    return text;
    
}

console.log(replace('aaaaabbbbcccc', 'bbbb', 'ffff'));
