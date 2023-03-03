package linkedList;
import java.util.*;
public class NodeUse {
	
	static void printRec(Node<Integer> head)
	{
		if(head==null)
			return;
		System.out.println(head.data);		//<--------A		if we want to print in reverse
			printRec(head.next);					//<--------B  	 	just reverse order of these two 
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static Node<Integer> duplicate(Node<Integer> head)
	{
		Node<Integer> n=head;
		int c=0;
		Node<Integer> prev=null;
		while(n!=null)
		{
			if(n.data==c)
				{	
				prev.next=n.next;
				}
			
			else 
			{
					c=n.data;
					prev=n;
			}
			n=n.next;
		}
		return head;
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static Node<Integer> reverse(Node<Integer> head)
	{
		Node<Integer> t=null;
		Node<Integer> prev=head;
		Node<Integer> n=head;
		while(n!=null)
		{
			t=n.next;
			if(n==head)
				n.next=null;
			else 
			{	n.next=prev;
			prev=n;
			}
			if(t==null)
				return n;
			n=t;
		}
		return n;
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static boolean isPalindrome(Node<Integer>head)
	{
		Node<Integer>n=head;
		Node<Integer>n1=head;
		int l=0;
		while(n1!=null)
			{
			n1=n1.next;
			l++;
			}
		Node<Integer>a[]=new Node[l];
		int i=0;
		while(n!=null)
		{
			a[i]=n;
			i++;
			n=n.next;
		}
		for(int j=0;j<=a.length/2;j++)
		if(a[j].data!=a[a.length-1-j].data)
			return false;
				return true;
		
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static Node<Integer> remove(Node<Integer> head,int n)
	{
		
		int l=0;
		Node<Integer> n1 = head;
		Node<Integer> n2 = head;
		while(n2!=null)
		{
			l++;
			n2=n2.next;
		}
		for(int i=0;i<=l-n;i++)
		{
			if(n1==null)
				return head;
			n1=n1.next;
		}
		Node<Integer> t =n1.next;
		n1.next=null;
		Node<Integer> t1 =t; 
		while(t.next!=null)
			t=t.next;
		t.next=head;
		System.out.println(t1.data);
		return t1;
	
		
}

	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static void insert(Node<Integer> head,int p,int v)//also deal with p=0;
	{	
		Node<Integer>	n=new Node<>(v);		
		Node<Integer> prev=head;
		Node<Integer> next=null;
		for(int i=1;i<=p-2;i++)
		{
			prev=prev.next;
		if(prev==null)
			return;
		}
		
		next=prev.next;
		prev.next=n;
		n.next=next;
		
	}

	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static Node<Integer> input()
	{
		Scanner scn = new Scanner(System.in);
		Node <Integer >head=null;
		Node <Integer >prev=null;
		int n=0;
		do {
			 n=scn.nextInt();
			if(n==-1)
				break;
			Node<Integer>current = new Node<>(n);
			if(head==null)
				head=current;
			else 
				prev.next=current;
			prev=current;
		}while(n!=-1);
		return head;
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	static int length(Node<Integer> n)
	{
		int c=0;
		while(n.data!=-1)
		{
			System.out.println(n.data);
			c++;
			n=n.next;
		}
		return c;
	}
		
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
		static void increment(Node<Integer> n)
		{	
			while(n!=null)
				{
					n.data++;
					n=n.next;
				}
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		

		static void print(Node<Integer> head)
		{
			while(head!=null)
			{
				System.out.println(head.data);
				head=head.next;
			}
		}
		
		static Node<Integer> create()
		{
			Node<Integer>n1=new Node<Integer>(10);
			Node<Integer>n2=new Node<Integer>(20);
			Node<Integer>n3=new Node<Integer>(30);
			Node<Integer>n4=new Node<Integer>(40);
			Node<Integer>n5=new Node<Integer>(-1);
			n1.next=n2;
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			return n1;
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		
//	#######################################################################################################
		
		public static void main(String[] args) 
		{
			Node<Integer>	head=input();
//			print(head);10
//			remove(head,3);
//			insert(head,5,100);
//	head=reverse(head);
//			head=duplicate(head);
			printRec(head);
//			System.out.println(isPalindrome(head));
//			System.out.println("\n"+length(head));
		}
}

