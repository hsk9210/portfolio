class Queue {
    constructor() {
        this.storage = {};
        this.front = 0;
        this.rear = 0;
    }

    size() {
        if (this.front > this.rear) {
            return 0;
        }
        else {
            return (this.rear - this.front);
        }
    }

    enqueue(element) {
        this.storage[this.front] = element;
        this.rear++;
    }

    dequeue() {
        return this.storage[--this.front];
    }
}

let queue;
queue = new Queue();

//아무것도 없으면, size ===0
console.log(queue.size());

queue.enqueue('a');
queue.enqueue('b');
queue.dequeue();
console.log(queue.size()); //1이 되어야 한다.


