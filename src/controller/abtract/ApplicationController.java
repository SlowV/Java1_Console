package controller.abtract;

public interface ApplicationController {
    void add ();
    void printList();
    void edit(String id);
    void destroy(String id);
    void find(String id);
}
