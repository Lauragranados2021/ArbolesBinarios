package Logica;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
private BinaryTree<Integer> bts;

void setUp(){
    bts=new BinaryTree<>((numeOne,numeTwo)->Integer.compare(numeOne,numeTwo));
    bts.addNode(50);
    bts.addNode(10);
    bts.addNode(69);
    bts.addNode(5);
    bts.addNode(34);
    bts.addNode(67);
    bts.addNode(18);
    bts.addNode(40);
    bts.addNode(63);
}
    @org.junit.jupiter.api.Test
    public void listPresort() {

setUp();
assertEquals(9,bts.listPresort().size());
    assertEquals(5,bts.listPresort().get(2));
        assertEquals(63,bts.listPresort().get(8));
        assertEquals(50,bts.listPresort().get(0));
}
@Test
    void ListInsort(){
    setUp();
    assertEquals(5,bts.listInsort().get(0));
    assertEquals(69,bts.listInsort().get(8));
    assertEquals(40,bts.listInsort().get(4));
  bts.listInsort().forEach(num->System.out.println(num));
}
@Test
    void testFindNode(){
    setUp();
    assertNotNull(bts.findNode(50));
    assertNotNull(bts.findNode(5));
    assertNotNull(bts.findNode(63));
}
    @Test
    void ListPosSort(){
        setUp();
        assertEquals(5,bts.listPosSort().get(0));
        assertEquals(69,bts.listPosSort().get(7));
        assertEquals(40,bts.listInsort().get(2));
        bts.listInsort().forEach(num->System.out.println(num));
    }
}