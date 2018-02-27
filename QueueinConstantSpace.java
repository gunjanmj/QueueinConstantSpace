package com.github;

public class QueueinConstantSpace {
    static int result =0;
    
	public int deque() {
		result = reverseInt(result);
		int value = result%10;
		result = result/10;
		result = reverseInt(result);
		return value;
	}
	
	private int reverseInt(int x) {
		long result=0;
        while(x!=0){
            result = result*10 + x%10;
            if(result > Integer.MAX_VALUE)
                return 0;
            if(result < Integer.MIN_VALUE)
                return 0;
            x=x/10;
        }
        
        return (int) result;
	}
	
	public void enqueue(int val) {
		result = result*10+val;
	}
	
	 /**
	 * Design queue data structure in constant space
	 * @author gunjan
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueinConstantSpace q = new QueueinConstantSpace();
		q.enqueue(1);  
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
	}

}
