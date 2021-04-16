public class TestStackArray{
    public static void main (String[] args)
    {
        ArrayQueue s = new ArrayQueue();
        s.enqueue(10);
        s.enqueue(11);
        s.enqueue(12);
        while(!s.isEmpty())
        {
            System.out.println(s.queue()+"");
        }
    }
}