package datastructures;


//public accessible from everywhere
//protected accessible from class of same package and subclasses in any package
//default can only be accessible from class of same package
//private accessible within the same class only

//final  var to create constant var
//final method to prevent method overriding
//final classes prevent inheritance

//static allows class/var/loop accessable without creating a object

//creating an object 
class Node{
    int key;
    Node left;
    Node right;


    //initializing the objects and values 
    public Node(int key){
        this.key=key;
        left=null;
        right=null;

    }
    
}


//creating an object
class BinarySearchTree{
    Node root;

    //initializing the objects
    public BinarySearchTree(){
        root=null;
    }

    //Creating a function that adds a key value
    public void insert (int key){

        //calls another function thats private
        root= insertRecursive(root, key);

    }

    // creating a fuction from our object
    private Node insertRecursive(Node current, int key){
        
        // if nothing exist yet the function returns a node with the assigned key
        if (current ==null){
            return new Node(key);
        
        }

        //if value is less than the starter node AKA root it is placed to the left of the node
        if (key<current.key){
            current.left=insertRecursive(current.left, key);

        }

        //if value is more than the starter node AKA root it is placed to the right of the node
        else if (key> current.key){
            current.right=insertRecursive(current.right,key);

        }

        return current;
    }

    //Creating a function that tells if we have a key value
    public boolean search (int key){

        //calls a private function within the class
        return searchRecursive(root, key);

  }

    //creates a function
  private boolean searchRecursive(Node current, int key){

    if (current== null){
        return false;
    }

    if (key==current.key){
        return true;
    }

    if(key<current.key){
        return searchRecursive(current.left,key);
    }

    else{

        return searchRecursive(current.right, key);

    }
  }


  public void delete(int key){
    root=deleteRecursive(root, key);


  }

  private Node deleteRecursive(Node current, int key){

    if (current == null){
        return null;

    }
    if (key== current.key){
        if (current.left== null && current.right == null){
            return null;

        }
        if (current.left ==null){
            return current.right;

        }
        if ( current.right== null){
            return current.left;

        }

        int smallestValue = findSmallestValue (current.right);
        current.key=smallestValue;

        deleteRecursive(current.right, smallestValue);
        
        return current;

    }
    current.right=deleteRecursive(current.right, key);
        
    return current;

  }

  private int findSmallestValue(Node root){

    return root.left==null ? root.key:
    findSmallestValue(root.left);
  }

public static void main (String[] args){

}
}

//start of linked list

class LinkedList{
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    public LinkedList insert(LinkedList list, int data){
        Node new_node= new Node(data);

        if (list.head == null){
            list.head = new_node;

        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;

            }
            last.next = new_node;


    }
    return list;
}
public void printList(LinkedList list){
    Node currNode= list.head;
    System.out.print("LinkedList: ");

    while ( currNode != null){
        System.out.print(currNode.data+ " ");

        currNode=currNode.next;
    }
}

public static void main (String[] args){

}}
class Trie {
    final int Alphabet_size=26;

    class TrieNode{
        TrieNode[] children = new TrieNode[Alphabet_size];

        boolean isEndOfWord;
        TrieNode(){
            isEndOfWord = false;
            for (int i=0; i< Alphabet_size; i++){
                children[i]=null;
            }
        }}
        TrieNode root;

        public void insert (String key){
            int level;
            int length= key.length();
            int index;

            TrieNode pCrawl = root;

            for (level =0; level < length; level++){
                index = key.charAt(level) - 'a';
                if(pCrawl.children[index]==null){
                    pCrawl.children[index] = new TrieNode();

                }
                pCrawl=pCrawl.children[index];

            }
            pCrawl.isEndOfWord= true;
        }

 
        public boolean search (String key){
            int level;
            int length = key.length();
            int index;
            TrieNode pCrawl = root;

            for (level =0; level < length; level++){
                index = key.charAt(level) - 'a';
                if(pCrawl.children[index]==null){
                    return false;


                }
                pCrawl= pCrawl.children[index];

            }
            return (pCrawl.isEndOfWord);
        }

        public static void main (String[] args){

        }
    }
