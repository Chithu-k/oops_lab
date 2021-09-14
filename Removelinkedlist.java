import java.util.*;
import java.io.*;
public class Removelinkedlist
{
 public static void main(String[] args) {
 LinkedList<String> l_list = new LinkedList<String>();
 l_list.add("This");
 l_list.add("is");
 l_list.add("java");
 l_list.add("programming");
 l_list.add("language");
 System.out.println("The Original linked list: " + l_list);
 l_list.clear();
 System.out.println("The New linked list: " + l_list);
 }
}