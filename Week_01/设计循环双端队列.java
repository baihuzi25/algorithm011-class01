class MyCircularDeque {
    int[] arr;
    int capacity;
    int front; //表示队列队首，始终指向队列中的第一个元素（当队列空时，front==tail）
    int tail;//表示队列队尾，始终指向队列中的最后一个元素的下一个位置
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        if (k<=0) {
            throw new IllegalArgumentException ("Deque size is less than 0!");
        }else {
            capacity = k+1; // 环形队列需要一个空位判断队列为空
            this.arr = new int[capacity];
            this.front = 0;
            this.tail = 0;
        }
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }else { 
            front = (front+capacity-1)%capacity;//front向前移一位
            arr[front] = value;
       
            return true;
        }
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }else {
            arr[tail] = value;
            tail = (tail+1)%capacity;
            return true;
        }
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
          if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }

        tail = (tail + capacity - 1) % capacity;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[(tail + capacity -1)%capacity];

    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return tail == front;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if ((tail+1)%capacity == front) {
            return true;
        }else {
            return false;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */