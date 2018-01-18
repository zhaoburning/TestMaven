package com.zbn.d0508;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lianxiang on 2017/5/9.
 * java 实现阻塞队列
 */
public class BlockingQueueTest {


        private List queue = new LinkedList();
        private int  limit = 10;

        public BlockingQueueTest(int limit){
            this.limit = limit;
        }


        public synchronized void enqueue(Object item)
                throws InterruptedException  {
            while(this.queue.size() == this.limit) {
                wait();
            }
            if(this.queue.size() == 0) {
                notifyAll();
            }
            this.queue.add(item);
        }


        public synchronized Object dequeue()
                throws InterruptedException{
            while(this.queue.size() == 0){
                wait();
            }
            if(this.queue.size() == this.limit){
                notifyAll();
            }

            return this.queue.remove(0);
        }


}
