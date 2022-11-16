package exam.lesson.musicapp.Service;
import exam.lesson.musicapp.Model.QuangCao;
import java.util.List;
import retrofit2.Call;
import  retrofit2.http.GET;
public interface DataService {
    @GET("Server/songbanner.php")
    Call<List<QuangCao>>GetDataBanner();
}
