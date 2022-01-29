class LinkedList { 
  
    DoubleNode head,tail;  // head of list 

    static class DoubleNode {
        DoubleNode prev,next;
        Character data;
        DoubleNode(){
            this(null,null,null);
        }

        DoubleNode(Character data){
            this(null,null,data);
        }
        DoubleNode(DoubleNode prev,DoubleNode next, Character data){
            this.prev=prev;
            this.next=next;
            this.data=data;
        }

        public boolean hasNext(){
            return next!=null;
        }

        public boolean hasPrevious(){
            return prev!=null;
        }
    }
  
    public void printContents()
    {
        DoubleNode x=head;
        while(x!=null)
        {
            System.out.print(x.data);
            if(x.hasNext())
            {
                System.out.print("-> ");
            }
            x=x.next;
        }
        System.out.println();
    } 
  
    // Split a doubly linked list (DLL) into 2 DLLs of 
    // half sizes 
    DoubleNode split(DoubleNode head) { 
        DoubleNode fast = head, slow = head; 
        while (fast.next != null && fast.next.next != null) { 
            fast = fast.next.next; 
            slow = slow.next; 
        } 
        DoubleNode temp = slow.next; 
        slow.next = null; 
        return temp; 
    } 
  
    DoubleNode mergeSort(DoubleNode node) { 
        if (node == null || node.next == null) { 
            return node; 
        } 
        DoubleNode second = split(node); 
  
        // Recur for left and right halves 
        node = mergeSort(node); 
        second = mergeSort(second); 
  
        // Merge the two sorted halves
        return merge(node, second);
    } 
  
    // Function to merge two linked lists 
    DoubleNode merge(DoubleNode first, DoubleNode second) { 
        // If first linked list is empty 
        if (first == null) { 
            return second; 
        } 
  
        // If second linked list is empty 
        if (second == null) { 
            return first; 
        } 
  
        // Pick the smaller value 
        if (first.data < second.data) { 
            first.next = merge(first.next, second); 
            first.next.prev = first; 
            first.prev = null; 
            return first; 
        } else { 
            second.next = merge(first, second.next); 
            second.next.prev = second; 
            second.prev = null; 
            return second; 
        } 
    } 
  
    public void insert(Character node,Character data,boolean prev)
    {
        DoubleNode x=head;
        boolean found=false;
        while(x!=null && !found)
        {
            if(x.data==node)
                {
                    found=true;
                    if(prev){
                        DoubleNode a=x.prev,b=new DoubleNode(x.prev,x,data);
                        if(a!=null)
                            a.next=b;
                        else
                            head=b;
                        if(x!=null)
                            x.prev=b;
                    }
                    else{
                        DoubleNode a=x.next,b=new DoubleNode(x,x.next,data);
                        if(a!=null)
                            a.prev=b;
                        else
                            tail=b;
                        if(x!=null)
                            x.next=b;                                               
                    }
                }
            x=x.next;
        }
        //System.out.println(found);
        if(!found){
            insert(tail.data, data, false);
        }
    }

    // Driver program to test above functions 
    public static void main(String[] args) { 
  
        LinkedList list = new LinkedList();
        list.head = new DoubleNode('M');
        list.insert(list.head.data, 'E', false);
        list.insert(list.tail.data, 'R', false);
        list.insert(list.tail.data, 'G', false);
        list.insert(list.tail.data, 'E', false);
        list.insert(list.tail.data, 'S', false);
        list.insert(list.tail.data, 'O', false);
        list.insert(list.tail.data, 'R', false);
        list.insert(list.tail.data, 'T', false);
        list.insert(list.tail.data, 'E', false);
        list.insert(list.tail.data, 'X', false);
        list.insert(list.tail.data, 'A', false);
        list.insert(list.tail.data, 'M', false);
        list.insert(list.tail.data, 'P', false);
        list.insert(list.tail.data, 'L', false);
        list.insert(list.tail.data, 'E', false);
        list.head = list.mergeSort(list.head); 
        System.out.println("Linked list after sorting :"); 
        list.printContents();
    } 
}