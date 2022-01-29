import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

class TernaryHeap {
    
	private int d;
	private int heapSize;
	private int[] heap;

	public TernaryHeap(int capacity,int d) {
        heapSize = 0;
        this.d=d;
		heap = new int[capacity + 1];
		Arrays.fill(heap, Integer.MIN_VALUE);
	}

	public boolean isEmpty() {
		return heapSize == 0;
    }
    
    public boolean getSize(){
        return heapSize;
    }

	public boolean isFull() {
		return heapSize == heap.length;
	}

	public void clear() {
		heapSize = 0;
	}

	private int parent(int i) {
		return (i - 1) / d;
	}

	private int kthChild(int i, int k) {
		return d * i + k;
	}

	public void insert(int x) {
		if (isFull())
			throw new NoSuchElementException("Overflow Exception");
		heap[heapSize++] = x;
		heapifyUp(heapSize - 1);
	}

	public int findMin() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return heap[0];
	}

	public int delete(int ind) {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		int keyItem = heap[ind];
		heap[ind] = heap[heapSize - 1];
		heapSize--;
		heapifyDown(ind);
		return keyItem;
	}

	private void heapifyUp(int childInd) {
		int tmp = heap[childInd];
		while (childInd > 0 && tmp < heap[parent(childInd)]) {
			heap[childInd] = heap[parent(childInd)];
			childInd = parent(childInd);
		}
		heap[childInd] = tmp;
	}

	private void heapifyDown(int ind) {
		int child;
		int tmp = heap[ind];
		while (kthChild(ind, 1) < heapSize) {
			child = minChild(ind);
			if (heap[child] < tmp)
				heap[ind] = heap[child];
			else
				break;
			ind = child;
		}
		heap[ind] = tmp;
	}

	private int minChild(int ind) {
		int bestChild = kthChild(ind, 1);
		int k = 2;
		int pos = kthChild(ind, k);
		while ((k <= d) && (pos < heapSize)) {
			if (heap[pos] < heap[bestChild])
				bestChild = pos;
			pos = kthChild(ind, k++);
		}
		return bestChild;
	}

	public void printHeap() {
		System.out.print("\nHeap = ");
		for (int i = 0; i < heapSize; i++)
			System.out.print(heap[i] + " ");
		System.out.println();
    }
    
    public void dump() {
        int height = log3(this.heapSize + 1);

        for (int i = 1, len = this.heapSize; i < len; i++) {
            int x = heap[i];
            int level = log3(i) + 1;
            int spaces = (height - level + 1) * 3;

            System.out.print(stringOfSize(spaces, ' '));
            System.out.print(x);

            if((int)Math.pow(2, level) - 1 == i) System.out.println();
        }
    }

    private String stringOfSize(int size, char ch) {
        char[] a = new char[size];
        Arrays.fill(a, ch);
        return new String(a);
    }

    // log with base 3
    private int log3(int x) {
        return (int)(Math.log(x) / Math.log(3)); // = log(x) with base 10 / log(3) with base 10
    }

    public static int[] heapSort(int[] arr)
    {
        TernaryHeap x=new TernaryHeap(arr.length,3);
        for (int i : arr) {
            x.insert(i);
        }
        x.printHeap();
        int[] a=new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            a[i]=x.findMin();
            x.delete(0);
        }
        return a;
    }

    public static void main(String[] args) {
        HashSet<Integer> arr=new HashSet<>();
        int a[]=new int[10];
        while(arr.size()<a.length){
            int x=(int) (Math.random()*100);
            System.out.println(x);
            if(!arr.contains(x))
                {
                    a[arr.size()]=x;
                    arr.add(x);
        }}
        a=TernaryHeap.heapSort(a);
        for (int i : a) {
            System.out.println(i+"\t");
        }
    }

}


