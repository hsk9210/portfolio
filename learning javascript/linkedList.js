class Node {

    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {

    constructor() {
        this.head = null;
        this.tail = null;
        this._size = 0;
    }

    addToTail(value) {

        let newNode = new Node; //노드에는 value,next가 포함.
        newNode.value = value; //이러면 파라미터 value가 생성한 노드에 들어간다.
        this._size++;

        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

    }
    getNodeAt(index) {
        let idx2 = 0;
        let currentNode = this.head;
        if (index >= this._size) {
            return undefined;
        }
        while (currentNode) {
            if (idx2 === index) {
                return currentNode;
            }
            currentNode = currentNode.next;
            idx2++;
        }

        /*
        for (let i = 0; i < this._size; i++) {
            getNode = getNode.next;
        }
        return getNode;
        */
    }
    remove(value) {
        //방법 변경. 현재 노드만 필요한 것이 아니라...
        //이전 노드를 잡을 변수까지 '2'콩 개가 필요.
        let current = this.head;
        let previous;
        if (current.value === value) {
            this.head = current.next;
        } else {
            while (current.value !== value) {
                previous = current;
                current = current.next;
            }
            //결과적으로, previous에서 next.next이중참조하느니
            //현재 노드를 잡고 이전 노드로 이동하는게 나았던 것이다...
            previous.next = current.next;
        }
        this._size--;
    }

    contains(value) {
        let currentNode = value;
        while (currentNode.value !== null) {
            if (currentNode.node = value) {
                return true;
            }
            return false;
        }

    }

    //by urClass,
    //주어진 값의 인덱스를 반환한다. 없을 경우 -1.
    //그렇다면... 앞의 contains(val) 함수는 연결리스트에 주어진 값을 가지는
    //노드가 있냐를 확인하는 함수이니 이용한다면,
    // 반복문( ~ val이 null까지 가는동안){ xxx.conatins(val) 이 true면, next인덱스를 반환한다.}
    indexOf(value) {
        let value1 = value;
        while (value1 !== null) {
            //if(currentNode.node = value)
            if (this.contains(value1) === true) {
                return this.next;
            }
        }
        return -1;
    }

    size() {
        return this._size;
    }



}
let linkedList1 = new LinkedList();
linkedList1.addToTail(4);
linkedList1.addToTail(5);
console.log(linkedList1.getNodeAt(0).value);
linkedList1.remove(4);
console.log(linkedList1.getNodeAt(0).value);


linkedList.addToTail(4);
linkedList.addToTail(5);
linkedList.remove(4);
linkedList.contains(4); //false

linkedList.addToTail(5);
linkedList.addToTail(6);
linkedList.addToTail(7);
linkedList.addToTail(8);
linkedList.remove(7);
linkedList.size().toEqual(3);
