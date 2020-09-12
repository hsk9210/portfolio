class TreeNode {
    constructor(value) {
        this.value = value;
        this.children = [];
    }

    insertNode(value) {
        //값이 있는지 없는지 확인하여, 값이 없다===null 이라면,
        let node = new TreeNode(value);
        if (this.value === null) {
            //노드를 넣는다... linkedList처럼 new TreeNode를 넣는 방식인가???

            //여기에 children 과 연결되는 무언가를 처리한다?
            //배열이 중첩되게. push를 써야 된다.
            this.children.push(node);
            //console.log(node);
            //push(value);
            //console.log(node.children);
        }
    }

    contains(value) { //이것은 예시. 중첩된 재귀로 찾아야 한다. children을 활용하여.
        //1. 전략수정. 이 안에다가 recursion function.을 만든다.


        if (this.value === value) {
            return true;
        }
        else {
            for (let i = 0; i < this.children.length; i++) {
                //여기다가 재귀함수를 넣는다.
                //뭘 하든, 재귀는 일단 필요하다.
                //그렇다면, children[i]에도 이 메소드 '자체'가 재귀가 가능하다면???
                if (this.children[i].contains(value)) { //아닐시, children
                    return true;
                }
                //console.log(this.children[i].contains(value));
            }
            //return false;
        }
        return false;
        /*
        let treeRecursion = function (value) {
            if (this.value === value) {
                return true;
            }
            else if (node.children.length >= 0) {
                for (let i = 0; i < this.children.length; i++) {
                    //여기다가 재귀함수를 넣는다.
                    treeRecursion(this.children[i]); //아닐시, children
                }
            }
            else {
                return false;
            }
        };
        treeRecursion(value);
        */

    }
}
let rootNode;
rootNode = new TreeNode(null);

/*
rootNode.insertNode(5);
console.log(rootNode);
console.log(rootNode.children[0]);
console.log(rootNode.children[0].value);// 5
console.log(rootNode.contains(6)); //false
*/
rootNode.children[0].insertNode(7);
rootNode.children[1].insertNode(8);
console.log(rootNode.contains(7))//.toEqual(true);
console.log(rootNode.contains(8))//.toEqual(true);