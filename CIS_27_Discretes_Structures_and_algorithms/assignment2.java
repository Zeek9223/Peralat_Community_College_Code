public class assignment2 {
    DoubleNode head,tail;
    class DoubleNode {
        DoubleNode before,after;
        Character data;
        DoubleNode(){
            this(null,null,null);
        }
        DoubleNode(Character data){
            this(null,null,data);
        }
        DoubleNode(DoubleNode before,DoubleNode after, Character data){
            this.before=before;
            this.after=after;
            this.data=data;
        }
        public boolean hasNext(){
            return after!=null;
        }
        public boolean hasPrevious(){
            return before!=null;
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
            x=x.after;
        }
        System.out.println();
    }

    public void insert(Character node,Character data,boolean before)
    {
        DoubleNode x=head;
        boolean found=false;
        while(x!=null && !found)
        {
            if(x.data==node)
            {
                found=true;
                if(before){
                    DoubleNode a=x.before,b=new DoubleNode(x.before,x,data);
                    if(a!=null)
                        a.after=b;
                    else
                        head=b;
                    if(x!=null)
                        x.before=b;
                }
                else{
                    DoubleNode a=x.after,b=new DoubleNode(x,x.after,data);
                    if(a!=null)
                        a.before=b;
                    else
                        tail=b;
                    if(x!=null)
                        x.after=b;
                }
            }
            x=x.after;
        }
        //System.out.println(found);
        if(!found){
            insert(tail.data, data, false);
        }
    }
    public void remove(Character node){
        DoubleNode x=head,a,b;
        while(x!=null)
        {
            if(x.data==node)
            {
                a=x.after;
                b=x.before;
                if(b!=null)
                    b.after=a;
                else
                    head=a;
                if(a!=null)
                    a.before=b;
                else
                    tail=b;
                break;
            }
            x=x.after;
        }
    }
    public void move(Character node,boolean front){
        remove(node);
        if(front){
            insert(head.data, node, true);
        }
        else{
            insert(tail.data, node, false);
        }
    }
    public static void main(String[] args) {
        assignment2 obj=new assignment2();
        obj.head=obj.new DoubleNode('C');
        obj.insert(obj.head.data, 'O', false);
        //obj.tail=obj.head.after;
        obj.insert(obj.tail.data, 'M', false);
        obj.insert(obj.tail.data, 'P', false);
        obj.insert(obj.tail.data, 'U', false);
        obj.insert(obj.tail.data, 'T', false);
        obj.insert(obj.tail.data, 'E', false);
        obj.printContents();
        obj.insert(obj.head.data, 'M', true);
        obj.printContents();
        obj.insert(obj.tail.data, 'R', false);
        obj.printContents();
        obj.remove(obj.head.data);
        obj.printContents();
        obj.remove(obj.tail.data);
        obj.printContents();
        obj.insert('P', 'M', true);
        obj.printContents();
        obj.insert('M', 'H', true);
        obj.printContents();
        obj.insert('A', 'B', true);
        obj.printContents();
        obj.insert('P', 'C', false);
        obj.printContents();
        obj.insert('M', 'L', false);
        obj.printContents();
        obj.remove('M');
        obj.printContents();
        obj.remove('G');
        obj.printContents();
        obj.move('P', true);
        obj.printContents();
        obj.move('L', false);
        obj.printContents();
    }
}


