class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {

        //queue so that each object have its queue that counts its timer
        queue = new ArrayDeque<Integer>();
    }
    
    public int ping(int t) {
        //now we need to add t in queue 
        this.queue.offer(t);

        //check and remove elements if t-front of queue > 3000
        while(t -this.queue.peek() > 3000 && this.queue.size() > 0){
            this.queue.poll();
        }
        //return the size of queue
        return this.queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */