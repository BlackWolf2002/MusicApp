package exam.lesson.musicapp.Service;

public class APIService {
    private  static  String base_url="https://musicappprojectfinal.000webhostapp.com/";
    public static  DataService getService(){
        return APIRetrofitClient.getClient(base_url).create(DataService.class);
    }
}
