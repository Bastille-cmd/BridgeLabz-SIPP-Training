public class BrowserHistory {
    Node currPage;
    BrowserHistory(String data){
        Node currPage=new Node(data);
    }
    void next(String data){
        Node page=new Node(data);
        currPage.next=page;
        currPage=page;
        System.out.println(currPage.data);
    }

    void back(){
        if (currPage.prev!=null) {
            currPage = currPage.prev;
            System.out.println(currPage.data);
        }
        else System.out.println("Null");
    }

    void next(){
        if(currPage.next!=null) {
            currPage = currPage.next;
            System.out.println(currPage.data);
        }
        else System.out.println("Null");
    }
}
