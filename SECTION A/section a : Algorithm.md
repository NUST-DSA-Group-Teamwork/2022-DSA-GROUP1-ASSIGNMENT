SECTION A - ALGORITHM DESIGN


# initialise doublyNode class with the three parts of a doubly Linked List: node, next address, previous address
doublyNode CLASS

  declare public string variable song

  declare public doublyNode next

  declare public doublyNode prev
  
END CLASS

# initialise the doublyLinkedList class with all the functions/methods needed for the functionalities: create doubly linked list for playlist, add song, remove song, search song, traverse song
doublyLinkedList CLASS 

  declare doublyNode head

  declare doublyNode tail

  declare integer size variable to be used functions such as traversing, searching, inserting and deleting of nodes

  # function to create a doubly linked list playlist
  function createDoublyLinkedList (declare String nodeValue)
  
    head := new doublyNode()
    
    doublyNode newNode := new doublyNode()
    
    newNode.song := nodeValue
    
    newNode.next := null
    
    newNode.prev := null

    head := newNode
    
    tail := newNode
    
    size := 1
    
    return head value
  
  END FUNCTION
  
  # function to insert a song into the doubly linked playlist
  function insertSong (declare string nodeValue, declare integer locationOfNode)
    
    doublyNode newNode := new doublyNode()
    
    newNode.song := nodeValue

  IF head is equal to null then
  
       createDoublyLL(nodeValue)
       
       RETURN
       
  ELSE IF location is equal to 0 THEN
  
        newNode.next := head
        
        newNode.prev := null
        
        head.prev := newNode
        
        head := newNode
        
    ELSE IF locationOfNode is greater than or equal to size THEN
    
        newNode.next := null
        
        tail.next := newNode
        
        newNode.prev := tail
        
        tail := newNode
        
    ELSE
    
        doublyNode tempNode := head
        
        integer index := 0
        
        WHILE index is less than locationOfNode minus 1 DO
        
            tempNode := tempNode.next
            
            INCREMENT index variable
            
        END WHILE
        
        newNode.prev := tempNode
        
        newNode.next := tempNode.next
        
        tempNode.next := newNode
        
        newNode.next.prev := newNode
        
    END IF
    
    INCREMENT size
    
  END FUNCTION
  
  # function to playing songs
  function playSong ()
    
    IF head does not equal null THEN
    
        doublyNode tempNode := head
        
        FOR integer i := 0 to less than size DO
        
            PLAY tempNode.song

            tempNode := tempNode.next
            
        END FOR
        
    ELSE
    
        PRINT "Playlist does not exist!"
        
    END IF
    
  END FUNCTION
  
  # function to search for a song
  function searchSong (declare string nodeValue)
    
    IF head does not equal null THEN
    
      doublyNode tempNode := head

      FOR integer i := 0 to less than size DO
      
          IF tempNode.song is equal to nodeValue THEN
          
              DISPLAY tempNode.song
              
              RETURN true
              
          END IF
          
          tempNode := tempNode.next
          
      END FOR
      
     END IF
     
     PRINT "Song does not exist!"
     
     RETURN false;
    
  END FUNCTION
  
  # function to remove a song from the playlist
  function (declare integer locationOfNode)
    
    IF head is equal to null THEN
      
      PRINT "Playlist does not exist!"
      
      RETURN
      
    ELSE IF locationOfNode is equal to 0 THEN
      
      IF size is equal to 1 THEN
        
        head := null
        
        tail := null
        
        DECREMENT size
        
        RETURN
        
      ELSE
        
        doublyNode tempNode := head
        
        PRINT "Song " + tempNode.song + " removed."
        
        head := head.next
        
        head.prev := null
        
        DECREMENT size
        
      END IF
      
    ELSE IF locationOfNode is greater than or equal to size THEN
      
      doublyNode tempNode := tail.prev
      
      PRINT "Song " + tempNode.song + " removed."
      
      IF size is equal to 1 THEN
        
        head := null
        
        tail := null
        
        DECREMENT size
        
        RETURN
        
      ELSE
      
        PRINT "Song " + tempNode.song + " removed."
        
        tempNode.next := null
        
        tail :=  tempNode
       
        DECREMENT size
        
      END IF
      
    ELSE
      
      doublyNode tempNode := head
      
      FOR integer := 0 to locationOfNode minus 1 DO
        
        tempNode := tempNode.next
        
      END FOR
      
      PRINT "Song " + tempNode.song + " removed."
      
      tempNode.next := tempNode.next.next
      
      tempNode.next.prev := tempNode
      
      DECREMENT size
      
    END IF
    
  END FUNCTION

END CLASS

# The Main Class will call upon the functions

Main CLASS

  doublyLinkedList playlistDLL = new doublyLinkedList();
  
    playlistDLL.createDoublyLL(song file);
    
    GET song files
    
    ADD song files into songArray
    
    FOR integer i := 0 to songArray.length DO
        playlistDLL.insertSong(songArray[i], i)
    END FOR

    playlistDLL.playSong()

    playlistDLL.searchSong("Macklemore - Thrift Shop")

    playlistDLL.removeSong(98)

END CLASS
