// https://leetcode.com/problems/design-browser-history/
/* 
You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
*/
public class DesignBrowserHistory {
    
}
class Node{
    String url;
    Node next;
    Node prev;
    Node(String data)
    {
        this.url = data;
    }
}
class BrowserHistory {
    Node curr;
    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.prev = curr;
        curr.next = newNode;
        curr = newNode;
    }
    
    public String back(int steps) {
        while(steps-- >0)
        {
            if(curr.prev==null) break;
            curr = curr.prev;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while(steps-- >0)
        {
            if(curr.next==null) break;
            curr = curr.next;
        }
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */