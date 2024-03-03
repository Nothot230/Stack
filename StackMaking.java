import java.util.Stack;

public class StackMaking {
    public static void main(String[] args){
        ///Stack is LIFO or Reverse version of Array
        Stack<String> st = new Stack();
        Stack<Integer> st1 = new Stack();
        st.push("mango");
        st.push("horse");
        st.push("apple");
        st.push("dog");
        System.out.println(st);///เรียกดูค่าทั้งหมดใน Stack
        System.out.println(st.peek());///เรียกดูค่าบนสุดใน Stack
        System.out.println(st.search("dog"));/// หาค่าที่ต้องการจะได้ออกมาเป็นลำดับใน Stack
        System.out.println(st.contains("horse"));/// เช็คตรวจสอบว่าในStack มีค่าที่ต้องการหรือไม่
        System.out.println(st.contains("cat"));

        System.out.println("///////////////////////////////////////////////////");

        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        System.out.println(st1);///เรียกดูค่าทั้งหมดใน Stack
        System.out.println(st1.peek());///เรียกดูค่าบนสุดใน Stack
        System.out.println(st1.search(2));/// หาค่าที่ต้องการจะได้ออกมาเป็นลำดับใน Stack
        System.out.println(st1.contains(2));/// เช็คตรวจสอบว่าในStack มีค่าที่ต้องการหรือไม่
        System.out.println(st1.contains(6));
    }
}
