package observer;

public interface Observer {
    void update(String videoName);
    void subscribe(Subject subject);
    String getVideoName();
}
