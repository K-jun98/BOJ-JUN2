import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test = Integer.parseInt(br.readLine());
        while (test-- != 0) {
            st = new StringTokenizer(br.readLine());
            Queue<Document> queue = new ArrayDeque<>();
            Queue<Integer> numQueue = new PriorityQueue<>(Collections.reverseOrder());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
               int document = Integer.parseInt(st.nextToken());
            queue.add(new Document(document,i));
            numQueue.add(document);
            }
            System.out.println(find(queue,numQueue,M));
        }
    }

    public static int find(Queue<Document> queue,Queue<Integer> numQueue,int M){
        int cnt=0;
    while(true){
        if(queue.peek().document==numQueue.peek()){
            cnt++;
            numQueue.poll();
            if(queue.poll().number==M){
                return cnt;
            }
        }else{
            queue.add(queue.poll());
        }
    }
    }
}


class Document {

    int document;
    int number;

    public Document(int document, int number) {
        this.document = document;
        this.number = number;
    }
}
