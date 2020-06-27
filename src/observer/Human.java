package observer;

public class Human implements Observer {
    private String videoName;
    @Override
    public void update(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public void subscribe(Subject subject) {
        subject.register(this);
    }
    @Override
    public String getVideoName() {
        return videoName;
    }
}
