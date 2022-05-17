package collection;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.junit.runners.Parameterized;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MyLinkedListTest {
    private MyLinkedList<String> myLinkedList=new MyLinkedList<>();
    private static LinkedList<String> linkedList=new LinkedList<>();
    @BeforeAll
    static void messeg(){
        System.out.println("Tests start");
        linkedList.add("Hello");
        linkedList.add("Hello1");
        linkedList.add("Hello2");
        linkedList.add("Hello3");
    }
    @Test
    @DisplayName("add and get hello")
    @Order(1)
    void testaddfirst() {
            myLinkedList.add("Hello");
            myLinkedList.add("Hello1");
            myLinkedList.add("Hello2");
            myLinkedList.add("Hello3");
            assertAll("test",
                    ()->assertEquals(myLinkedList.get(0),"Hello"),
                    ()->assertEquals(myLinkedList.get(1),"Hello1"),
                    ()->assertEquals(myLinkedList.get(2),"Hello2"),
                    ()->assertEquals(myLinkedList.get(3),"Hello3")
            );
    }
    @Test
    @DisplayName("size")
    @Order(2)
    void testsize(){
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        assertEquals(myLinkedList.size(),4);
    }
    @Test
    @Order(3)
    @DisplayName("remove")
    void testremov(){
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        myLinkedList.remove(1);
        assertAll("remov",
                ()->assertEquals(myLinkedList.get(1),"Hello2"),
                ()->assertEquals(myLinkedList.size(),3)
        );
    }
    @Test
    @Order(4)
    @DisplayName("insert")
    void testinsert(){
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        myLinkedList.add(1,"InsertHello");
        assertAll("insert",
                ()->assertEquals(myLinkedList.get(1),"InsertHello"),
                ()->assertEquals(myLinkedList.size(),5)
        );
    }
    @Test
    @Order(5)
    @DisplayName("indexof")
    void testindex(){
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        assertEquals(myLinkedList.indexOf("Hello2"),2);
    }
    @Test
    @Order(6)
    @DisplayName("set")
    void testset(){
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        myLinkedList.set(2,"SetHello");
        assertEquals(myLinkedList.get(2),"SetHello");
    }
    @Test
    @Order(7)
    @DisplayName("toarray")
    void testtoarray(){
        boolean tets=true;
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        Object[] res=myLinkedList.toArray();
        String[] etalonres=new String[]{"Hello","Hello1","Hello2","Hello3"};
        String[] nextres=myLinkedList.toArray( new String[1]);
        if(res.length==etalonres.length&&nextres.length==etalonres.length) {
            for (int i = 0; i <= res.length-1; i++) {
                if (!res[i].equals(etalonres[i])&&!nextres[i].equals(etalonres[i])){
                    tets=false;
                    break;
                }

            }
        }else tets=false;
        assertEquals(true,tets);
    }
    @Test
    @Order(8)
    @DisplayName("clear")
    void testclear(){
        myLinkedList.add("Hello");
        myLinkedList.add("Hello1");
        myLinkedList.add("Hello2");
        myLinkedList.add("Hello3");
        myLinkedList.clear();
        assertEquals(myLinkedList.size(),0);
    }
}