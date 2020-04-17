package hello;

public class SingleLinkedlist {
    public static void main(String[] args) {
        HeroNode head = new HeroNode(23,"qqq","www");
        HeroNode temp = head;
        System.out.println(head);
//        if(temp.next == null){
//            System.out.println("111");
//        }else{
//            System.out.println("222");
//        }
    }

}
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;
    public HeroNode(int no,String name,String nickname){
        this.name=name;
        this.nickname=nickname;
        this.no=no;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", next=" + next +
                '}';
    }
}
//测试类中定义对象且没有赋值