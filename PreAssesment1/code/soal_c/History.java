
public class History {
    private String url;

    public History(String url){
        this.url = url;
    }

    public String getUrl(){
        return url;
    }

    @Override
    public String toString(){
        return "Website " + url + " dibuka";
    }
}
