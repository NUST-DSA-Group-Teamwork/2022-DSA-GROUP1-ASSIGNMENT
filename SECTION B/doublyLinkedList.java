public class doublyLinkedList {
    /**********____________FIRST: Inttialize the head and tail_______________******************************************/
    doublyNode head;
    doublyNode tail;
    int size; /*WIll be necessary for functions such as traversing, searching, inserting and deleting of nodes*/
    /***************************______________________________________________*****************************************/

    /*****A method to create a doubly linked list*******/
    public doublyNode createDoublyLL(String nodeValue) {
        head = new doublyNode();
        doublyNode newNode = new doublyNode();
        newNode.song = nodeValue;

        /**********Adress of next and previous are set to null cause we only have one node*********/
        newNode.next = null;
        newNode.prev = null;

        /*Create a link between head and newNode and tail and newNode*/
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
        /***********_________________________________************/
    }

    /***********a method for inserting a new node in DLL************/
    public void insertSong(String nodeValue /*because in doublyNode class, type of value is int*/, int location /*this will represent the index of the node*/) {
        doublyNode newNode = new doublyNode();
        newNode.song = nodeValue;

        if (head == null) {//if doubly LL is empty, add node to it
           createDoublyLL(nodeValue);
           return;
        } else if (location == 0) {//insertion at beginning
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {//insertion at end
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {//insertion at a specified location
            doublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;//increase size of doubly LL every time you insert a song
    }
    /***********_________________________________************/

    /***********a method to play a song************/
    void playSong () {
        //Traverse through doubly linked list to play songs
        if (head != null) {//this means doubly LL exists, we can traverse through it
            doublyNode tempNode = head;
            //loop through the playlist
            for (int i = 0; i < size; i++) {
                System.out.println("Song playing: " + tempNode.song);
                if (i != size - 1) {//means if we had not reached end of last node
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;//goes to next node
            }
        } else {//playlist does not exists.
            System.out.print("Playlist does not exist!");
        }
    }
    /***********_________________________________************/

    /***********a method for searching a song************/
    public boolean searchSong (String nodeValue) {
        if (head != null) {//means doubly LL is not empty and we can look for song through it
            doublyNode tempNode = head;

            for (int i = 0; i < size; i++) {
                if (tempNode.song == nodeValue) {
                    System.out.println("Song " + tempNode.song + " found!\n");
                    return true;
                }
                tempNode = tempNode.next;//if song is not found at above node, go to next node.
            }
        }
        System.out.println("Song does not exist!\n");//if song cannot be found in doubly LL, print "Song does not exist!".
        return false;
    }
    /***********_________________________________************/

    /***********a method for removing a song************/
    public void removeSong(int location) {
        if (head == null) {
            System.out.println("The Playlist does not exist!\n");
            return;
        } else if (location == 0) {
            if (size == 1) {//there is only one song in the playlist
                head = null;
                tail = null;
                size--;
                return;
            } else {//Removes song at beginning
                doublyNode tempNode = head;
                System.out.println("Song " + tempNode.song + " removed!\n");
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {//remove song at end doubly LL
            doublyNode tempNode = tail.prev;
            System.out.println("Song " + tempNode.song + " removed!\n");
            if (size == 1) {//there is only one song in the playlist
                head = null;
                tail = null;
                size--;
                return;
            } else {
                System.out.println("Song " + tempNode.song + " removed!\n");
                tempNode.next = null;
                tail = tempNode;
                size--;

            }
        } else {//removes song at any given location
            doublyNode tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            System.out.println("Song " + tempNode.song + " removed!\n");
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }
    /***********_________________________________************/
}
